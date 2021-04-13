import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> array = new MyList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(3,2);
        for (int i = 0; i < array.getSize(); i++) {
            System.out.println(array.get(i));
        }
        System.out.println("**************************");
        array.remove(2);
        for (int i = 0; i < array.getSize(); i++) {
            System.out.println(array.get(i));
        }
        System.out.println("**************************");
        MyList<Integer> arr = array.clone();
        for (int i = 0; i < arr.getSize(); i++) {
            System.out.println(arr.get(i));
        }
        System.out.println("**************************");
        System.out.println(array.contains(7));
        System.out.println("**************************");
        System.out.println(array.indexOf(7));
    }
}
