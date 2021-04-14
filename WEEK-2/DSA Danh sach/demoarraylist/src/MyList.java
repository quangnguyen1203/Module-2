import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity){
        elements = new Object[capacity];
    }

    private void ensureCapa(){
      int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }



    public void add(int index, E e){
        for(int i = size ; i > index; i--){
            elements[i] = elements[i-1];
        }
        elements[index] = e;
        size++;
    }

    public void remove(int index){
        for (int i = index; i < size; i++) {
            Object temp = elements[i];
            elements[i] = elements[i+1];
            elements[i+1] = temp;
        }
        size--;
    }

    public MyList<E> clone(){
        System.out.println("Array mới");
        MyList<E> result = new MyList<E>();
        for (int i = 0; i < size ; i++) {
            result.add(this.get(i));
        }

        return result;
    }

    public boolean contains(E o){
        for (int i = 0; i < size ; i++){
            if (this.get(i) == o){
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o){
        for(int i = 0; i < size; i++){
            if (this.get(i) ==o){
                return i;
            }
        }
        return -1;
    }

    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }

    public void display(){
        for (int i = 0; i < size ; i++) {
            System.out.print(elements[i] + "  ");
        }
    }



    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
