package ss11_map_java_collection_framework.bai_tap.mvc_product.repository;

import ss11_map_java_collection_framework.bai_tap.mvc_product.model.Product;

import java.util.ArrayList;
import java.util.List;

public interface IProductRepo {
      void add(Product product);
      void update(Product product);
      void remove(Product product);
      List<Product> display();
      Product search(String name);
      List<Product> sortDown();
      List<Product> sortUp();
      boolean checkId(String id);
}
