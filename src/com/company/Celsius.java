package com.company;
import java.util.Scanner;
public class Celsius {

    static double celsius2farenheit(double temp) {
        return 9.0/5.0*temp + 32;
    }

    static double farenheit2celsius(double temp) {
        return 5.0 / 9.0 * (temp - 32);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();
        System.out.println(celsius);
        System.out.println(celsius2farenheit(celsius));


    }
}
