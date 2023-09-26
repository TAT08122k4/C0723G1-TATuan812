package ss16_IO_Text_File.bai_tap.doc_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<String> readFile(String pathname) {
        BufferedReader br = null;
        FileReader fileReader = null;
        List<String> country = new ArrayList<>();
        try {
            File file = new File(pathname);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            fileReader = new FileReader(file);
            br = new BufferedReader(fileReader);
            String str;
            while ((str = br.readLine()) != null) {
                country.add(str);
            }
            return country;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return country;
    }

    public static List<Country> readCountries(String pathFile) {
        List<Country> countries = new ArrayList<>();
        List<String> strings = readFile(pathFile);
        String[] temp;
        for (String str : strings) {
            temp = str.split(",");
            countries.add(new Country(Integer.parseInt(temp[0]), temp[1], temp[2]));
        }
        return countries;
    }

    public static void main(String[] args) {
        List<Country> countries = Main.readCountries("E:\\CodeGym FullTime\\Module2\\module_2\\src\\ss16_IO_Text_File\\bai_tap\\doc_file_csv\\country.csv");
        for (Country country : countries) {
            System.out.println(country);
        }
    }

}
