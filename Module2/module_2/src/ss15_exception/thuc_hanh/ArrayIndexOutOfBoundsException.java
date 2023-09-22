package ss15_exception.thuc_hanh;

import javafx.scene.control.RadioMenuItem;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public Integer[] createRandom(){
        Random random = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("danh sách các phần tử trong mảng: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException();
        Integer[] arr = arrayIndexOutOfBoundsException.createRandom();

        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập chỉ số của một phần tử bất kì: ");
        int x = sc.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("chỉ số vượt quá giới hạn của mảng");
        }
    }
}
