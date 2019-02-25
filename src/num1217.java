import java.util.*;

public class num1217 {
    public static int power(int num, int cnt){
        if(cnt == 0) return 1;

        return num*power(num,cnt-1);
        /*
        * 2의 5제곰
        * =  2 * 2의 4제곰
        * */
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        for(int i = 1; i <= 10; i++) {
            int testcaseNum = scanner.nextInt();
            int num = scanner.nextInt();
            int cnt = scanner.nextInt();

            System.out.print("#" + i + " ");
            System.out.println(power(num, cnt));
        }
    }
}
