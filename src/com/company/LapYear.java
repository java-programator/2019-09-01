package com.company;

import java.security.interfaces.RSAPrivateCrtKey;
import java.util.Scanner;

public class LapYear {
    public static boolean isLeapYear(int year){
        if (year % 400 == 0) {
            System.out.println("Rok przestępny");
            return true;
        }else if(year % 4 == 0 && year %100 != 0) {
            System.out.println("Rok przestępny");
            return true;
        }
        else {
            System.out.println("Rok nieprzestępny");
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Podaj rok");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int year = scanner.nextInt();
            System.out.println(isLeapYear(year));
        }
    }
}
