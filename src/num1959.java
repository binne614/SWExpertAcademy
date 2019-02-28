import java.util.*;

public class num1959 {
    public static int cal(int N, int M, int[] Aarr, int[] Barr){
        int result = 0;
        int temp;

        for(int i = 0; i <= M - N ; i++){
            temp = 0;
            for(int j = 0; j < N; j++){
                    temp = temp + (Barr[i + j] * Aarr[j]);
            }
            if(result < temp){
                result = temp;
            }
        }

        for(int i = 0; i <= N - M ; i++){
            temp = 0;
            for(int j = 0; j < M; j++){
                temp = temp + (Aarr[i + j] * Barr[j]);
            }
            if(result < temp){
                result = temp;
            }
        }


        return result;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int testcase = scanner.nextInt();
        for(int t = 1; t <= 10; t++){
            int N = scanner.nextInt();
            int M = scanner.nextInt();


            int[] Aarr = new int[N];
            for(int  i = 0; i < N; i++){
                Aarr[i] = scanner.nextInt();
            }

            int[] Barr = new int[M];
            for(int  i = 0; i < M; i++){
                Barr[i] = scanner.nextInt();
            }


            System.out.println("#" + t + " " + cal(N, M, Aarr, Barr));
        }




    }
}
