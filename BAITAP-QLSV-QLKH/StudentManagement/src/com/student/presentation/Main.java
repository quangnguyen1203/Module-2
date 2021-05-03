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

        int choose;
        while (true){
            studentService.showMenu();
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose){
                case 1:
                    studentService.printStudent();
                    break;
                case 2:
                    try {
                        studentService.addStudent();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    System.out.println("Nhập id cần sửa: ");
                    int id = sc.nextInt();
                    try {
                        studentService.editStudent(id);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    try {
                        studentService.deleteStudent();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    System.out.println("Nhập tên: ");
                    String name = sc.nextLine();
                    try {
                        studentService.editScore(name);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 7:
                    try {
                        studentService.printScoreStudent();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
            }

        }



    }
}
