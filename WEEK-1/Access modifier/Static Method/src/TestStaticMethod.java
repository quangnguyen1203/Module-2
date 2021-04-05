
public class TestStaticMethod {
    public static void main(String[] args ) {
//        Students Student = new Students();

        Students.change(); //calling change method

        //creating objects
        Students s1 = new Students(111, "Hoàng");
        Students s2 = new Students(222, "Khánh");
        Students s3 = new Students(333, "Nam");

        //calling display method
        s1.display();
        s2.display();
        s3.display();

    }
}
