package com.priorityqueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HelloComparable {

    public static void main(String args[]) {
        Bank citibank = new Bank("Citibank", 1);
        Bank icici = new Bank("ICICI", 5);
        Bank bankOfAmerica = new Bank("BankOfAmerica", 2);
        Bank dbs = new Bank("DBS", 6);
        Bank hsbc = new Bank("HSBC", 3);
        Bank scb = new Bank("Standard Charted", 4);

        List<Bank> banks = new ArrayList<Bank>();
        banks.add(citibank);
        banks.add(icici);
        banks.add(bankOfAmerica);
        banks.add(dbs);
        banks.add(hsbc);
        banks.add(scb);

        // print banks in unsorted order
        System.out.println("List of Banks in unsorted order" + banks);

        // Sort bank on their natural order, which is ranking
        Collections.sort(banks);

        // print banks in their natural order, sorted
        System.out.println("List of Banks in sorted order" + banks);
    }
}

class Bank implements Comparable<Bank> {

    private String name;
    private int ranking;

    public Bank(String name, int ranking) {
        this.name = name;
        this.ranking = ranking;
    }

    @Override
    public int compareTo(Bank bank) {
        return this.ranking - bank.ranking; // possible because ranking is small
        // positive integer
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ranking;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Bank other = (Bank) obj;
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        if (ranking != other.ranking) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return String.format("%s: %d", name, ranking);
    }

}