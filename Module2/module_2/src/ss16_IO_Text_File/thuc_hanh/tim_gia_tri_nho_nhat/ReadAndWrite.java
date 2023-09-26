package ss16_IO_Text_File.thuc_hanh.tim_gia_tri_nho_nhat;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List<Integer> readNum(String pathFile) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(pathFile);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                numbers.add(Integer.parseInt(str));
            }
            fileReader.close();
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return numbers;
    }

    public static void writeNum(String pathFile , int min){
        try {
            FileWriter fileWriter = new FileWriter(pathFile,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            fileWriter.write("Giá Trị nhỏ nhất là " + min);
            fileWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
