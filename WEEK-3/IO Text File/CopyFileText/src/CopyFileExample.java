import java.io.*;

public class CopyFileExample {
    public static void main(String[] args) throws Exception {
        InputStream is = null;
        OutputStream os = null;


        try{
            is = new FileInputStream(new File("C:\\Module-2\\WEEK-3\\Sort Algorithm\\BubbleSort\\src\\BubbleSortByStep.java"));
            os = new FileOutputStream(new File("CopyFileExample3.java"));

            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(os);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(is);

            int length;
            byte[] buffer = new byte[1024];

            while ((length = bufferedInputStream.read(buffer)) !=  -1){
                bufferedOutputStream.write(buffer, 0, length);
            }
            System.out.println("File is coppide successful!");
            bufferedOutputStream.close();
            bufferedInputStream.close();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
//            is.close();
//            os.close();
//            bufferedOutputStream.close();
//            bufferedInputStream.close();
        }
    }
}
