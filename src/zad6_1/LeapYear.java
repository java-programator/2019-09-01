package zad6_1;

import java.util.Scanner;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else {
            if (year % 100 == 0) {
                return false;
            } else {
                if (year % 4 == 0) {
                    return true;
                } else {
                    return false;
                }

            }
        }

    }

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        while (scaner.hasNext()) {
            int year = scaner.nextInt();
            System.out.println(isLeapYear(year));
            /// test
        }

    }
}
