package zadanie6_1;

import java.util.Scanner;

public class isLeapYear {
    public static void isLeapYear (int rok) {
        if (rok % 400 == 0) {
            System.out.println("przestępny");
        } else if (rok % 100 != 0 && rok % 4 == 0) {
            System.out.println("przestępny");
        } else {
            System.out.println("nieprzestępny");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // ctrl + d - to stop running
        while( scan.hasNext()) {
            int year = scan.nextInt();
            isLeapYear(year);
        }
    }

}