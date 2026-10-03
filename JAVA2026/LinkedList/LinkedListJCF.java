import java.util.LinkedList;

public class LinkedListJCF {
    public static void main(String[]args){
        // create
        LinkedList<Integer> ll = new LinkedList<>();

        // add
        ll.addLast(4);
        ll.addLast(3);
        ll.addFirst(2);

        System.out.println(ll);


        // remove
        ll.removeLast();
        ll.removeFirst();

        System.out.println(ll);


    }
}
