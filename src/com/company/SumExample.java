package com.company;

public class SumExample {
    public static int sum(int ... a) {
        int suma = 0;
        for (int element : a) {
            suma += element;
        }
        return suma;
    }

    public static void main(String[] args) {
        int s1 = sum(1,2,3);
        int s2 = sum(new int[]{1,2,4,6});
        int s3 = sum(new int[]{9,7,4,2,5,7});

        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}
