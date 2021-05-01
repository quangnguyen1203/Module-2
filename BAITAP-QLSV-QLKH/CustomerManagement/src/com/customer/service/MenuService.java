package com.customer.service;

import com.customer.dal.CustomerDB;
import com.customer.model.Customer;

import java.io.IOException;
import java.util.Scanner;

public class MenuService {
    public static Scanner sc = new Scanner(System.in);
    CustomerService customerService = new CustomerService();

    public void showMenu(){
        System.out.println("Chao mung ban den voi he thong quan ly khach hang");
        System.out.println("Bam 1 de nhap khach hang");
        System.out.println("Bam 2 đe tim kiem khach hang");
        System.out.println("Bam 3 de in thong tin khach hang");
        System.out.println("Bam 4 de in toan bo danh sach khach hang");
        System.out.println("Bam 5 de tang so don hang cho khachg");
        System.out.println("Bam 0 de thoat");
    }

    public void addCustomer() throws IOException {
        System.out.println("Nhap ten: ");
        String name = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        String address = sc.nextLine();
        System.out.println("Nhap so dien thoai: ");
        String phoneNumber = sc.nextLine();
        System.out.println("Nhap email: ");
        String email = sc.nextLine();
        System.out.println("Nhap gioi tinh");
        String gender = sc.nextLine();
        Customer customer = new Customer(name,address,phoneNumber,email,gender,0);
        customerService.add(customer);
    }

    public void printCustomer(){
        customerService.print();
    }
}
