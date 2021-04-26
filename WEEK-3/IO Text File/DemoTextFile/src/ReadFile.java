import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("test.txt");

            StringBuilder builder = new StringBuilder();
            int code ;
            while ((code = fis.read()) != -1){
                builder.append((char) code);
            }

            String content = builder.toString();
            System.out.println(content);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
