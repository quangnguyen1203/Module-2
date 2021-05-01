import java.io.IOException;

public class Test {
    public static void main(String[] args)  {
        StudentCSV studentCSV = new StudentCSV();
        Main m = new Main();

        try {
            studentCSV.readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        m.addStudent(new Student(1,"nam",12,"nam"));
        m.addStudent(new Student(2,"nam",12,"nam"));

        try {
            studentCSV.saveFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
