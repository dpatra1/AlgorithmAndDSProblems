/**
 *
 */
package com.diginsite.bbp.linklist;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dp250219
 *
 */
public class FindMinimumNumber {

    /**
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(4);
        list.add(3);
        list.add(11);
        list.add(1);
        list.add(9);
        list.add(13);

        int min = 0, cnt = 0, max = 0;
        int size = list.size();
        while (cnt < size-1) {
            if(list.get(cnt) > list.get(cnt+1)){
                min = list.get(cnt+1);
                max = list.get(cnt);
            }
            cnt++;
        }
        System.out.println("Minimum : " +min);
    }

}
