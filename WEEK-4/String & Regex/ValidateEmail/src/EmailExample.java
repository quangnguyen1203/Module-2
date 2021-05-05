import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    public static Scanner sc = new Scanner(System.in);
    public String inputEmail(){
        String input = sc.nextLine();
        String regex = "^[a-zA-Z]+[a-zA-Z0-9]*@{1}\\w+mail.com$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if(matcher.find()){
            System.out.println("Ok");
            return input;
        } else {
            do {
                System.out.println("Vui long nhap lai cho chinh xác");
                inputEmail();
            } while (true);
        }

    }


    public static void main(String[] args) {
        EmailExample emailExample = new EmailExample();
        System.out.println(emailExample.inputEmail());
    }
}
