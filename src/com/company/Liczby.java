package com.company;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Liczby {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba = 0;
        int suma = 0;

        do {
            System.out.println("Podaj liczbę");
            liczba = scanner.nextInt();
            suma += liczba;
            }
        while (liczba != 0 );
        System.out.println(suma);
    }
}

