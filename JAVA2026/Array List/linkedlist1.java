import java.util.ArrayList;
import java.util.Scanner;

public class linkedlist1 {
    public static void main(String []args){
        // it is a part of java collection framework

        ArrayList<Integer> list = new ArrayList<>();

        // operations on arraylist
         // add element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        // get element
        System.out.println("value at index 2 is = " + list.get(2));

        // delete element

        list.remove(2);
        System.out.println("list after removing index 2 element : " + list);

        // set element

        list.set(2 , 10);

        System.out.println(" list after adding 10 at idx 2 : " + list);

        // cheak contains element

        System.out.println(list.contains(1));
        System.out.println(list.contains(11)) ;

        // sizew of an arraylist

        System.out.println("size of arraylist is " + list.size());


    }

}
