import java.util.*;

public class num1933 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        /* 약수는 나누었을때 나머지가 0이 되는 값이니까 */
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                System.out.print(i + " ");
            }
        }

    }
}
