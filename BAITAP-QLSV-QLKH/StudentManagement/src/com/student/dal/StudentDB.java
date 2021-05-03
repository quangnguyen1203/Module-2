package com.student.dal;

import com.student.model.Student;

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
        while (true) {
            try {
                int id = Integer.parseInt((sc.nextLine()));
                return id;
            } catch (NumberFormatException ex) {
                System.out.print("Yêu cầu nhập lại: ");
            }
        }
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
        for (int i = 0; i < studentList.size(); i++) {
            if(studentList.get(i).getId() == id){
                studentList.get(i).setName(inputName());
                studentList.get(i).setAge(inputAge());
                studentList.get(i).setAddress(inputAddress());
                saveFile();
            } else {
                System.out.println("Không tìm thấy id.");
            }

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
        for (int i = 0; i < studentList.size(); i++) {
            System.out.print(studentList.get(i).toStringCSV());
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
        for (int i = 0; i < studentList.size(); i++) {
            System.out.print(studentList.get(i).toStringGPA());
        }
    }

    public void inputScore(String name) throws IOException {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getName().equals(name)) {
                System.out.println("Nhập điểm lần 1: ");
                float score1 = sc.nextInt();
                studentList.get(i).setScore1(score1);
                System.out.println("Nhập điểm lần 2: ");
                float score2 = sc.nextInt();
                studentList.get(i).setScore2(score2);
                System.out.println("Nhập điểm lần 3: ");
                float score3 = sc.nextInt();
                studentList.get(i).setScore3(score3);
                System.out.println("Nhập điểm lần 4: ");
                float score4 = sc.nextInt();
                studentList.get(i).setScore4(score4);
                float GPA = (score1 + score2 + (score3 * 2) + (score4 * 3)) / 7;
                studentList.get(i).setGPA(GPA);
                System.out.println(studentList.get(i).toStringCSV());
                saveFile();
                return;
            }
        }
        System.out.println("Không tìm thấy");
    }

//    public void saveFileData() throws IOException {
//        File file = new File("studentData.csv");
//        if(!file.exists()){
//            file.createNewFile();
//        }
//
//        FileOutputStream fos = new FileOutputStream("studentData.csv");
//        BufferedOutputStream bos = new BufferedOutputStream(fos);
//        for (int i = 0; i <studentList.size() ; i++) {
//            bos.write(studentList.get(i).toStringPointCSV().getBytes());
//        }
//        bos.flush();
//        bos.close();
//        fos.close();
//    }
//
//    public void readData() throws IOException {
//        File file = new File("studentData.csv");
//        if(!file.exists()){
//            file.createNewFile();
//        }
//        BufferedReader br = null;
//        try {
//            br = new BufferedReader(new FileReader("studentData.csv"));
//            String line;
//            while ((line=br.readLine())!= null){
//                String[] str = line.split(",");
//                Student student = new Student(str[0],Float.parseFloat(str[1]),Float.parseFloat(str[2]),Float.parseFloat(str[3]),Float.parseFloat(str[4]),Float.parseFloat(str[5]));
//                studentList.add(student);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            br.close();
//        }
//    }

}

