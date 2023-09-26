package ss17_io_binary_file_serialization.bai_tap.copy_file_nhi_phan;

import java.io.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        readFile("E:\\CodeGym FullTime\\Module2\\module_2\\src\\ss17_io_binary_file_serialization\\bai_tap\\copy_file_nhi_phan\\source_file.txt", "E:\\CodeGym FullTime\\Module2\\module_2\\src\\ss17_io_binary_file_serialization\\bai_tap\\copy_file_nhi_phan\\dest_file.txt");
    }

    private static void readFile(String sourceFile, String destFile) {
        File file = null;
        File destFile2 = null;
        InputStream fileInputStream = null;
        OutputStream fileOutputStream = null;
        try {
            file = new File(sourceFile);
            destFile2 = new File(destFile);
            if (!file.exists()) {
                file.createNewFile();
            }
            if (destFile2.exists()){
                destFile2.delete();
            }
            fileInputStream = new FileInputStream(file);
            fileOutputStream = new FileOutputStream(destFile, true);
            int i = -1;
            int count = 0;
            while ((i = fileInputStream.read()) != -1) {
                fileOutputStream.write(i);
                count++;
            }
            System.out.println("Số Ký Tự Trong file là " + count + " byte");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
