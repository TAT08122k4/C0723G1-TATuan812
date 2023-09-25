package ss16_IO_Text_File.thuc_hanh.tinh_tong_cac_so_trong_file_text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class SumInteger {
    public void readFileText(String patch){
        try {
            File file = new File(patch);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tổng = " + sum);


        }catch (Exception e){
            System.err.println("File ko tồn tại or nội dung có lỗi!");
        }
    }
}
