package com.diginsite.bbp.tool;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.diginsite.bb.payments.cdm.v1.TaxAuthorities;
import com.diginsite.bb.payments.cdm.v1.TaxAuthority;
import com.diginsite.bb.payments.cdm.v1.TaxForm;
import com.diginsite.bb.payments.cdm.v1.TaxForms;
import com.google.gson.Gson;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;


/**
 * Hello world!
 *
 */
public class App {
    public static final List<String> fiidList = Arrays.asList("00016");

//    05530
//    04051
//    05533
//    03658
//    04392
//    03463
//    05529
//    04476
//    04263
//    05538
//    03263
//    04315
//    05534
//    05523
//    05372
//    01611
    public static void main(String[] args) {
        fiidList.stream().forEach(fiId->{
            List<TaxForm> taxForms = getTaxForms(fiId);
        });
    }

    public static List<TaxForm> getTaxForms(String fiId) {
        Gson gson = new Gson();
        //authorities.getTaxAuthority().addAll(c);
        try {
            URL url = new URL("http://bbp.qal1.diginsite.net/bbpayments/v1/fis/" + fiId + "/taxauthorities");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/xml");
            conn.setRequestProperty("intuit_appid", "ServicesGatewayApp");
            conn.setRequestProperty("intuit_offeringid", "AdminPlatform");
            conn.setRequestProperty("sessionid", "348hrwe984r");
            conn.setRequestProperty("intuit_originatingIp", "127.0.0.1");
            conn.setRequestProperty("intuit_tid", "hjef874fg34fg3487f");
            conn.setRequestProperty("intuit_authid", "awrtool");
            conn.setRequestProperty("Content-Type", "application/xml");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));



            Type listType = new TypeToken<ArrayList<TaxAuthority>>(){}.getType();

            String output;
            System.out.println("Output from Server : \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);

                convertXML(output);

                //List<TaxAuthority> taxAuthorities = gson.fromJson(output, listType);
                //System.out.println(taxAuthorities);
            }
            conn.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    private static void convertXML(String xmlString){
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(TaxAuthority.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            StringReader reader = new StringReader(xmlString);
            TaxAuthority person = (TaxAuthority) unmarshaller.unmarshal(reader);
        } catch (JAXBException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
