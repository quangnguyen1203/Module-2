package com.customer.service;

import com.customer.dal.CustomerDB;
import com.customer.model.Customer;

import java.io.IOException;

public class CustomerService {
    public CustomerDB customerDB = new CustomerDB();

    public void add(Customer customer) throws IOException {
        customerDB.add(customer);
        customerDB.saveFile();
    }

    public void loadData() throws IOException {
        customerDB.readFile();
    }
}
