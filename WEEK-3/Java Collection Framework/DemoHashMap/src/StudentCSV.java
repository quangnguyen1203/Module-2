import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class StudentCSV {
    public void saveFile() throws IOException {
        File file = new File("student.csv");
        if(!file.exists()){
            file.createNewFile();
        }

        FileOutputStream fos = new FileOutputStream("student.csv",true);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        for (Map.Entry<Integer, Student> studentEntry: Main.studentMap.entrySet()
        ) {
//            System.out.println(studentEntry.getValue().toStringFormat());
            bos.write(studentEntry.getValue().toStringFormat().getBytes());
        }
        bos.flush();
        bos.close();
        fos.close();
    }

    public void readFile() throws IOException {
        File file = new File("student.csv");
        if(!file.exists()) {
            return;
        }
        FileReader reader = new FileReader("student.csv");
        BufferedReader bis = new BufferedReader(reader);
        Main m = new Main();
        String line;


        while ((line = bis.readLine()) != null){
            String[] arr = line.split(",");
            Student student = new Student(Integer.parseInt(arr[0]),arr[1],Integer.parseInt(arr[2]),arr[3]);
            m.addStudent(student);
        }
//        bis.close();
//        reader.close();
    }

}

