import java.util.*;

public class num1208 {

    public static int dump(int[] box, int dumcnt){
        int result;
        int max_idx = 0;
        int min_idx = 0;

        while(dumcnt != 0) {
            for (int i = 1; i < box.length; i++) {
                if (box[max_idx] < box[i] && box[max_idx] != box[i]) {

                    max_idx = i;
                }
                if (box[min_idx] > box[i] && box[min_idx] != box[i]) {

                    min_idx = i;
                }
            }

            box[max_idx]--;
            box[min_idx]++;



            if(box[max_idx] - box[min_idx] == 0 || box[max_idx] - box[min_idx] == 1)
                break;

            dumcnt--;

            for(int i = 0; i < box.length; i++){
                System.out.print(box[i] + " ");
            }
            System.out.println();
        }

        for (int i = 1; i < box.length; i++) {
            if (box[max_idx] < box[i] && box[max_idx] != box[i]) {

                max_idx = i;
            }
            if (box[min_idx] > box[i] && box[min_idx] != box[i]) {

                min_idx = i;
            }
        }


        return box[max_idx] - box[min_idx];
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int dumcnt;
        int[] box = new int[100];

        //for(int j = 0; j < 10; j++) {
            dumcnt = scanner.nextInt();
            if(dumcnt > 0 && dumcnt < 1001) {

                for (int i = 0; i < box.length; i++) {
                    box[i] = scanner.nextInt();

                }
                System.out.println("#" + " " + dump(box, dumcnt));
            }
        //}

    }
}
