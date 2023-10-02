package case_study.khu_nghi_duong_furama.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List<String> readFile(String pathName)  {
        List<String> strings = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            File file = new File(pathName);
            if (!file.exists()){
                file.createNewFile();
            }
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                strings.add(str);
            }
            return strings;
        } catch (IOException e) {
            System.err.println("Lỗi IO");
        } catch (Exception e) {
            System.err.println("Lỗi chương trình!");
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            }catch (IOException e){
                System.err.println("Lỗi đóng file khi đọc");
            }
        }
        return strings;
    }
    public static void writeFile(String pathName,List<String> strings) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(pathName);
             bufferedWriter = new BufferedWriter(fileWriter);
            for (String str : strings){
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
        }catch (Exception e){
            System.err.println("Lỗi Viết file");
        }finally {try {
            if(bufferedWriter != null){
                bufferedWriter.close();
            }
        }catch (IOException e){
            System.err.println("Lỗi đọc file");
        }

        }
    }
}
