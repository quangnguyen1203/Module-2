import java.util.HashMap;
import java.util.Map;


public class Main {
    public static Map<Integer, Student> studentMap;
    public static int count;
    static{
        studentMap = new HashMap<>();
        count = 0;
    }

    public  void addStudent(Student student){
        count++;
        student.setId(count);
        studentMap.put(count,student);
    }

    public  boolean removeStudent(int id){
        return studentMap.remove(id) == null ? false : true;
    }

    public  void display(){
        for (Map.Entry<Integer, Student> studentEntry: studentMap.entrySet()
             ) {
            System.out.println(studentEntry.toString());
        }
    }

}
