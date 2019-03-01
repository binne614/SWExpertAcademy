import java.util.*;
import java.util.Stack;

public class num1222 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        for(int t = 1; t <= 10; t++){
            int sum = 0;
            int length = scanner.nextInt();

            String input = scanner.next();

            Stack<Character> oper = new Stack<>();
            Stack<Integer> number = new Stack<>();

            for(int i = 0; i < length; i++){
                if(input.charAt(i) == '+'){
                    oper.push(input.charAt(i));
                }
                else{
                    number.push(input.charAt(i)-48);
                }
            }

            int cnt = number.size();
            for(int i = 0; i < cnt; i++){
                int temp = number.pop();

                sum += temp;
            }

            System.out.println("#" + t + " " + sum);
        }


    }
}
