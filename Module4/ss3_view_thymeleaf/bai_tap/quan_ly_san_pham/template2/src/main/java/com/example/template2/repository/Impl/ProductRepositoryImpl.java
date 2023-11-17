package com.example.template2.repository.Impl;

import com.example.template2.model.Product;
import com.example.template2.repository.IProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepositoryImpl implements IProductRepository {
    private static final Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Iphone13", 1300, "Apple"));
        products.put(2, new Product(2, "Iphone14", 1600, "Apple"));
        products.put(3, new Product(3, "Xiaomi A13", 800, "Xiaomi"));
        products.put(4, new Product(4, "Nokia", 300, "Nokia"));
        products.put(5, new Product(5, "SAMSUNG", 1200, "SAMSUNG A21S"));
    }

    @Override
    public List<Product> getAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public List<Product> searchByName(String name) {
//        name = name.toLowerCase().trim();
        List<Product> productList = new ArrayList<>();
        for (Product product: getAll()) {
            if (product.getName().contains(name)){
                productList.add(product);
            }
        }
        return productList;
    }
}
