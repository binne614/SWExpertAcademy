import java.util.*;
public class num1215 {

    public static int palindrome(char[][] arr, int num){
        int cnt = 0;
        boolean check;

        for(int i = 0; i < arr.length; i++){
            check = true;
            for(int j = 0; j < (arr.length - num + 1); j++){
                check = true;
                for(int m = 0; m < num / 2; m++){
                    if(arr[i][j+m] != arr[i][j + num - m -1]){
                        check = false;
                        break;
                    }
                }
                if(check){
                    cnt++;
                }
            }
        }

        for(int i = 0; i < arr.length; i++){
            check = true;
            for(int j = 0; j < (arr.length - num + 1); j++){
                check = true;
                for(int m = 0; m < num / 2; m++){
                    if(arr[j+m][i] != arr[j + num - m -1][i]){
                        check = false;
                        break;
                    }
                }
                if(check){
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        for(int t = 1; t <= 10; t++){
            int num = scanner.nextInt();

            char[][] arr = new char[8][8];
            for(int i = 0; i < arr.length; i++){
                arr[i] = scanner.next().toCharArray();
            }
            System.out.println("#" + t + " " + palindrome(arr, num));
        }
    }
}
