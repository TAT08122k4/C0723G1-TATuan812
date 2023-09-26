package ss16_IO_Text_File.thuc_hanh.tim_gia_tri_nho_nhat;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadAndWrite readAndWrite = new ReadAndWrite();
        List<Integer> numbers = readAndWrite.readNum("E:\\CodeGym FullTime\\Module2\\module_2\\src\\ss16_IO_Text_File\\thuc_hanh\\tim_gia_tri_nho_nhat\\date.txt");
        int min = min(numbers);
        ReadAndWrite.writeNum("E:\\CodeGym FullTime\\Module2\\module_2\\src\\ss16_IO_Text_File\\thuc_hanh\\tim_gia_tri_nho_nhat\\result.txt",min);
    }
    public static int min(List<Integer> numbers){
        int min = numbers.get(0);
        for (int i = 1; i < numbers.size() ; i++) {
            if (min > numbers.get(i)){
                min = numbers.get(i);
            }
        }
    return min;
    }
}
