import java.util.Scanner;

public class LeapYearCaculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  year;
        boolean isLeapYear = false;

        System.out.println("Enter a year: ");
        year = sc.nextInt();

        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4){
            boolean isDivisibleBy100 = year %100 == 0;
            if (isDivisibleBy100){
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400){
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if (isLeapYear){
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.print("%d is NOT a leap year");
        }
    }
}
