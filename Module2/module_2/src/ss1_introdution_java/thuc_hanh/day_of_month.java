package ss1_introdution_java.thuc_hanh;

import java.util.Scanner;

public class day_of_month {
    public static void main(String[] args) {
        System.out.println("Which month do u wanna count days: ");
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        switch (month){
            case 2:
                System.out.println("The Month " + month + "Has 28 or 29 days");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("The month" + month + "Has 31 days!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("The Month " + month + "Has 30 days!");
            default:
                System.out.println("Invalid Input!");
                break;
        }
    }
}
