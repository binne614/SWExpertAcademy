import java.util.*;

public class num2058 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int check = 1000;
        int sum = 0;

        if(N > 0 && N < 10000){
            while(check > 0){
                if(N / check > 0){
                    sum += N / check;
                    N %= check;
                }
                check /= 10;
            }
        }

        System.out.print(sum);

    }

}
