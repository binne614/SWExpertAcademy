import java.util.*;

public class SWPS_BubbleSort {

    public static int[] makeArr(){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] arr = new int[t];

        for(int i = 0; i < t; i++){
            arr[i] = scanner.nextInt();
        }

        return arr;
    }

    public static int[] bubbleSort(){

        int[] arr = makeArr();
        int temp;

        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length -i -1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }

   public static void main(String[] args) {

       int arr[];

       arr = bubbleSort();

       for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i] + " ");
       }
   }
}
