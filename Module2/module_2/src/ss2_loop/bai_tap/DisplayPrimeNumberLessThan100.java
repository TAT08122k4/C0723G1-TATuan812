package ss2_loop.bai_tap;

public class DisplayPrimeNumberLessThan100 {
    public static void main(String[] args) {
        int num = 2;
        while (num < 100){
            int countPrime = 0;
            for (int i = 2; i < num; i++) {
             if (num % i ==0){
                 countPrime++;
             }
            }
            if (countPrime == 0){
                System.out.println(num);
            }
            num++;
        }
    }
}
