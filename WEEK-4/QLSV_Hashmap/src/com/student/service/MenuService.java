package com.student.service;

import com.student.dal.StudentDB;
import com.student.model.Student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;

public class MenuService {
    public static Scanner sc = new Scanner(System.in);
    public static StudentService studentService = new StudentService();

    public void addStudent() throws IOException {
        System.out.println("Nhap ten:");
        String name = sc.nextLine();
        System.out.println("Nhap tuoi");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap so dien thoai: ");
        String phoneNumber = sc.nextLine();
        System.out.println("Nhap email: ");
        String email = sc.nextLine();
        System.out.println("Nhap gioi tinh:");
        String gender = sc.nextLine();
        Student student = new Student(0,name,age,phoneNumber,email,gender);
        studentService.add(student);
    }

    public void deleteStudent() throws IOException {
        System.out.println("Nhap id ban muon xoa: ");
        int id = sc.nextInt();
        sc.nextLine();
        studentService.remove(id);
    }

    public void editStudent() throws IOException {
        System.out.println("Nhap id can sua: ");
        int id = sc.nextInt();
        Student student = studentService.find(id);
        sc.nextLine();
        if(student == null){
            System.out.println("Not found");
        } else {
            System.out.println("Nhap ten:");
            String name = sc.nextLine();
            System.out.println("Nhap tuoi");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.println("Nhap so dien thoai: ");
            String phoneNumber = sc.nextLine();
            System.out.println("Nhap email: ");
            String email = sc.nextLine();
            System.out.println("Nhap gioi tinh:");
            String gender = sc.nextLine();
            student.setName(name);
            student.setAge(age);
            student.setPhoneNumber(phoneNumber);
            student.setEmail(email);
            student.setGender(gender);
            studentService.updateFile();
        }
    }

    public void printStudent(){
        studentService.print();
    }

    public void showMenu(){
        System.out.println("**********Menu**********");
        System.out.println("1. Them sinh vien.");
        System.out.println("2. Sua sinh vien. ");
        System.out.println("3. Xoa sinh vien. ");
        System.out.println("4. In danh sach sinh vien. ");
        System.out.println("5. Sap xep danh sach theo tuoi.");
        System.out.println("6. Thoat. ");
    }

//    public void sortStudent() {
//        ArrayList<Student> arrayList = new ArrayList<>();
//        for (Map.Entry<Integer, Student> entry : StudentDB.studentMap.entrySet()
//        ) {
//            arrayList.add(entry.getValue());
//        }
//        arrayList.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                if (o1.getAge() - o2.getAge() > 0) {
//                    return 1;
//                } else if (o1.getAge() - o2.getAge() < 0) {
//                    return -1;
//                } else return 0;
//            }
//        });
//
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }
//    }
    public void sortAgeStudent(){
        studentService.sortStudent();
    }
}
