import java.util.*;

public class num1209 {


    public static int sum(int[][] arr){

        int result = 0;


        // 가로 최대
        for(int i = 0; i < arr.length; i++){
            int temp = 0;
            for(int j = 0 ; j < arr.length; j++){
                temp += arr[i][j];
            }

            if(result < temp){
                result = temp;
            }
        }
        // 세로 최대
        for(int i = 0; i < arr.length; i++){
            int temp = 0;
            for(int j = 0; j < arr.length; j++){
                temp += arr[j][i];
            }

            if(result < temp){
                result = temp;
            }
        }
        //대각선
        for(int i = 0 ; i < arr.length; i++){
            int temp = 0;
            temp += arr[i][i];
            if(result < temp){
                result = temp;
            }
        }

        for(int i = 0; i < arr.length; i++){
            int temp = 0;
            temp += arr[i][arr.length - i - 1];
            if (result < temp) {
                result = temp;
            }
        }


        return result;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        for(int t = 1; t <= 10; t++){
            int num = scanner.nextInt();
            int[][] arr = new int[100][100];

            for(int i = 0; i < arr.length; i++){
                for(int j = 0 ; j < arr.length; j++){
                    arr[i][j] = scanner.nextInt();
                }
            }
            System.out.print("#" + t + " ");
            System.out.println(sum(arr));



        }
    }
}
