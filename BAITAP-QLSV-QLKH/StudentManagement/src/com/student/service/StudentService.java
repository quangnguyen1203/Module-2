package com.student.service;

import com.student.dal.StudentDB;
import com.student.model.Student;

import java.io.IOException;
import java.util.Scanner;

public class StudentService {
    public static Scanner sc = new Scanner(System.in);
    public static StudentDB studentDB = new StudentDB();


    public void addStudent() throws IOException {
        int id = studentDB.inputId();
        String name = studentDB.inputName();
        int age = studentDB.inputAge();
        String address = studentDB.inputAddress();
        Student student = new Student(id, name, age, address);
        studentDB.add(student);
        studentDB.saveFile();
    }

    public void deleteStudent() throws IOException {
        System.out.println("Nhập id cần xóa:");
        int id = sc.nextInt();
        sc.nextLine();
        studentDB.delete(id);
    }

//    public void loadData() throws IOException {
//        studentDB.readData();
//    }

    public void loadFile() throws IOException {
        studentDB.read();
    }

    public void showMenu(){
        System.out.println("1. Xem danh sách học viên");
        System.out.println("2. Thêm học viên");
        System.out.println("3. Sửa thông tin học viên");
        System.out.println("4. Xóa học viên");
        System.out.println("5. Nhập điểm học viên");
        System.out.println("6. Sửa điểm học viên");
        System.out.println("7. Xếp loại học viên");
    }

    public void editStudent(int id) throws IOException {
        studentDB.edit(id);
    }

    public void printStudent(){
        studentDB.print();
    }

    public void printScoreStudent() throws IOException {
        studentDB.printScore();
    }

    public void editScore(String name) throws IOException {
        studentDB.inputScore(name);
        studentDB.saveFile();
    }
}
