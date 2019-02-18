import java.util.*;
import static java.lang.Math.pow;

public class num2019 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int num = 0;

        for(int i = 0; i < n+1; i++){
            //System.out.print((int)pow(2,i) + " ");
            num = 1;

            for(int j = 0; j < i; j++){
                num = num * 2;
            }
            System.out.print(num + " ");
        }
    }
}
