package com.example.template2.repository.Impl;

import com.example.template2.model.Product;
import com.example.template2.repository.IProductRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements IProductRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Product> getAll() {
        List<Product> productList = new ArrayList<>();
        TypedQuery<Product> query = entityManager.createQuery("select  p from Product p", Product.class);
        productList = query.getResultList();
        return productList;
    }
   @Transactional
    @Override
    public void save(Product product) {
        entityManager.persist(product);
    }

    @Override
    public Product findById(int id) {
        Product product = entityManager.find(Product.class, id);
        return product;
    }
    @Transactional

    @Override
    public void update(int id, Product product) {
        Product product1 = findById(id);
        product1.setName(product.getName());
        product1.setManufacturer(product.getManufacturer());
        product1.setPrice(product.getPrice());
        entityManager.merge(product1);
    }
    @Transactional

    @Override
    public void remove(int id) {
        Product product = findById(id);
        entityManager.remove(product);
    }

    @Override
    public List<Product> searchByName(String name) {
        List<Product> products = new ArrayList<>();
        String query = "Select p from Product p where p.name like :name ";
        TypedQuery<Product> query1 = entityManager.createQuery(query,Product.class);
        query1.setParameter("name","%"+name + "%" );
        products = query1.getResultList();
        return products;
    }
}
