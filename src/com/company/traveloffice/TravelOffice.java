package com.company.traveloffice;

public class TravelOffice {
    Customer customers[];
    int customersCounter;
    int maxSize;

    public TravelOffice() {
        int maxSize = 2;
        customers = new Customer[maxSize];
        customersCounter = 0;
    }

    public void addCustomer(Customer c) {
        if (customersCounter >= maxSize) {
            maxSize *= 2;
            Customer new_table[] = new Customer[maxSize];
            System.arraycopy(customers, 0, new_table, 0, customers.length );
            customers = new_table;
        }
        customers[customersCounter] = c;
        customersCounter++;
    }

}
