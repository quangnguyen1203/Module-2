import java.util.Scanner;

public class MenuPrint {
    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Hình chữ nhật");
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 6; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                }
                case 2: {
                        System.out.println("tam giác vuông cạnh góc vuông ở dưới");
                        for (int i = 1; i <= 5; i++) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print(" * ");
                            }
                            System.out.println();
                        }

                        System.out.println("tam giác vuông cạnh góc vuông ở trên");
                        for (int i = 1; i <= 5; i++) {
                            for (int j = 5; j >= i; j--) {
                                System.out.print(" * ");
                            }
                            System.out.println();
                        }
                        break;
                    }
                case 3:{
                    for(int i=1;i<=6;i++)
                    {
                        for(int j=i;j<=6;j++)
                        {
                            System.out.print(" ");
                        }
                        for(int j=1;j<=i;j++)
                        {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                }
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice");
                }
            }
        }
    }