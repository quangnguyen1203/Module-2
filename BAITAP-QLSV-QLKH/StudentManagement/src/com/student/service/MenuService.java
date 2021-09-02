package com.student.service;

import com.student.dal.StudentDB;

import java.io.IOException;
import java.util.Scanner;

public class MenuService {
    public static Scanner sc = new Scanner(System.in);
    public static StudentService studentService = new StudentService();

    public void showMenu(){
        System.out.println("1. Xem danh sách học viên");
        System.out.println("2. Thêm học viên");
        System.out.println("3. Sửa thông tin học viên");
        System.out.println("4. Xóa học viên");
        System.out.println("5. Nhập điểm học viên");
        System.out.println("6. Sửa điểm học viên");
        System.out.println("7. Xếp loại học viên");
        System.out.println("0. Kết thúc.");
        System.out.println("*************************");
        System.out.println("Nhập để chọn: ");
    }

    public void continueConfirm() {
        System.out.println("Nhấn Y để tiếp tục, nhấn N để thoát.");
        String choice;
        while (true) {
            choice = sc.nextLine();
            switch (choice) {
                case "Y": {
                    performCustomer();
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

    public void performCustomer(){
        String choose;
        System.out.println("***********Menu***********");
        showMenu();
        int id;
        choose = sc.nextLine();
        switch (choose){
            case "1":
                studentService.print();
                continueConfirm();
                break;
            case "2":
                try {
                    studentService.addStudent();
                    continueConfirm();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case "3":
                try {
                    studentService.edit();
                    continueConfirm();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                break;
            case "4":
                try {
                    studentService.deleteStudent();
                    continueConfirm();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case "5":
                System.out.println("Nhập id học sinh cần nhập điểm: ");
                id = sc.nextInt();
                sc.nextLine();
                try {
                    studentService.inputScore(id);
                    continueConfirm();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case "6":
                System.out.println("Nhập id học sinh cần sửa điểm: ");
                id = sc.nextInt();
                sc.nextLine();
                try {
                    studentService.editScore(id);
                    continueConfirm();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case "7":
                try {
                    studentService.printScore();
                    continueConfirm();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case "0":
                System.out.println("Thoát.");
                System.exit(0);
            default:
                System.out.println("Yêu cầu nhập lại: ");
                performCustomer();

        }
    }
}
