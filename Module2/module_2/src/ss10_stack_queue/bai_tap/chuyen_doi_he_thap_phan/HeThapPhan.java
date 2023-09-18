package ss10_stack_queue.bai_tap.chuyen_doi_he_thap_phan;

import java.util.Scanner;
import java.util.Stack;

public class HeThapPhan {
    public String chuyenDoiHeThapPhan(int num) {
        Stack stack = new Stack();
        String soNhiPhan = "";
        int soDu;
        for (int i = 0; i < num; ) {
            soDu = num % 2;
            stack.push(soDu);
            num = num / 2;
        }
        int lengthOfStack = stack.size();
        for (int i = 0; i < lengthOfStack; i++) {
            soNhiPhan += stack.pop();
        }
        return soNhiPhan;
    }

    public static void main(String[] args) {
        HeThapPhan heThapPhan = new HeThapPhan();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Số bạn Muốn tính nhị phân của số đó");
        int num = sc.nextInt();
        System.out.println("Số Nhị Phân Của Số " + num + " là:" );
        System.out.println(heThapPhan.chuyenDoiHeThapPhan(num));
    }
}
