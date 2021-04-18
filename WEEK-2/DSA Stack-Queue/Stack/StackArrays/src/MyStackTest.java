public class MyStackTest {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<Integer>();
        myStack.push(10);
        myStack.push(2);
        myStack.push(5);
        myStack.push(124);
        myStack.push(21);
        myStack.display();
        System.out.println();
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        myStack.display();
    }

}
