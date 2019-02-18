import java.util.*;
        import java.lang.*;

public class num2071 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        float[] testcase = new float[t];
        double[] avg = new double[t];


        for(int i = 0; i < t; i++){
            for(int j = 1; j <= 10; j++){
                testcase[i] += (float)scanner.nextInt();
            }
            avg[i] = testcase[i] / (float)10;
        }
        for(int i = 0; i < t; i++){
            System.out.println("#"+(1+i) + " " + Math.round(avg[i]));
        }

    }
}
