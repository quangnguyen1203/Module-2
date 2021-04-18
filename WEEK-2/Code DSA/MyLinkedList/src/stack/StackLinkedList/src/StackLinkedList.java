package stack.StackLinkedList.src;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class StackLinkedList<T> {
    private int size;
    public LinkedList<T> stack;

    public StackLinkedList() {
        stack = new LinkedList();
    }

    public boolean isEmpty(){
        return this.size() == 0 ? true : false;
    }

    public void push(T element){
        stack.addFirst(element);
        size++;
    }

    public int size (){
        return stack.size();
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        size--;
        return stack.removeFirst();
    }

    public T peek(){
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }

        return stack.get(size);
    }

    public int search(T e){
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        for (int i = 0; i < size ; i++) {
            if(stack.get(i) == e){
                return i;
            }
        }
        return -1;
    }

    public void display(){
        for (int i = 0; i < size; i++) {
            System.out.println(stack.get(i));
        }
    }
}
