package ss11_map_java_collection_framework.bai_tap.mvc_product.controller;

import ss11_map_java_collection_framework.bai_tap.mvc_product.model.Product;
import ss11_map_java_collection_framework.bai_tap.mvc_product.repository.IProductRepo;
import ss11_map_java_collection_framework.bai_tap.mvc_product.repository.ProductRepoImpl;
import ss11_map_java_collection_framework.bai_tap.mvc_product.service.ProductServiceImpl;
import ss11_map_java_collection_framework.bai_tap.mvc_product.view.ProductView;

import java.util.Scanner;

public class ProductController {
    Scanner sc = new Scanner(System.in);
    Product product = new Product();
    private static ProductServiceImpl productService = new ProductServiceImpl();
    private static ProductView productView = new ProductView();
    private static ProductRepoImpl productRepo = new ProductRepoImpl();

    public void runPrograming() {
        int select;
        do {
            productView.displayMenu();
            select = Integer.parseInt(sc.nextLine());
            switch (select) {
                case 1:
                    System.out.println("Nhập Id Của Sản phẩm:");
                    String id = sc.nextLine();
                    System.out.println("Nhập Tên của sản phẩm");
                    String name = sc.nextLine();
                    System.out.println("Nhập giá tiền của sản phẩm");
                    int price = Integer.parseInt(sc.nextLine());
                    Product product1 = new Product(id, name, price);
                    productService.add(product1);
                    break;
                case 2:
                    productService.update();
                    break;
                case 3:
                    productService.remove();
                    break;
                case 4:
                    productService.display();
                    break;
                case 5:
                    productService.search();
                    break;
                case 6:
                    productView.sapXep();
                    System.out.println("chọn kiểu sắp xếp mà bạn muốn");
                    int selectSort = Integer.parseInt(sc.nextLine());
                   if (selectSort == 1){
                       productRepo.sortUp();
                   }else if (selectSort == 2){
                       productRepo.sortDown();
                   }else {
                       System.out.println("Chỉ Chọn 1 or 2");
                   }
                    break;
                default:
                    System.exit(0);
            }


        } while (true);
    }
}
