package ss1_introdution_java.bai_tap;
import java.util.Scanner;
public class ReadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number:");
        int number = sc.nextInt();
        String[] onesUnit = {"", "one", "two", "third", "Four", "Five", "Six", "Seven", "eight", "nine"};
        String[] tenToNineteen = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tensUnit = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        int onesUnitWord = number % 10;
        int hundredUnitWord = number / 100;
        int dozens = (number - hundredUnitWord * 100) / 10;
        if (number > 0 && number < 1000) {
            if (number > 99) {
               if (onesUnitWord == 0 && dozens == 0){
                   System.out.println(onesUnit[hundredUnitWord] + "Hundred");
               }else if (onesUnitWord != 0 && dozens == 0){
                   System.out.println(onesUnit[hundredUnitWord] + "Hundred" + " and " + onesUnit[onesUnitWord]);
               }else if (dozens == 1){
                   System.out.println(onesUnit[hundredUnitWord]  + "Hundred" + " and " + tenToNineteen[onesUnitWord]) ;
               }else if (onesUnitWord == 0){
                   System.out.println(onesUnit[hundredUnitWord] + "Hundred" + " and " + tensUnit[dozens]);
               }else {
                   System.out.println(onesUnit[hundredUnitWord] + "Hundred" + " and " + tensUnit[dozens] + onesUnit[onesUnitWord]);
               }
            } else if (number > 19) {
                System.out.println(tensUnit[dozens] + onesUnit[onesUnitWord]);
            } else if (number > 9){
                System.out.println(tenToNineteen[onesUnitWord]);
            }else {
                System.out.println(onesUnit[onesUnitWord]);
            }
        } else if (number == 0) {
            System.out.println("zero");
        }else {
            System.out.println("Out of Ability");
        }
    }
}

