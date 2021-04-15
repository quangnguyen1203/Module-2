import java.util.Arrays;
import java.util.Stack;

public class ReverseArrayUsingStack {

    public static int[] reverse(int[] data) {

        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < data.length; i++)
            stack.push(data[i]);

        for (int i = 0; i < data.length; i++)
            data[i] = stack.pop();

        return data;
    }

    public static void main(String[] args) {

        int[] a = { 41, 2, 151, 13, 43, 12 };

        System.out.println(Arrays.toString(a));

        System.out.println(Arrays.toString(reverse(a)));

    }
}