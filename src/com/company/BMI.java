package com.company;

import java.util.Scanner;

public class BMI {
    static public double bmiCounter(double w, double h){
        double bmi = w/(h*h);
        return bmi;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj wagę: ");
        double weight = sc.nextDouble();
        System.out.println("Podadj wzrost w metrach: ");
        double height = sc.nextDouble();
        System.out.println(bmiCounter(weight, height));
    }
}