package ss17_io_binary_file_serialization.bai_tap.mvc_product.repository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractClassUtil <O> implements IIOFileByteStream<O> {
    public void writeFile(String pathname, List<O> data) {
        File file = null;
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            file = new File(pathname);
            if (!file.exists()){
                file.createNewFile();
            }

            fileOutputStream = new FileOutputStream(pathname);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public List<O> readFile(String pathname) {
        File file = null;
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        List<String> strings = new ArrayList<>();
        try {
            file = new File(pathname);
            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            return (List<O>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileInputStream.close();
                objectInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
