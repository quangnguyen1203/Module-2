public class Student {
    String name,address;

    public Student() {
    }

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFileLineFormat(){
        return name + ", " + address;
    }

    public static String getHeaderFormet(){
        return "Name, Address";
    }
}
