package com.company;

public class Date {
    static int counter = 0;

    int year;
    int month;
    int day;

    public Date(int y, int m, int d) {
        year = y;
        month = m;
        day = d;
        Date.counter = this.counter + 1;
    }

    public Date() {
        counter = counter + 1;
    }

    public void setDay(int d) {
        this.day = d;
    }

    static int countDates() {
        return counter;
    }

    public String getInfo() {
        String info = String.valueOf(year)
                + "-" + String.valueOf(month)
                + "-" + String.valueOf(day);
        return info;
    }

    public Date clone() {
        return new Date(year, month, day);
    }
}
