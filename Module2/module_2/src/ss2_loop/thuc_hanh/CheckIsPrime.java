package ss2_loop.thuc_hanh;

import java.util.Scanner;

public class CheckIsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = sc.nextInt();
        boolean check = true;
        if (number < 2) {
            System.out.println(number + " Is Not a prime");
        } else {
            check = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    System.out.println(number + "is not a prime");
                    check = false;
                    break;
                }
                i++;
            }
        }
        if (check == true){
            System.out.println(number + "is a Prime");
        }
    }
}
