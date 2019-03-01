import java.util.*;

public class num4406 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int test_case = scanner.nextInt();

        for(int i = 0; i < test_case; i++){
            String sentence = scanner.nextLine();
            String result = "";


            for(int j = 0; j < sentence.length(); i++) {
                char temp = sentence.charAt(j);
                if(temp == 'a' || temp == 'i' || temp == 'u' || temp == 'e' || temp == 'o'){
                    continue;
                }
                else{
                    result += temp;
                }
                System.out.print("#" + (i+1)+ " " + result);

            }


        }
    }
}
