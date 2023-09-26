package ss17_io_binary_file_serialization.bai_tap.mvc_product.repository;

import java.util.List;

public interface IIOFileByteStream<O>{
    List<O> readFile(String pathname);
    void writeFile(String pathname,List<O> data);
}
