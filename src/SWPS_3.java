public class SWPS_3 {
    public static void main(String[] args){
        int arr[] = {-7, -3, -2, 5, 8};

        int ret = 0;
        // (1 << arr.length) : 부분집합의 개수
        for(int i = 1; i < (1 << (arr.length)); i++){
            int sum = 0;

            // 원소의 수만큼 비트를 비교함
            for(int j = 0; j < arr.length; j++){

                // i의 j 번째 비트가 1이면 j번째 원소 출력
                if((i & (1 << j)) == 1){
                    sum += arr[i];
                }
            }
            if(sum == 0){
                ret = 1;
                break;
            }
        }
        System.out.print((ret == 1) ? "True" : "False");
    }
}
