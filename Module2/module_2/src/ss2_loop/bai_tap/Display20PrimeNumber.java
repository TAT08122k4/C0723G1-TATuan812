package ss2_loop.bai_tap;

public class Display20PrimeNumber {
    public static void main(String[] args) {
        int count = 1;
        int num = 2;
        int countPrime;
        while (count <= 20) {
             countPrime = 0;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    countPrime++;
                }
            }
            if (countPrime == 0) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}
