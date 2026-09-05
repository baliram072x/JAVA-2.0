public class BubbleSort {
    public static void main(String [] args){
     int arr[] = { 4,8,6,2,10,12};
     bubbleSort(arr);
     printArr(arr);
    }

    public static  void bubbleSort(int arr[]){
     int turn ,j;

     for(turn = 0; turn< arr.length-1; turn++){
         for(j=0; j<arr.length-1-turn; j++){
             if(arr[j] > arr[j+1]){
                 // swap
                 int temp = arr[j];
                 arr[j] = arr[j+1];
                 arr[j+1] = temp;
              }
           }
        }
    }

    public static void printArr(int arr[]){
        for (int i =0; i<arr.length; i++ ) {
            System.out.print(arr[i] +" ");
        }
    }
}

