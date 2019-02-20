import java.util.*;

public class SWPS_4_3 {

    static int minX = 0;
    static int minY = 0;
    public static int min(int[][] arr){
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
        arr[minX][minY] = 999;

        return min;
    }
    public static int[][] sorting(int[][] arr){
        int[][] sortArr = new int[5][5];

        int dx[] = {1, -1, 0, 0};
        int dy[] = {0, 0, 1, -1};

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                sortArr[i][j] = min(arr);
            }
        }
        return sortArr;
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

        int[][] result = sorting(arr);

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(result[i][j]);
            }
            System.out.println();
        }

    }
}
