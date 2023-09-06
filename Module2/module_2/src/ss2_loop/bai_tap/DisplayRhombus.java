package ss2_loop.bai_tap;

public class DisplayRhombus {
    public static void main(String[] args) {

        for (int i = 1; i <= 5 ; i++) {
            for (int k = 4; k >= i; k--) {
                System.out.print(" ");
            }
            System.out.print(i);
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print(" ");
            }
            System.out.print(i + "\n");

        }
        for (int i = 4; i >= 1 ; i--) {
            for (int k = 4; k >= i; k--) {
                System.out.print(" ");
            }
            System.out.print(i);
            for (int j = 1; j <= 2*i-1 ; j++) {
                System.out.print(" ");
            }
            System.out.print(i + "\n");

        }
    }
}