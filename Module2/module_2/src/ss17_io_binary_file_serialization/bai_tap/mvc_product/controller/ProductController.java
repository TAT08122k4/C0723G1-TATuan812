package ss17_io_binary_file_serialization.bai_tap.mvc_product.controller;

import ss17_io_binary_file_serialization.bai_tap.mvc_product.model.Product;
import ss17_io_binary_file_serialization.bai_tap.mvc_product.service.impl.ProductServiceImpl;
import ss17_io_binary_file_serialization.bai_tap.mvc_product.view.ProductView;

import java.util.List;
import java.util.Scanner;

public class ProductController {
    private ProductServiceImpl productService = new ProductServiceImpl();
//    private ProductView productView = new ProductView();
    private Scanner sc = new Scanner(System.in);
    private Product product = null;

    public void addProduct(Product product){
        productService.addProduct(product);
    }
    public List<Product> displayProduct(){
        return productService.displayProduct();
    }
    public Product searchProduct(int id){
        return productService.searchProduct(id);
    }


}
