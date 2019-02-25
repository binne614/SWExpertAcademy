import java.util.*;

public class num1959 {
    public static int mul(int[] A, int[] B){
        int result = 0;
        int temp = 0;
        int cnt = A.length;

        for(int i = 0; i < A.length; i++){
            result = A[i] * B[i];
        }

        return result;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int test_case = scanner.nextInt();
        for(int t = 1; t <= test_case; t++) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();

            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }
            int[] B = new int[M];
            for (int i = 0; i < M; i++) {
                B[i] = scanner.nextInt();
            }
        }
    }
}
