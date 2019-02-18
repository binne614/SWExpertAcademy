import java.util.*;

public class num1945 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int test_case = scanner.nextInt();
        for(int j = 1; j <= test_case; j++) {
            int num = scanner.nextInt();
            int temp = num;

            int[] cnt = new int[5];
            int[] key = {2, 3, 5, 7, 11};
            int rest = 0;

            for (int i = 0; i < key.length; i++) {

                do {
                    rest = temp % key[i];

                    if (rest != 0) {
                        continue;
                    }
                    temp /= key[i];
                    cnt[i]++;

                } while (rest == 0);

            }

            System.out.print("#" + j + " ");

            for (int i = 0; i < cnt.length; i++) {
                System.out.print(cnt[i] + " ");
            }

            System.out.println();
        }


    }
}
