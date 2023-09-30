package ss17_io_binary_file_serialization.bai_tap.mvc_product.view;

import ss17_io_binary_file_serialization.bai_tap.mvc_product.controller.ProductController;
import ss17_io_binary_file_serialization.bai_tap.mvc_product.model.Product;
import ss17_io_binary_file_serialization.bai_tap.mvc_product.repository.AbstractClassUtil;
import ss17_io_binary_file_serialization.bai_tap.mvc_product.repository.impl.ProductRepoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductView {
    private Scanner sc = new Scanner(System.in);
    private ProductController productController = new ProductController();

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

    public int choose() {
        dipslayMenu();
        int choose = 0;

        do {
            try {
                System.out.println("Choose 1->4");
                choose = Integer.parseInt(sc.nextLine());
                if (choose == 4) {
                    System.exit(1);
                }
                if (choose < 1 || choose > 4) {
                    System.out.println("plzz enter ur choosen 1->4");
                }
            } catch (NumberFormatException e) {
                System.err.println("Only enter Numbers");
            }

        } while (choose < 1 || choose > 4);
        return choose;
    }

    public int inputId() {
        System.out.println("Enter Id u wanna find:");
        return Integer.parseInt(sc.nextLine());
    }

    public void managePrograming() {
        int choose = 0;
        do {
            choose = choose();
            switch (choose) {
                case 1:
                    productController.addProduct(inputProduct());
                    break;
                case 2:
                    List<Product> products = productController.displayProduct();
                    for (Product product : products) {
                        System.out.println(product);
                    }
                    break;
                case 3:
                    System.out.println(productController.searchProduct(inputId()));
                    break;
                default:
                    System.out.println("Only choose 1->4");
                    break;
            }
        } while (true);
    }
}
