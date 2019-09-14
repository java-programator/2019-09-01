package com.company;

import org.w3c.dom.ls.LSOutput;

public class SumaTablicy1 {
    public static void main(String[] args) {
        int[] array= {1,2,3,4};
        int suma = 0;
        int i = 0;
        while (i < array.length) {
            suma = +array[i];
            i++;
        }
        System.out.println(suma);
    }
}
