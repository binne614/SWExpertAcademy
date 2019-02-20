import java.util.*;

public class num1966 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int test_case = scanner.nextInt();

        int cnt = 1;


        while(test_case != 0) {
            int num = scanner.nextInt();
            int[] arr = new int[num];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }


            for (int i = 0; i < arr.length; i++) {
                int min = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[min] > arr[j]) {
                        min = j;
                    }
                }
                if (min != i) {
                    int temp = arr[i];
                    arr[i] = arr[min];
                    arr[min] = temp;
                }
            }

            System.out.print("#" + cnt + " ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            cnt++;
            test_case--;
        }
    }
}
