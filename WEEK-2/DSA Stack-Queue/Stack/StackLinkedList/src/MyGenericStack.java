import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    public LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList();
    }

    public boolean isEmpty(){
        return this.size() == 0 ? true : false;
    }

    public void push(T element){
        stack.addFirst(element);
    }

    public int size (){
        return stack.size();
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return stack.removeFirst();
    }

}
