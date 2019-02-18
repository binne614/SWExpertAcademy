import java.util.*;

public class num3431 {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        int L, U, X;

        for(int test_case = 1; test_case <= t; test_case++){
            L = scanner.nextInt();
            U = scanner.nextInt();
            X = scanner.nextInt();

            if(X < L){
                System.out.println("#" + test_case + " " + (L-X));
            }
            else if(X > U){
                System.out.println("#" + test_case + " " + "-1");
            }
            else{
                System.out.println("#" + test_case + " " + "0");
            }
        }
    }
}
