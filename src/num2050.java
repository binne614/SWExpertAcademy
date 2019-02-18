import java.util.*;
//import java.lang.String;

public class num2050 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.next();
        String[] array_word;

        //배열에 한글자씩 저장
        array_word = text.split("");


        for(int i = 0; i < array_word.length; i++){
            System.out.print((array_word[i].hashCode()-64)+" ");
        }

    }

}
