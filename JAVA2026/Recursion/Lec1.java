public class Lec1 {
    public static void main(String[]args){
    // print numbers from n to 1 (decresing order )
        printDec(9);
    }
    public static void printDec(int n){
        if (n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n + " ");
        printDec(n-1);
    }

    public static void printInc(int n){
        if (n == 1){
            System.out.println(n);
            return;
        }
        printInc(n-1);
        System.out.println(n + " ");

    }
}



/*

 */