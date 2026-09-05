import java.util.ArrayList;

public class FindMax {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(2);
        list.add(9);
        list.add(4);
//
        int max = list.get(0);
        for (int i=0; i< list.size(); i++){
            if (list.get(i) > max){
                max = list.get(i);
            }
        }
        System.out.println(max);


        // 2nd method
//        int max = Integer.MIN_VALUE;
//        for (int i=0; i< list.size(); i++){
//            if (max < list.get(i)){
//                max = list.get(i);
//            }
//        }
//        System.out.println(max);

    }
}
