package ss16_IO_Text_File.bai_tap.copy_text_file;

import ss16_IO_Text_File.thuc_hanh.tim_gia_tri_lon_nhat.ReadAndWriteFile;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CopyFile copyFile = new CopyFile();
        List<String> list = copyFile.readFileText("E:\\CodeGym FullTime\\Module2\\module_2\\src\\ss16_IO_Text_File\\bai_tap\\copy_text_file\\case_study.khu_nghi_duong_furama.data.txt");
        copyFile.writeFile("E:\\CodeGym FullTime\\Module2\\module_2\\src\\ss16_IO_Text_File\\bai_tap\\copy_text_file\\result.txt");
        System.out.println(copyFile.countStr());

    }

//    public static int countSymbol(List<String> list) {
//        int count = 0;
//        for (String str : list) {
//            String[] arr = str.split("");
//            count += arr.length;
//
//        }
//        return  count;
//    }
}
