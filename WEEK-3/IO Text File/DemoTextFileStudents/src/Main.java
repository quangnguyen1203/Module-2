import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Long", "Phu Bai" ));
        studentList.add(new Student("Nam", "Quang Binh" ));
        studentList.add(new Student("Thien", "Hue" ));

        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("student.csv");

            String line = Student.getHeaderFormet() + "\n";
            byte[] b = line.getBytes();

            fos.write(b);

            for (Student std: studentList
                 ) {
                line = std.getFileLineFormat() + "\n";
                b = line.getBytes();

                fos.write(b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
