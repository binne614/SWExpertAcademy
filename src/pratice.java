import java.util.*;


public class pratice {
    public static void main(String[] args){
        String X = new String("Hello");

        for(int i = X.length()-1; i>=0; i--){
            System.out.print(X.charAt(i));
        }
        StringBuffer sb = new StringBuffer();
        sb.append(X);

        System.out.println(sb.reverse());

    }


}
