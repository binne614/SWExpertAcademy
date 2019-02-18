import java.util.*;

public class num1284 {

    public static int payment(int P, int Q, int R, int S, int W){
        int apay = P * W;
        int bpay = 0;

        if(W <= R){
            bpay = Q;
        }
        else{
            bpay = Q + (S * (W-R));
        }

        return (apay > bpay) ? bpay : apay;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int P;
        int Q;
        int R;
        int S;
        int W;

        int t = scanner.nextInt();

        for(int test_case = 1; test_case <= t; test_case++){
            P = scanner.nextInt();
            Q = scanner.nextInt();
            R = scanner.nextInt();
            S = scanner.nextInt();
            W = scanner.nextInt();

            System.out.println("#"+ test_case + " " + payment(P, Q, R, S, W));
        }

    }
}
