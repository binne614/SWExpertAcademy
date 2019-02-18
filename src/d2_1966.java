import java.util.*;

public class d2_1966 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int N = scanner.nextInt();

        int[][] num;


        for(int i = 0; i < t; i++) {

            num = new int[t][N];

            for (int j = 0; j < N; j++) {
                num[i][j] = scanner.nextInt();
            }


            for (int k = N - 1; k >= 0; k--) {
                for (int j = k - 1; j >= 0; j--) {
                    if (num[i][k] < num[i][j]) {
                        int temp = num[i][k];
                        num[i][k] = num[i][j];
                        num[i][j] = temp;
                    }
                }
            }



            System.out.print("#" + (i+1) + " " );
            for (int j = 0; j < N; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}
