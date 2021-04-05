class A {
    private int data = 40;
    public void msg() {
        System.out.println("Hello Java");
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

}

public class SimplePrivate {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.getData());
        obj.msg();
    }
}
