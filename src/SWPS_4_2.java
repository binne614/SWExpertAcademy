import java.util.*;

public class SWPS_4_2 {

    public static int[] selectSort(int[] arr){

        int min = 0;
        for(int i = 0; i < arr.length-1; i++){
            min = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            if(min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            arr[i] = scanner.nextInt();
        }


        int[] result = selectSort(arr);

        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
