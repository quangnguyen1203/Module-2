package com.student.presentation;

import com.student.service.MenuService;
import com.student.service.StudentService;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        MenuService menuService = new MenuService();
        Scanner sc = new Scanner(System.in);
        try {
            studentService.loadFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        menuService.performCustomer();
    }
}
