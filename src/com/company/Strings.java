package com.company;

public class Strings {
    public static void main(String[] args) {
        String zdanie = "Przykładowe Zdanie";
        String result = "";

        for (int i = zdanie.length()-1; i >= 0; i--){
            char z = zdanie.charAt(i);
            if (Character.isUpperCase(z)) {
                z = Character.toLowerCase(z);
            } else {
                z = Character.toUpperCase(z);
            }
            result += z;
            }
        System.out.println(result);
        }
    }
