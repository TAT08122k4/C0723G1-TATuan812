package luyentap.product.repository;

import luyentap.product.model.Product;

import java.util.List;

public interface IProductRepository {
    public void addProduct(Product product);
    public List<Product> getAll();
    public void edit(Product product);
    public List<Product> sort();
    public void deleteProduct(String idProduct);
}
