package ss2_loop.bai_tap;

public class Display20PrimeNumber {
    public static void main(String[] args) {
        int count = 1;
        int num = 2;
        while (count <= 20) {
            int countPrime = 0;
            for (int i = 2; i < num; i++) {
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
