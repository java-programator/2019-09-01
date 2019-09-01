package com.company;

import com.company.traveloffice.Date;

public class DateMain {

    public static Date today() {
        return new Date(2019, 9, 1);
    }

    public static void main(String[] args) {
        System.out.println(Date.counter);

        Date d1 = new Date(2019, 9, 1);
        System.out.println(Date.counter);
        System.out.println(d1.counter);
        Date d2 = new Date(2019, 9, 3);
        Date d3 = new Date();
        DateMain.today();
        System.out.println(d3.day);
        System.out.println(d3.month);
        System.out.println(d3.year);

        d1.setDay(4);

        System.out.println(Date.counter);
    }
}
