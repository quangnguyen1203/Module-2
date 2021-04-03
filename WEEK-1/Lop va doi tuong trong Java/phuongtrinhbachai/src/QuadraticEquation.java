import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    private double delta;

    public void setA(double a,double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDelta() {
        return delta;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant(){
        delta = b*b - 4*a*c;
        return delta;
    }
    public double getRoot1(){
        return (-b + Math.sqrt(delta))/(2*a);
    }
    public double getRoot2(){
        return (-b - Math.sqrt(delta))/(2*a);
    }
    public double getRoot3(){
        return (-b)/2*a;
    }
    public void displaySolution() {
        if(this.getDiscriminant()<0){
            System.out.println("Phương trình vô nghiệm");
        } else if (this.getDiscriminant() == 0){
            System.out.println("Phương trình có 1 nghiệm kép: " + this.getRoot3());
        } else {
            System.out.println("Phương trình có 2 nghiệm là: " + this.getRoot1() + " and " + this.getRoot2());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập các giá trị a,b,c theo thứ tự: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        QuadraticEquation Qua = new QuadraticEquation();
        Qua.setA(a,b,c);
        Qua.displaySolution();

        }

    }

