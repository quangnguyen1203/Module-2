package com.student.presentation;

import com.student.service.MenuService;
import com.student.service.StudentService;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        try {
            studentService.loadData();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Scanner sc = new Scanner(System.in);
        MenuService menuService = new MenuService();
        int choose;
        while (true){
            menuService.showMenu();
            choose = sc.nextInt();
            switch (choose){
                case 1:
                    try {
                        menuService.addStudent();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    try {
                        menuService.editStudent();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    try {
                        menuService.deleteStudent();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    menuService.printStudent();
                    break;
                case 5:
                    menuService.sortAgeStudent();
                    break;
                case 6:
                    System.out.println("Thoat");
                    System.exit(0);
                default:
                    System.out.println("Yeu cau nhap lai");
            }
        }
    }
}
