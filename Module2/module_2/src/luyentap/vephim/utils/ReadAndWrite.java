package luyentap.vephim.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public  class ReadAndWrite {
    public static List<String> read(String pathName){
        List<String> list = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            File file = new File(pathName);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            if (!file.exists()){
                file.createNewFile();
            }
            String str;
            while ((str = bufferedReader.readLine()) != null){
                list.add(str);
            }
            return list;
        } catch (FileNotFoundException e){
            System.err.println("Không tìm thấy File");
        } catch (IOException e){
            System.err.println("Lỗi IO Exception khi đọc file");
        } finally {
           try {
               if (fileReader != null){
                   fileReader.close();
               }
               if (bufferedReader != null){
                   bufferedReader.close();
               }
           }catch (IOException e){
               System.err.println("Lỗi đóng file");
           }
        }
        return list;
    }
    public static void write(String path,List<String> stringList , boolean flag){
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            File file = new File(path);
            fileWriter = new FileWriter(file,flag);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String str : stringList){
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
        }catch (IOException e){
            System.err.println("Lỗi ghi file");
        }finally {
            try {
                if (bufferedWriter != null){
                    bufferedWriter.close();
                }
            }catch (IOException e){
                System.err.println("c");
            }
        }
    }
}
