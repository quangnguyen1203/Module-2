import java.util.Scanner;

public class daysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Which month that you want to count days ?");
        int month = sc.nextInt();
        String dayInMonths;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayInMonths= "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayInMonths= "30";
                break;
            case 2:
                dayInMonths= "28 or 29";
            default:
                dayInMonths = "";
        }
        if (dayInMonths != "")
            System.out.printf("The month '%d' has %s days!", month, dayInMonths);
        else
            System.out.println("Invalid input");
    }
}
