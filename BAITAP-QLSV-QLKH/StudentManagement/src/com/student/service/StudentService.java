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
        if(id==-1){
            System.out.println("Id đã tồn tại.");
            return;
        }
        String name = studentDB.inputName();
        int age = studentDB.inputAge();
        String address = studentDB.inputAddress();
        Student student = new Student(id, name, age, address);
        studentDB.add(student);
        studentDB.saveFile();
        System.out.println("Thêm học sinh " + name + " thành công");
    }

    public void deleteStudent() throws IOException {
        System.out.println("Nhập id cần xóa:");
        int id = sc.nextInt();
        sc.nextLine();
        studentDB.delete(id);
    }

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
        System.out.println("0. Kết thúc.");
        System.out.println("*************************");
        System.out.println("Nhập để chọn: ");
    }

    public void editStudent(int id) throws IOException {
        studentDB.edit(id);
        studentDB.saveFile();
    }

    public void printStudent(){
        studentDB.print();
    }

    public void printScoreStudent() throws IOException {
        studentDB.printScore();
    }

    public void inputScoreStudent(int id) throws IOException {
        studentDB.inputScore(id);
        studentDB.saveFile();
    }

    public void editScoreStudent(int id) throws IOException {
        studentDB.editScore(id);
        studentDB.saveFile();
    }

    public void continueConfirm() {
//        System.out.println("Bạn có muốn tiếp tục thực hiện không ?");
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
                    printStudent();
                    continueConfirm();
                    break;
                case "2":
                    try {
                        addStudent();
                        continueConfirm();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case "3":
                    System.out.println("Nhập id cần sửa: ");
                    id = sc.nextInt();
                    try {
                        editStudent(id);
                        continueConfirm();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    break;
                case "4":
                    try {
                        deleteStudent();
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
                        inputScoreStudent(id);
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
                        editScoreStudent(id);
                        continueConfirm();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case "7":
                    try {
                        printScoreStudent();
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

