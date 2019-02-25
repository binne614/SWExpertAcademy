import java.util.*;

public class num1210 {
    public static int ladder(int[][] arr){

        int result=0;
        int X = 0, Y = 0, newX = 0, newY = 0;

        int dx[] = {1, 0, -1};
        int dy[] = {0, -1, 0};

         /*   cur_min = min(arr);
            X = newX;
            Y = newY;
            sortArr[Y][X] = cur_min;

            newX = X + dx[dir_stat];
            newY = Y + dx[dir_stat];

            // 경계면에서 방향 바꾸기
            if(sortArr[newY][newX] != 0 || newY > 4 || newX > 4){
                dir_stat = (dir_stat + 1) % 4;
                newX = X + dx[dir_stat];
                newY = Y + dy[dir_stat];
            }
            */
        while(arr[99][X] != 2) {

            if (arr[Y][X] == 1) {
                int dir_stat = 0;
                arr[Y][X] = 99;
                dir_stat = (dir_stat + 1) % 3;
                X = X + dx[dir_stat];
                Y = Y + dy[dir_stat];

            }

        }
        if(arr[X][Y] == 2){
            result = X;
        }


        return result;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        for(int t = 1; t <=10; t++){
            int num = scanner.nextInt();
            int[][] arr = new int[100][100];

            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j <arr.length; j++){
                    arr[i][j] = scanner.nextInt();
                }
            }

            System.out.print("#" + t + " ");
            System.out.println(ladder(arr));
        }


    }
}
