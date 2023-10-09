package luyentap.product.controller.Impl;

import luyentap.product.controller.IProductController;
import luyentap.product.model.Product;
import luyentap.product.service.IProductService;
import luyentap.product.service.Impl.ProductService;

import java.util.List;

public class ProductController implements IProductController {
    IProductService productService = new ProductService();

    @Override
    public void addProduct(Product product) {
        productService.addProduct(product);
    }

    @Override
    public List<Product> getAll() {
        return productService.getAll();
    }

    @Override
    public void edit(Product product) {
     productService.edit(product);
    }

    @Override
    public List<Product> sort() {
        return productService.sort();
    }

    @Override
    public void deleteProduct(String idProduct) {
    productService.deleteProduct(idProduct);
    }
}
