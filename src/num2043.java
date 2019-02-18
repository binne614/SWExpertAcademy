import java.util.*;

public class num2043{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int P = scanner.nextInt();
        int K = scanner.nextInt();
        int cnt = 1;

        while(P != K){
            K++;
            cnt++;
        }
        System.out.println(cnt);

    }
}