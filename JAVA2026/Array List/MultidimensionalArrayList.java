import java.util.ArrayList;

public class MultidimensionalArrayList {
    public static void main(String[]args){
        ArrayList <ArrayList <Integer>> mainlist = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i=1; i<=5; i++){
            list1.add(i);
        }
        mainlist.add(list1);

        ArrayList<Integer> list2 =  new ArrayList<>();
        for (int i=1; i<=5; i++){
            list2.add(i*2);
        }
        mainlist.add(list2);

        ArrayList<Integer> list3 =  new ArrayList<>();
        for (int i=1; i<=5; i++){
            list3.add(i*3);
        }
        mainlist.add(list3);

        System.out.println("multidimensional list " + mainlist);

        ArrayList<Integer> currlist1 = mainlist.get(0);

        for (int j = 0; j < currlist1.size(); j++) {
            System.out.print(currlist1.get(j) + " ");
        }
        System.out.println();

        ArrayList<Integer> currlist2 = mainlist.get(1);

        for (int j = 0; j < currlist2.size(); j++) {
            System.out.print(currlist2.get(j) + " ");
        }
        System.out.println();
        ArrayList<Integer> currlist3 = mainlist.get(2);

        for (int j = 0; j < currlist3.size(); j++) {
            System.out.print(currlist3.get(j) + " ");
        }
    }
}
