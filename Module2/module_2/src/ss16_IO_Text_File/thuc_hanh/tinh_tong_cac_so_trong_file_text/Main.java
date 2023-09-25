package ss16_IO_Text_File.thuc_hanh.tinh_tong_cac_so_trong_file_text;

import java.util.Scanner;

public class Main {
    private static final String FILE = "E:\\CodeGym FullTime\\Module2\\module_2\\src\\ss16_IO_Text_File\\thuc_hanh\\tinh_tong_cac_so_trong_file_text\\numbers.txt";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SumInteger readfileEx = new SumInteger();
        readfileEx.readFileText(FILE);
    }
}
