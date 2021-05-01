package com.student.service;

import com.student.dal.StudentDB;
import com.student.model.Student;

import java.io.IOException;
import java.util.*;


public class StudentService {
    public StudentDB studentDB = new StudentDB();

    public void add(Student student) throws IOException {
        studentDB.add(student);
        studentDB.saveFile();
    }

    public boolean remove(int id) throws IOException {
        boolean result = studentDB.remove(id);
        studentDB.saveFile();
        return result;
    }

    public void print() {
        for (Map.Entry<Integer, Student> entry : StudentDB.studentMap.entrySet()
        ) {
            System.out.println(entry.getKey() + ", " + entry.getValue().toStringCSV());
        }
    }

    public void loadData() throws Exception {
        studentDB.readFile();
    }

    public Student find(int id) {
        return StudentDB.studentMap.get(id);
    }

    public void updateFile() throws IOException {
        studentDB.saveFile();
    }

    public void sortStudent() {
        ArrayList<Student> arrayList = new ArrayList<>();
        for (Map.Entry<Integer, Student> entry : StudentDB.studentMap.entrySet()
        ) {
            arrayList.add(entry.getValue());
        }
        arrayList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getAge() - o2.getAge() > 0) {
                    return 1;
                } else if (o1.getAge() - o2.getAge() < 0) {
                    return -1;
                } else return 0;
            }
        });
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.println(arrayList.get(i));
        }
    }
//    public void sortName() {
//        Collections.sort(products, new Comparator<Product>() {
//            @Override
//            public int compare(Product o1, Product o2) {
//                if (o1.getName().compareTo(o2.getName()) > 0) {
//                    return 1;
//                } else if (o1.getName().compareTo(o2.getName()) < 0) return -1;
//                else return 0;
//            }
//        });
//    }

}
