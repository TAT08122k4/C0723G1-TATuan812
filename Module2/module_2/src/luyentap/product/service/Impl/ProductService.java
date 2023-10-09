package luyentap.product.service.Impl;

import luyentap.product.model.Product;
import luyentap.product.repository.IProductRepository;
import luyentap.product.repository.Impl.ProductRepository;
import luyentap.product.service.IProductService;

import java.util.List;

public class ProductService implements IProductService {
    IProductRepository productRepository = new ProductRepository();
    @Override
    public void addProduct(Product product) {
        productRepository.addProduct(product);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.getAll();
    }

    @Override
    public void edit(Product product) {
    productRepository.edit(product);
    }

    @Override
    public List<Product> sort() {
        return productRepository.sort();
    }

    @Override
    public void deleteProduct(String idProduct) {
     productRepository.deleteProduct(idProduct);
    }
}
