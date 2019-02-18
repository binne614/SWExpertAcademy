import java.util.*;

public class SWPS_1 {
    public static int gravity(int N, int M, int[][] box) {

        int result = 0;

        for(int i = 0; i < M; i++){
            int cnt = 0;

            for(int j = 0; j < N ; j++){
                if(box[0][i] == 1 && box[j][i] == 0){
                    cnt++;
                }
            }
            if(result < cnt){
                result = cnt;
            }
        }

        return result;

    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        /*
        N : 가로
        M : 세로
         */
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int height;
        int[][] box = new int[N][M];

        for(int i = 0; i < N; i++){
            height = scanner.nextInt();
            for(int j = 0; j < height; j++){
                box[i][j] = 1;
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                System.out.print(box[i][j]);
            }
            System.out.println();
        }

        System.out.println(gravity(N,M,box));
    }
}
