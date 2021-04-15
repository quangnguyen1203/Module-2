public class MyStackTest {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<Integer>();
        myStack.push(10);
        myStack.push(2);
        myStack.push(5);
        myStack.push(124);
        myStack.push(21);
        myStack.push(4);
        myStack.push(43);
        myStack.push(65);

        myStack.display();
        System.out.println(myStack.peek());
    }

}
