package com.student.dal;

import com.student.model.Student;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class StudentDB {
    public static Map<Integer, Student> studentMap;
    public static int count;
    static {
        studentMap = new HashMap<Integer,Student>();
        count = 0;
    }

    public void add(Student student){
        count++;
        student.setId(count);
        studentMap.put(count,student);
    }

    public boolean remove(int id){
        return studentMap.remove(id) == null ? false : true;
    }

    public void saveFile() throws IOException {
        File file = new File("student.csv");
        if(!file.exists()){
            file.createNewFile();
        }

        FileOutputStream fos = new FileOutputStream("student.csv");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        for(Map.Entry<Integer,Student> entry : studentMap.entrySet()){
            bos.write(entry.getValue().toStringCSV().getBytes());

        }
        bos.flush();
        bos.close();
        fos.close();
    }

    public void readFile() throws Exception {
        File file = new File("student.csv");
        if(!file.exists()){
            return;
        }

        FileReader reader = new FileReader("student.csv");
        BufferedReader br = new BufferedReader(reader);

        String line;

        while ((line = br.readLine())!= null){
            String[] arr = line.split(",");
            Student student = new Student(Integer.parseInt(arr[0]),arr[1],Integer.parseInt(arr[2]),arr[3],arr[4],arr[5]);
            add(student);
        }
    }
}
