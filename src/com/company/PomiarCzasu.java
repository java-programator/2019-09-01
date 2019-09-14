package com.company;

import java.lang.reflect.Array;
import java.util.Random;

public class PomiarCzasu {
    public static void main(String[] args) {
        int[] array = new int [500000];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(99) + 10;
        }

        long Wprowadzanie = System.nanoTime();

        int[] array2 = new int [array.length];
        for (int i = 0; i < array2.length; i++){
            array2[i] = array[i];
        }

        long Kopiowanie = System.nanoTime();

        int[] array3 = new int [array.length];
        System.arraycopy(array, 0, array3, 0, array3.length);
        for (int i = 0; i < array2.length; i++){
        }
        long Kopiowanie2ArrayCopy = System.nanoTime();

        System.out.println(Kopiowanie- Wprowadzanie);
        System.out.println(Kopiowanie2ArrayCopy -Kopiowanie);
    }
}
