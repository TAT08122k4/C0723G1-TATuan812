package ss10_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class HeThapPhan {
    public String chuyenDoiHeThapPhan(int so) {
        Stack stack = new Stack();
        String soNhiPhan = "";
        int soDu;
        for (int i = 0; i < so; ) {
            soDu = so % 2;
            stack.push(soDu);
            so = so / 2;
        }
        int chieuDaiCuaStack = stack.size();
        for (int i = 0; i < chieuDaiCuaStack; i++) {
            soNhiPhan += stack.pop();
        }
        return soNhiPhan;
    }

    public static void main(String[] args) {
        HeThapPhan heThapPhan = new HeThapPhan();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Số bạn Muốn tính nhị phân của số đó");
        int so = sc.nextInt();
        System.out.println("Số Nhị Phân Của Số " + so + " là:" );
        System.out.println(heThapPhan.chuyenDoiHeThapPhan(so));
    }
}
