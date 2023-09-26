package ss17_io_binary_file_serialization.bai_tap.mvc_product.service.impl;

import ss17_io_binary_file_serialization.bai_tap.mvc_product.model.Product;
import ss17_io_binary_file_serialization.bai_tap.mvc_product.repository.impl.ProductRepoImpl;
import ss17_io_binary_file_serialization.bai_tap.mvc_product.service.IService;

import java.util.List;

public class ProductServiceImpl implements IService {
    ProductRepoImpl productRepo = new ProductRepoImpl();
    @Override
    public List<Product> displayProduct() {
        return productRepo.displayProduct();
    }

    @Override
    public void addProduct(Product product) {
        productRepo.addProduct(product);
    }

    @Override
    public Product searchProduct(int id) {
         return productRepo.searchProduct(id);
    }
}
