package com.contacts.service;

import java.io.IOException;
import java.util.Scanner;

public class MenuService {
    Scanner sc = new Scanner(System.in);
    ContactService contactService = new ContactService();

    public void showMenu(){
        System.out.println("------CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ------");
        System.out.println("Chọn chức năng theo số để tiếp tục: ");
        System.out.println("1. Xem danh sách");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập nhật");
        System.out.println("4. Xóa");
        System.out.println("5. Tìm kiếm");
        System.out.println("6. Thoát");
        System.out.println("Chọn chức năng: ");
    }

    public void continueConfirm() {
        System.out.println("Nhấn Y để tiếp tục, nhấn N để thoát.");
        String choice;
        while (true) {
            choice = sc.nextLine();
            switch (choice){
                case "Y": {
                    performContact();
                    break;
                }
                case "N": {
                    System.out.println("Thoát.");
                    System.exit(0);
                }
                default:
                    System.out.println("Bạn nhập sai ");
                    continueConfirm();
            }
        }
    }

    public void performContact(){
        String choose;
        String phoneNumber;
        while (true){
            showMenu();
            choose = sc.nextLine();
            switch (choose){
                case "1":
                    contactService.printContact();
                    continueConfirm();
                    break;
                case "2":
                    try {
                        contactService.addContact();
                        continueConfirm();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case "3":
                    System.out.println("Nhập số điện thoại: ");
                    phoneNumber = sc.nextLine();
                    try {
                        contactService.updateContact(phoneNumber);
                        continueConfirm();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case "4":
                    System.out.println("Nhập số điện thoại: ");
                    phoneNumber = sc.nextLine();
                    try {
                        contactService.deleteContact(phoneNumber);
                        continueConfirm();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case "5":
                    System.out.println("Nhập số điện thoại: ");
                    phoneNumber = sc.nextLine();
                    contactService.searchContact(phoneNumber);
                    continueConfirm();
                    break;
                case "6":
                    System.out.println("Thoát.");
                    System.exit(0);
                default:
                    System.out.println("Yêu cầu nhập lại: ");
            }
        }
    }
}
