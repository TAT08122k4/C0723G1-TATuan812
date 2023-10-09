package luyentap.product.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ReadAndWrite {
    public static List<String> read(String pathName) {
        List<String> strings = new ArrayList<>();
        File file = new File(pathName);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                strings.add(str);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Không tìm thấy file để đọc");
        } catch (IOException e) {
            System.err.println("Lỗi đọc file");
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                System.err.println("Lỗi đóng file");
            }
        }
        return strings;
    }

    public static void write(String pathName, List<String> list, boolean flag) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(pathName, flag);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String str : list) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.err.println("Lỗi ghi File");
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                System.err.println("lỗi ghi file");
            }

        }
    }
}
