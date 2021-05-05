package com.student.dal;

import com.student.model.Student;

import javax.print.DocFlavor;
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class StudentDB {
    public static Scanner sc = new Scanner(System.in);
    public static List<Student> studentList;
    static {
        studentList = new ArrayList<>();
    }

    public void saveFile() throws IOException {
        File file = new File("student.csv");
        if(!file.exists()){
            file.createNewFile();
        }

        FileOutputStream fos = new FileOutputStream("student.csv");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        for (int i = 0; i <studentList.size() ; i++) {
            bos.write(studentList.get(i).toStringCSV().getBytes());
        }
        bos.flush();
        bos.close();
        fos.close();
    }

    public void read() throws IOException {
        File file = new File("student.csv");
        if(!file.exists()){
            file.createNewFile();
        }
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("student.csv"));
            String line;
            while ((line=br.readLine())!= null){
                String[] str = line.split(",");
                Student student = new Student(Integer.parseInt(str[0]),str[1],Integer.parseInt(str[2]),str[3],Float.parseFloat(str[4]),Float.parseFloat(str[5]),Float.parseFloat(str[6]),Float.parseFloat(str[7]),Float.parseFloat(str[8]));
                studentList.add(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
        }
    }

    public void add(Student student){
        studentList.add(student);
    }

    public void delete(int id) throws IOException {
        Student student = null;
        int size = studentList.size();
        for (int i = 0; i < size; i++) {
            if (studentList.get(i).getId() == id) {
                student = studentList.get(i);
                break;
            }
        }
        if (student != null) {
            studentList.remove(student);
            saveFile();
        } else {
            System.out.printf("id không tồn tại");
        }
    }

    public int inputId() {
        System.out.print("Nhập id của học sinh: ");
        while (!sc.hasNextInt()){
            System.out.println("Không tìm thấy. Yêu cầu nhập hợp lệ");
            sc.nextLine();
        }
        int id = sc.nextInt();
        for(int i=0;i<studentList.size();i++){
            if(studentList.get(i).getId()==id){
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
        while (true) {
            try {
                int age = Integer.parseInt((sc.nextLine()));
                if (age < 0 && age > 100) {
                    throw new NumberFormatException();
                }
                return age;
            } catch (NumberFormatException ex) {
                System.out.print("Yêu cầu nhập lại: ");
            }
        }
    }

    public String inputAddress() {
        System.out.print("Nhập địa chỉ: ");
        return sc.nextLine();
    }

    public void edit(int id) throws IOException {
        boolean check = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                displayFormat();
                studentList.get(i).displayAll();
                System.out.println();
                check = true;
                studentList.get(i).setName(inputName());
                studentList.get(i).setAge(inputAge());
                studentList.get(i).setAddress(inputAddress());
            }
        }
        if (!check){
            System.out.println("Không tìm thấy học sinh.");
        }

    }

    public void print(){
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getId()>o2.getId()){
                    return 1;
                } else if (o1.getId()<o2.getId()){
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        displayFormat();
        for (int i = 0; i < studentList.size(); i++) {
            studentList.get(i).displayAll();
            System.out.println();
        }
    }

    public void printScore() throws IOException {
        Collections.sort(studentList, new Comparator<Student>() {
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
        for (int i = 0; i < studentList.size(); i++) {
            studentList.get(i).displayAll();
            System.out.println();
        }
    }

    public void inputScore(int id) throws IOException {
        boolean  check = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                check = true;
                if (studentList.get(i).getGPA()>0){
                    studentList.get(i).displayAll();
                    System.out.println();
                    System.out.println("Học sinh đã được nhập điểm");
                } else {
                    float score1;
                    do {
                        System.out.println("Nhập điểm lần 1: ");
                        score1 = sc.nextFloat();
                    } while (!checkScore(score1));
                    studentList.get(i).setScore1(score1);
                    float score2;
                    do {
                        System.out.println("Nhập điểm lần 2: ");
                        score2 = sc.nextFloat();
                    } while (!checkScore(score2));
                    studentList.get(i).setScore2(score2);
                    float score3;
                    do {
                        System.out.println("Nhập điểm lần 3: ");
                        score3 = sc.nextFloat();
                    } while (!checkScore(score3));
                    studentList.get(i).setScore3(score3);
                    float score4;
                    do {
                        System.out.println("Nhập điểm lần 4: ");
                        score4 = sc.nextFloat();
                    } while (!checkScore(score4));
                    studentList.get(i).setScore4(score4);
                    float GPA = (score1 + score2 + (score3 * 2) + (score4 * 3)) / 7;
                    studentList.get(i).setGPA(GPA);
                    System.out.println(studentList.get(i).toStringGPA());
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
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                check = true;
                    float score1;
                    do {
                        System.out.println("Nhập điểm lần 1: ");
                        score1 = sc.nextFloat();
                    } while (!checkScore(score1));
                    studentList.get(i).setScore1(score1);
                    float score2;
                    do {
                        System.out.println("Nhập điểm lần 2: ");
                        score2 = sc.nextFloat();
                    } while (!checkScore(score2));
                    studentList.get(i).setScore2(score2);
                    float score3;
                    do {
                        System.out.println("Nhập điểm lần 3: ");
                        score3 = sc.nextFloat();
                    } while (!checkScore(score3));
                    studentList.get(i).setScore3(score3);
                    float score4;
                    do {
                        System.out.println("Nhập điểm lần 4: ");
                        score4 = sc.nextFloat();
                    } while (!checkScore(score4));
                    studentList.get(i).setScore4(score4);
                    float GPA = (score1 + score2 + (score3 * 2) + (score4 * 3)) / 7;
                    studentList.get(i).setGPA(GPA);
                    System.out.println(studentList.get(i).toStringGPA());
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
        System.out.printf("| %4s | %20s | %12s | %10s | %12s | %12s | %12s | %12s | %12s |"
                ,"ID","Tên","Tuổi","Địa chỉ","Điểm HS1(1)","Điểm HS1(2)","Điểm HS2","Điểm HS3","Điểm TB");
        System.out.println();
    }
}


