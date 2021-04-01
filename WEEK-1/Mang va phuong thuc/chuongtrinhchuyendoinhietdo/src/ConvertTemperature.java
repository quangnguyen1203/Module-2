import java.util.Scanner;

public class ConvertTemperature {
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu.");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Exit");
        System.out.println("Enter your choice: ");

        double fahrenheit;
        double celsius;

        while(true){
            int choice;
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter fahrenheit: ");
                    fahrenheit = sc.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter celsius: ");
                    celsius = sc.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
}
