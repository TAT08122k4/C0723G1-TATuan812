package ss16_IO_Text_File.bai_tap.copy_text_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    private static final String FILE_DICH = "E:\\CodeGym FullTime\\Module2\\module_2\\src\\ss16_IO_Text_File\\bai_tap\\copy_text_file\\result.txt";
    private static final String FILE_NGUON = "E:\\CodeGym FullTime\\Module2\\module_2\\src\\ss16_IO_Text_File\\bai_tap\\copy_text_file\\data.txt";
    List<String> strings = new ArrayList<>();


    public List<String> readFileText(String filePath) {
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                System.err.println("Tập nguồn ko tồn tại");
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                strings.add(line);
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return strings;
    }

    public void writeFile(String filePath) {
        try {
            FileWriter fileWriter = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < strings.size(); i++) {
                bufferedWriter.write(strings.get(i) + "\n");
            }
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int countStr() {
        String[] str1;
        int count = 0;
        for (String str : strings) {
            str1 = str.split("");
            count += str.length();
        }
        return count;
    }
}
