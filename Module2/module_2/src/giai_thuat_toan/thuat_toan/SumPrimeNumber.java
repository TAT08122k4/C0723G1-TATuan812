import java.util.ArrayList;

public class SumPrimeNumber {
    public static void main(String[] args) {
        int arr [] = {3,5,2,2,3,8,11};
        ArrayList<Integer> arrayList = new ArrayList<>();
        int a = 0;
        boolean flag = true;
        int sum = 0;
        while (a < arr.length){
            flag = true;
            for (int i = 2; i < Math.sqrt(arr[a])  ; i++) {
                if (arr[a] % i == 0){
                    flag = false;
                }
            }
            if (flag){
                arrayList.add(arr[a]);
            }
        }
        for (int i = 0; i < arrayList.size() ; i++) {
            sum += arrayList.get(i);
        }
        System.out.println(sum);
    }
}
