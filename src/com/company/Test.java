package com.company;

import com.company.traveloffice.Date;

public class Test {
    public static void main(String[] args) {
        Date start = new Date(2015, 7, 23);
        Date end = new Date(2017, 7, 11);
        System.out.println(start.getInfo());
        System.out.println(end.getInfo());
        Date today;
        today = start;
        System.out.println(today.getInfo());

        today.year = 2016;
        today.day = 17;

        System.out.println(today.getInfo());
        System.out.println(start.getInfo());

        end = today;
        System.out.println(end.getInfo());
    }
}
