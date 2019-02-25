import java.util.*;

public class num2063 {
    public static int mid(int[] arr){

        for(int i = 0; i < arr.length-1; i++){
            int min = i;
            for(int j = i+1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if(min != i){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }

        return arr[arr.length / 2];
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[] arr = new int[num];

        for(int i = 0; i < num; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.print(mid(arr));

    }
}
