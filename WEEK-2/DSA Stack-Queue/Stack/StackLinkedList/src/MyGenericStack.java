import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    public LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList();
    }

    public boolean isEmpty(){
        if(stack.size() == 0){
            return true;
        }
        return false;
    }

    public void push(T element){
        stack.addFirst(element);
    }

    public int size (){
        return stack.size();
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

}
