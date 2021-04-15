public class MyStack<E> {
    public static final int DEFAULT_CAPACITY = 10;
    private int size = 0;
    private E[] elements;

    public MyStack(){
        this.elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public void push( E e){
        if(size >= DEFAULT_CAPACITY){
            System.out.println("Stack is full");
        }
        elements[size] = e;
        size++;
    }

    public E pop(){
        if(size <= 0){
            System.out.println("Stack is empty");
        }
        E temp = elements[size - 1];
        elements[size - 1] = null;
        --size;
        return temp;
    }

    public E peek(){
        if(size <= 0){
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

