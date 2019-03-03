import java.util.*;

public class num7102 {
    public static void max(int[] arr){
        int max = 0;

        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == max){
                System.out.print(i + " ");
            }
        }

    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int test_case = scanner.nextInt();

        for(int t = 1; t <= test_case; t++){
            int N = scanner.nextInt();
            int M = scanner.nextInt();

            int[] arr = new int[41];

            for(int i = 1; i <= N; i++){
                for(int j = 1; j <= M; j++){
                    arr[i + j]++;
                }
            }
            System.out.print("#" + t + " " );
            max(arr);
            System.out.println();
        }
    }
}
