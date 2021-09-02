package com.student.service;

import com.student.dal.StudentDB;
import com.student.model.Student;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentService {
    public static Scanner sc = new Scanner(System.in);
    public static StudentDB studentDB = new StudentDB();

    public int inputStCode() {
        System.out.print("Nhập id của học sinh: ");
        while (!sc.hasNextInt()){
            System.out.println("Không tìm thấy. Yêu cầu nhập hợp lệ");
            sc.nextLine();
        }
        int id = sc.nextInt();
        for(int i=0;i<studentDB.studentList.size();i++){
            if(studentDB.studentList.get(i).getStCode()==id){
                return -1;
            }
        }
        sc.nextLine();
        return id;
    }

    public String inputName() {
        System.out.print("Nhập tên học sinh: ");
        return sc.nextLine();
    }

    public int inputAge() {
        System.out.print("Nhập tuổi học sinh: ");
        int age;
        do {
            age = sc.nextInt();
        } while (!checkAge(age));
        return age;
    }

    public boolean checkAge(int age){
        return (0 > age && age > 100 ) ? false : true;
    }

    public String inputAddress() {
        System.out.print("Nhập địa chỉ: ");
        return sc.nextLine();
    }

    public void addStudent() throws IOException {
        int id = inputStCode();
        if(id==-1){
            System.out.println("Id đã tồn tại.");
            return;
        }
        String name = inputName();
        int age = inputAge();
        String address = inputAddress();
        Student student = new Student(id, name, age, address);
        studentDB.add(student);
        studentDB.saveFile();
        System.out.println("Thêm học sinh " + name + " thành công");
    }


    public void edit() throws IOException {
        System.out.println("Nhập id cần sửa: ");
        int id = sc.nextInt();
        boolean check = false;
        for (int i = 0; i < studentDB.studentList.size(); i++) {
            if (studentDB.studentList.get(i).getStCode() == id) {
                displayFormat();
                studentDB.studentList.get(i).displayAll();
                System.out.println();
                check = true;
                studentDB.studentList.get(i).setName(inputName());
                studentDB.studentList.get(i).setAge(inputAge());
                studentDB.studentList.get(i).setAddress(inputAddress());
                studentDB.saveFile();
            }
        }
        if (!check){
            System.out.println("Không tìm thấy học sinh.");
        }

    }

    public void delete(int id) throws IOException {
        Student student = null;
        int size = studentDB.studentList.size();
        for (int i = 0; i < size; i++) {
            if (studentDB.studentList.get(i).getStCode() == id) {
                student = studentDB.studentList.get(i);
                break;
            }
        }
        if (student != null) {
            studentDB.studentList.remove(student);
            studentDB.saveFile();
        } else {
            System.out.printf("id không tồn tại");
        }
    }

    public void print(){
        Collections.sort(studentDB.studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getStCode()>o2.getStCode()){
                    return 1;
                } else if (o1.getStCode()<o2.getStCode()){
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        displayFormat();
        for (int i = 0; i < studentDB.studentList.size(); i++) {
            studentDB.studentList.get(i).displayAll();
            System.out.println();
        }
    }

    public void printScore() throws IOException {
        Collections.sort(studentDB.studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getGPA()>o2.getGPA()){
                    return 1;
                } else if (o1.getGPA() < o2.getGPA()){
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        displayFormat();
        for (int i = 0; i < studentDB.studentList.size(); i++) {
            studentDB.studentList.get(i).displayAll();
            System.out.println();
        }
    }

    public void inputScore(int id) throws IOException {
        boolean  check = false;
        for (int i = 0; i < studentDB.studentList.size(); i++) {
            if (studentDB.studentList.get(i).getStCode() == id) {
                check = true;
                if (studentDB.studentList.get(i).getGPA()>0){
                    studentDB.studentList.get(i).displayAll();
                    System.out.println();
                    System.out.println("Học sinh đã được nhập điểm");
                } else {
                    float score1;
                    do {
                        System.out.println("Nhập điểm lần 1: ");
                        score1 = sc.nextFloat();
                    } while (!checkScore(score1));
                    studentDB.studentList.get(i).setScore1(score1);
                    float score2;
                    do {
                        System.out.println("Nhập điểm lần 2: ");
                        score2 = sc.nextFloat();
                    } while (!checkScore(score2));
                    studentDB.studentList.get(i).setScore2(score2);
                    float score3;
                    do {
                        System.out.println("Nhập điểm lần 3: ");
                        score3 = sc.nextFloat();
                    } while (!checkScore(score3));
                    studentDB.studentList.get(i).setScore3(score3);
                    float score4;
                    do {
                        System.out.println("Nhập điểm lần 4: ");
                        score4 = sc.nextFloat();
                    } while (!checkScore(score4));
                    studentDB.studentList.get(i).setScore4(score4);
                    float GPA = (score1 + score2 + (score3 * 2) + (score4 * 3)) / 7;
                    studentDB.studentList.get(i).setGPA(GPA);
                    System.out.println(studentDB.studentList.get(i).toStringGPA());
                    break;
                }
            }
        }
        if(!check){
            System.out.println("Không tìm thấy học sinh.");
        }
    }

    public void editScore(int id) throws IOException {
        boolean  check = false;
        for (int i = 0; i < studentDB.studentList.size(); i++) {
            if (studentDB.studentList.get(i).getStCode() == id) {
                check = true;
                float score1;
                do {
                    System.out.println("Nhập điểm lần 1: ");
                    score1 = sc.nextFloat();
                } while (!checkScore(score1));
                studentDB.studentList.get(i).setScore1(score1);
                float score2;
                do {
                    System.out.println("Nhập điểm lần 2: ");
                    score2 = sc.nextFloat();
                } while (!checkScore(score2));
                studentDB.studentList.get(i).setScore2(score2);
                float score3;
                do {
                    System.out.println("Nhập điểm lần 3: ");
                    score3 = sc.nextFloat();
                } while (!checkScore(score3));
                studentDB.studentList.get(i).setScore3(score3);
                float score4;
                do {
                    System.out.println("Nhập điểm lần 4: ");
                    score4 = sc.nextFloat();
                } while (!checkScore(score4));
                studentDB.studentList.get(i).setScore4(score4);
                float GPA = (score1 + score2 + (score3 * 2) + (score4 * 3)) / 7;
                studentDB.studentList.get(i).setGPA(GPA);
                System.out.println(studentDB.studentList.get(i).toStringGPA());
                break;
            }
            if(!check){
                System.out.println("Không tìm thấy học sinh.");
            }
        }
    }

    public boolean checkScore(float score){
        return (score < 0 || score >10) ? false : true;
    }

    public void displayFormat(){
        System.out.printf("| %6s | %20s | %12s | %10s | %12s | %12s | %12s | %12s | %12s |"
                ,"Mã_HV","Tên","Tuổi","Địa chỉ","Điểm HS1(1)","Điểm HS1(2)","Điểm HS2","Điểm HS3","Điểm TB");
        System.out.println();
    }



    public void deleteStudent() throws IOException {
        System.out.println("Nhập id cần xóa:");
        int id = sc.nextInt();
        sc.nextLine();
        delete(id);
    }

    public void loadFile() throws IOException {
        studentDB.read();
    }

//    public void printScoreStudent() throws IOException {
//        studentDB.printScore();
//    }

//    public void inputScoreStudent(int id) throws IOException {
//        studentDB.inputScore(id);
//        studentDB.saveFile();
//    }

//    public void editScoreStudent(int id) throws IOException {
//        studentDB.editScore(id);
//        studentDB.saveFile();
//    }


}

