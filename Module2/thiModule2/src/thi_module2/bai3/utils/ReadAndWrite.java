package thi_module2.bai3.utils;

import thi_module2.bai3.model.TienDien;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List<String> read(String pathName) {
        List<String> tienDiens = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            File file = new File(pathName);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                tienDiens.add(str);
            }
        } catch (FileNotFoundException e) {
            System.err.println("không tìm thấy file khi đọc");
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
        return tienDiens;
    }

    public static void write(String pathName, List<String> strings) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            File file = new File(pathName);
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String str : strings) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.err.println("Lỗi đọc ghi file");
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                System.err.println("Lỗi đóng file khi viết");
            }
        }
    }
}
