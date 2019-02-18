import java.util.*;

public class num1989 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        String text;

        for(int i = 1; i <= t; i++) {

            text = scanner.next();
            String reverse = reverseString(text);

            System.out.print("#" + i + " ");
            System.out.println(text.equals(reverse) ? 1 : 0);
        }


    }

    private static String reverseString(String text) {
        return ( new StringBuilder(text)).reverse().toString();
    }
}
