import java.io.*;

public class CopyFileExample {
    public static void main(String[] args) throws IOException {
        InputStream is = null;
        OutputStream os = null;

        try{
            is = new FileInputStream(new File("C:\\Module-2\\WEEK-3\\Sort Algorithm\\BubbleSort\\src\\BubbleSortByStep.java"));
            os = new FileOutputStream(new File("CopyFileExample.java"));

            int length;
            byte[] buffer = new byte[1024];

            while ((length = is.read(buffer)) > 0){
                os.write(buffer, 0, length);
            }
            System.out.println("File is coppide successful!");
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            is.close();
            os.close();
        }
    }
}
