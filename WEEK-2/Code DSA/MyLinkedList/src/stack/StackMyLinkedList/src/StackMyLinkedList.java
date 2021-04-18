package stack.StackMyLinkedList.src;

import com.quang.MyLinkedList.MyLinkedList;

public class StackMyLinkedList<E> {
    public MyLinkedList<E> stack;


    public StackMyLinkedList() {
        stack = new MyLinkedList<>();
    }

    public void push(E element) {
        stack.addLast(element);
    }

    public E pop() {
        if(stack.isEmpty()){
            System.out.println("stack is empty");
            return null;
        }
        return stack.removeLast();
    }

    public E peek(){
        return stack.peek();
    }

    public int search(E e){
        return stack.search(e);
    }

    public void display() {
        stack.display();
    }
}

