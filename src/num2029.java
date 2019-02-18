import java.util.*;

public class num2029 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        int[] a = new int[t];
        int[] b = new int[t];

        for(int i = 0; i < t; i++){
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
        }

        int[] q = new int[t];
        int[] r = new int[t];

        for(int i = 0; i < t; i++){
            q[i] = a[i] / b[i];
            r[i] = a[i] % b[i];

            System.out.println("#" + (i+1) + " " + q[i] + " " + r[i]);
        }

    }
}
