import java.util.*;

public class num1208 {

    public static int dump(int[] box, int dumpcnt){
        int max = 0, min = 0;
        int maxidx = 0, minidx = 0;

        // 덤프 작업
        while(dumpcnt != 0) {
            dumpcnt--;

            max = box[0];
            min = box[0];

            maxidx = 0;
            minidx = 0;
            for (int i = 0; i < box.length; i++) {
                //최대값
                if (box[i] > max) {
                    max = box[i];
                    maxidx = i;
                }
                //최소값
                if (box[i] < min) {
                    min = box[i];
                    minidx = i;
                }
            }
            box[maxidx] = box[maxidx] - 1;
            box[minidx] = box[minidx] + 1;


        }


        for(int i = 0; i < box.length-1; i++){
            max = i;
            for(int j = i+1; j < box.length; j++){
                if(box[max] < box[j]){
                    max = j;
                }
            }
            if(max != i){
                int temp = box[max];
                box[max] = box[i];
                box[i] = temp;
            }
        }

        return box[0] - box[box.length-1];




    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        for(int t = 1; t <= 10; t++) {
            int dumpcnt = scanner.nextInt();

            int[] box = new int[100];
            for (int i = 0; i < box.length; i++) {
                box[i]= scanner.nextInt();
            }

            System.out.println("#" + t + " " + dump(box, dumpcnt));
        }

    }
}
