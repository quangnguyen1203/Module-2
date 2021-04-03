import java.util.Scanner;

public class Rectangle {
    double width, height;

    public Rectangle(){
    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return this.width * this.height;
    }
    public double getPerimeter(){
        return (this.width + this.height)*2;
    }
    public String display(){
        return "Rectangle{" + "width=" + width + " height=" + height + "}";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width: ");
        double width = sc.nextDouble();
        System.out.println("Enter the height: ");
        double height = sc.nextDouble();
        Rectangle Rec = new Rectangle(width,height);
        System.out.println(Rec.display());
        System.out.println(Rec.getArea());
        System.out.println(Rec.getPerimeter());
    }
}




