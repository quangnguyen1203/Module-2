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
        int choose;
        while (true){
            menuService.showMenu();
            choose = sc.nextInt();
            switch (choose){
                case 1:
                    try {
                        menuService.addCustomer();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    menuService.printCustomer();
                    break;
            }
        }
    }
}
