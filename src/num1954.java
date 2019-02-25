import java.util.*;

public class num1954 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int test_case = scanner.nextInt();
        int num = 1;
        int curX, curY;

        for(int i = 1; i <= test_case; i++){
            int n = scanner.nextInt();

            int[][] arr = new int[n][n];
            int[][] cnt = new int[n][n];

            for(int x = 0; x < n; x++){
                curX = x;
                for(int y = 0; y < n; y++){
                    curY = y;
                    if(cnt[x][y] == 0 && curY < n){
                        arr[x][y] = num;
                        num++;
                    }
                    cnt[x][y] = 1;
                }
            }

        }

    }
}
