package stack.StackMyLinkedList.src;

public class StackMyLinkedListTest {
    public static void main(String[] args) {
        StackMyLinkedList<Integer> stack = new StackMyLinkedList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.display();
        System.out.println(stack.search(3));
//        System.out.println("********************");
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.display();
    }
}
