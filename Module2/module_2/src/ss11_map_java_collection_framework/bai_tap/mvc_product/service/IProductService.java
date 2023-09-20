package ss11_map_java_collection_framework.bai_tap.mvc_product.service;

import ss11_map_java_collection_framework.bai_tap.mvc_product.model.Product;

import java.util.ArrayList;
import java.util.List;

public interface IProductService {
    void add(Product product);
    void update();
    void remove();
    void display();
    void search();
    List<Product> sortDown();
    List<Product> sortUp();
}
