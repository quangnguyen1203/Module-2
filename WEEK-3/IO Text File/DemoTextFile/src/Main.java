import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("vidu.txt");

        if (file.exists()){
            System.out.println("File exist.");
        } else {
            try {
                System.out.println("File created.");
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //Ghi dữ liệu

        FileOutputStream fos = null;
        Scanner sc = new Scanner(System.in);

        try {
            fos = new FileOutputStream("test.txt",true);

            for(;;){
                System.out.println("Nhập từ bàn phím: ");
                String line = sc.nextLine() + "\n";
                byte[] b = line.getBytes();

                fos.write(b);

                System.out.println("Tiếp tục Y/N: ");
                String choose = sc.nextLine();

                if (choose.equalsIgnoreCase("N")){
                    break;
                }
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
