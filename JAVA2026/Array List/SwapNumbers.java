import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SwapNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

    // method 1
        int temp = list.get(1);

        list.set(1, list.get(3));
        list.set(3, temp);

        System.out.println(list);

        // another method

        Collections.swap(list, 1, 2 );
        System.out.println(list);
    }
}

