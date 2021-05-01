package com.customer.service;

import com.customer.dal.CustomerDB;
import com.customer.model.Customer;

import java.io.IOException;
import java.util.Map;

public class CustomerService {
    public CustomerDB customerDB = new CustomerDB();

    public void add(Customer customer) throws IOException {
        customerDB.add(customer);
        customerDB.saveFile();
    }

    public void loadData() throws IOException {
        customerDB.readFile();
    }

    public void updateFile(){
        try {
            customerDB.saveFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void print(){
        for (Map.Entry<String, Customer> entry: CustomerDB.customerMap.entrySet()
             ) {
            System.out.println(entry.getValue().toString());
        }
    }

}
