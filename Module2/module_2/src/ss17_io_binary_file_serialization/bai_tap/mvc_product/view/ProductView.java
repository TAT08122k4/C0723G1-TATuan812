package ss17_io_binary_file_serialization.bai_tap.mvc_product.view;

import ss17_io_binary_file_serialization.bai_tap.mvc_product.controller.ProductController;
import ss17_io_binary_file_serialization.bai_tap.mvc_product.model.Product;
import ss17_io_binary_file_serialization.bai_tap.mvc_product.repository.AbstractClassUtil;
import ss17_io_binary_file_serialization.bai_tap.mvc_product.repository.impl.ProductRepoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductView {
    Scanner sc = new Scanner(System.in);

    public void dipslayMenu() {
        System.out.println("==Manager Product Menu==");
        System.out.println("1.Add Product");
        System.out.println("2.Display Product List");
        System.out.println("3.Search Product");
        System.out.println("4.Exit");
    }

//    public void addProduct() {
//        Product product = inputProduct();
//        ProductController productController = new ProductController();
//        productController.addProduct(product);
//    }

    public Product inputProduct() {
        System.out.println("Input Id Product");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Input Name Product");
        String name = sc.nextLine();
        System.out.println("Input Price Product:");
        int price = Integer.parseInt(sc.nextLine());
        System.out.println("Input Brand Product");
        String brand = sc.nextLine();
        System.out.println("Input des Product");
        String des = sc.nextLine();
        return new Product(id, name, price, brand, des);

    }
}
