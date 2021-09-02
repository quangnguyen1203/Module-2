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
    int countStudent = 0;

    public void saveFile() throws IOException {
        File file = new File("student.csv");
        if(!file.exists()){
            file.createNewFile();
        }

        FileOutputStream fos = new FileOutputStream("student.csv");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        countStudent = 0;
        for (int i = 0; i <studentList.size() ; i++) {
            studentList.get(i).setRollNo(++countStudent);
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
                Student student = new Student(Integer.parseInt(str[0]),Integer.parseInt(str[1]),str[2],Integer.parseInt(str[3]),str[4],Float.parseFloat(str[5]),Float.parseFloat(str[6]),Float.parseFloat(str[7]),Float.parseFloat(str[8]),Float.parseFloat(str[9]));
                studentList.add(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
        }
    }

    public void add(Student student){
        student.setRollNo(++countStudent);
        studentList.add(student);
    }

}


