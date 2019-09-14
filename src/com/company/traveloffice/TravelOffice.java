package com.company.traveloffice;

public class TravelOffice {

    Customer[] klienci;

    int klienciCounter = 0;
    int maxSize;

    public TravelOffice() {
        maxSize = 2;
        klienci = new Customer[2];
        klienciCounter = 0;
    }

    public void addCustomer(Customer c) {
        if (klienciCounter < maxSize) {
            maxSize *= 2;
            Customer[] klienci2 = new Customer[maxSize];
            for (int i = 0; i < klienci.length; i++) {
                klienci2[i] = klienci[i];
            }
            klienci = klienci2;

            klienci[klienciCounter] = c;
            klienciCounter++;

        }
    }
}