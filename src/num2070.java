import java.util.*;

public class num2070 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int[][] testcase = new int[t][2];

        for(int i = 0; i < t ; i++){
            for(int j = 0; j < 2; j++){
                testcase[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < t; i++){
            if(testcase[i][0] < testcase[i][1])
                System.out.println("#" + (i+1) + " " + "<");
            else if(testcase[i][0] > testcase[i][1])
                System.out.println("#" + (i+1) + " " + ">");
            else
                System.out.println("#" + (i+1) + " " + "=");
        }
    }
}
