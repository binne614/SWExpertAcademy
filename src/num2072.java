import java.util.*;

public class num2072 {
    public static int oddSum(int[] arr){
        int result = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 1){
                result += arr[i];
            }
        }

        return result;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int[] arr;

        for(int i = 0; i < t; i++){
            arr = new int[10];

            for(int j = 0; j < arr.length; j++){
                arr[j] = scanner.nextInt();
            }

            System.out.print("#" + (i+1) + " ");
            System.out.println(oddSum(arr));
        }




    }
}
