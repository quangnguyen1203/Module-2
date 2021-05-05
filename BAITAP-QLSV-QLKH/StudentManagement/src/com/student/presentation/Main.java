package com.student.presentation;

import com.student.service.StudentService;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        Scanner sc = new Scanner(System.in);
        try {
            studentService.loadFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        studentService.performCustomer();
    }
}
