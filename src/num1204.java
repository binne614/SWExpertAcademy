import java.util.*;

public class num1204 {
    public static int frequency(int[] score){
        int max = 0;
        int result = 0;
        for(int i = 0; i < 101; i++){
            if(score[i] >= max){
                max = score[i];
                result = i;
            }

        }

        return result;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int num = scanner.nextInt();
        int[] score;

        for(int i = 0; i < t; i++) {
            if (num <= t) {
                score = new int[101];

                for (int j = 0; j < 1000; j++) {
                    int k = scanner.nextInt();
                    score[k]++;
                }
                System.out.print("#" + (i + 1) + " " + frequency(score));
            }
            System.out.println();
        }

    }
}
