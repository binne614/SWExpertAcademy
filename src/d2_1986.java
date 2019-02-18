import java.util.*;

public class d2_1986 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int[] n = new int[t];
        for(int i = 0; i < t; i++){
            n[i] = scanner.nextInt();
        }

        int[] result = new int [t];

        for(int i = 0; i < t; i++) {
            if (n[i] > 0 && n[i] < 11) {
                for (int j = 1; j <= n[i]; j++) {
                    if (j % 2 == 1) {
                        result[i] += j;
                    }
                    if (j % 2 == 0) {
                        result[i] -= j;
                    }
                }
            }
        }

        for(int i = 0; i < t; i++){
            System.out.println("#" + (i+1) + " " + result[i]);
        }

    }

}
