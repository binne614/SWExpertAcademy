import java.util.*;

public class SWPS_4_3 {

    public static int min(int[][] arr){

        int minX = 0;
        int minY = 0;
        int min = arr[0][0];

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(min > arr[i][j]){
                    min = arr[i][j];
                    minX = i;
                    minY = j;
                }
            }
        }
        arr[minX][minY] = 26;

        return min;
    }
    public static void sorting(int[][] arr){
        int[][] sortArr = new int[5][5];
        int cur_min = -1;
        int X = 0;
        int Y = 0;
        int newX = 0, newY = 0;

        int dx[] = {1, 0, -1, 0};
        int dy[] = {0, 1, 0, -1};
        int dir_stat = 0;

        for(int i = 0; i < 25; i++){
            cur_min = min(arr);
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
        }

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(sortArr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int[][] arr = {
                {9, 20, 2, 18, 11},
                {19, 1, 25, 3, 21},
                {8, 24, 10, 17, 7},
                {15, 4, 16, 5, 6},
                {12, 13, 22, 23, 14}
        };

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        sorting(arr);


    }
}
