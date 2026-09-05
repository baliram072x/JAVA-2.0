import java.util.ArrayList;
import java.util.Collections;

public class SortingAnArrayList {
   public  static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(2);
       System.out.println(list);
       Collections.sort(list); // asending order
       System.out.println(list);

       // descending sort
       Collections.sort(list , Collections.reverseOrder());
       System.out.println(list);
       //Comparator - functions logic
   }
}

