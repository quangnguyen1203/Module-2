package com.customer.presentation;

import com.customer.service.CustomerService;
import com.customer.service.MenuService;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MenuService menuService = new MenuService();
        CustomerService customerService = new CustomerService();
        Scanner sc = new Scanner(System.in);
        try {
            customerService.loadData();
        } catch (IOException e) {
            e.printStackTrace();
        }
        menuService.performCustomer();
    }
}
