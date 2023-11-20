package com.example.template2.repository.Impl;

import com.example.template2.model.Product;
import com.example.template2.repository.IProductRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepositoryImpl implements IProductRepository {
//    private static final Map<Integer, Product> products;
//
//    static {
//        products = new HashMap<>();
//        products.put(1, new Product(1, "Iphone13", 1300, "Apple"));
//        products.put(2, new Product(2, "Iphone14", 1600, "Apple"));
//        products.put(3, new Product(3, "Xiaomi A13", 800, "Xiaomi"));
//        products.put(4, new Product(4, "Nokia", 300, "Nokia"));
//        products.put(5, new Product(5, "SAMSUNG", 1200, "SAMSUNG A21S"));
//    }
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Product> getAll() {
        List<Product> productList = new ArrayList<>();
        TypedQuery<Product> query = entityManager.createQuery("from Product ",Product.class);
        productList = query.getResultList();
        return productList;
    }

    @Override
    public void save(Product product) {

    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public void update(int id, Product product) {
    }

    @Override
    public void remove(int id) {
    }

    @Override
    public List<Product> searchByName(String name) {
 return null;
    }
}
