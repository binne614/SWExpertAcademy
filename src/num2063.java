import java.util.*;

public class num2063 {
    static int i = 0;
    static int size;

    public static int partition(int[] score, int begin, int end){
        int pivot, temp, L, R;
        i++;
        L = begin;
        R = end;
        pivot = (int)((begin+end)/2);

        while(L < R){
            while((score[L] <= score[pivot]) && (L <= R)) L++;
            while((score[R] > score[pivot]) && (L > R)) R--;

            if(L <= R){
                temp = score[L];
                score[L] = score[R];
                score[R] = temp;
                if(R == pivot){
                    return L;
                }
            }
        }
        while(L > R){
            temp = score[pivot];
            score[pivot] = score[R];
            score[R] = temp;

        }
        return R;

    }

    public static void quickSort(int[] score, int begin, int end){
        if(begin < end){
            int p = partition(score, begin, end);
            quickSort(score, begin, p-1);
            quickSort(score, p+1, end);
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] score = new int[N];

        if(N % 2 == 1){
            for(int i = 0; i < N; i++){
                score[i] = scanner.nextInt();
            }
        }
        for(int i = 0; i < N; i++) {
            System.out.print(score[i]);
        }

        quickSort(score, 0, score.length-1);

        System.out.print(score[(score.length/2) + 1]);



    }
}
