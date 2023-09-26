package ss17_io_binary_file_serialization.bai_tap.mvc_product.service;

import ss17_io_binary_file_serialization.bai_tap.mvc_product.model.Product;

import java.util.List;

public interface IService {
    List<Product> displayProduct();
    void addProduct(Product product);
    Product searchProduct(int id);
}
