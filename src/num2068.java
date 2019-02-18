import java.util.*;

public class num2068 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        int[][] num = new int[t][10];

        for(int j = 0; j < t; j++) {
            for (int i = 0; i < 10; i++) {
                num[j][i] = scanner.nextInt();
            }
        }

        for(int j = 0; j < t; j++) {
            int max = 0;

            for (int i = 0; i < 10; i++) {
                if (max < num[j][i]) {
                    max = num[j][i];
                }


            }
            System.out.println("#"+ (j+1) + " " + max);
        }


    }
}
