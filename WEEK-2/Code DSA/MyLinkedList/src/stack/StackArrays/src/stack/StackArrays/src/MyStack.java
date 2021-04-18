package stack.StackArrays.src;

import java.util.Arrays;

public class MyStack<E> {
    private int size ;
    private E[] elements;

    public void ensureCapa(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }

    public MyStack(){
        elements = (E[]) new Object[6];
    }

    public void push( E e){
        elements[size] = e;
        if(size == elements.length){
            ensureCapa();
        }
        size++;
    }

    public E pop(){
        if(size <= 0){
            System.out.println("Stack is empty");
        }
        E temp = elements[size-1];
        elements[size-1] = null;
        size--;
        return temp;
    }

    public E peek(){
        if(size < 0){
            System.out.println("Stack is empty");
        }
        E temp = elements[size - 1];
        return temp;
    }

    public int search(E e){
        for (int i = 0; i < elements.length; i++) {
            if(elements[i] == e){
                return i;
            }
        }
        return -1;
    }

    public void display(){
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] + " ");
        }
    }
}

