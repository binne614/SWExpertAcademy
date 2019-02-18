import java.util.*;

public class num1936 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(a == 1){
            switch(b){
                case 2:
                    System.out.print("B");
                case 3:
                    System.out.print("A");
            }
        }
        if(a == 2){
            switch (b){
                case 1:
                    System.out.print("A");
                case 3:
                    System.out.print("B");
            }
        }
        if(a == 3){
            switch (b){
                case 1:
                    System.out.print("B");
                case 2:
                    System.out.print("A");
            }
        }



    }

}
