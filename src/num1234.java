import java.util.*;

public class num1234 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        for(int t = 1; t <= 10; t++){
            int size = scanner.nextInt();
            String num = scanner.next();
            List<Character> list = new ArrayList<>();

            for(int i = 0; i < size; i++){
                list.add(num.charAt(i));
            }

            while(true){
                boolean check = false;
                for(int i = 0; i < list.size()-1; i++){
                    if(list.get(i) == list.get(i+1)){
                        check = true;
                        list.remove(i);
                        list.remove(i);
                        break;
                    }
                }
                if(!check) break;
            }

            System.out.print("#" + t + " ");
            for(int k = 0; k < list.size(); k++){
                System.out.print(list.get(k));
            }
            System.out.println();
        }

    }

}
