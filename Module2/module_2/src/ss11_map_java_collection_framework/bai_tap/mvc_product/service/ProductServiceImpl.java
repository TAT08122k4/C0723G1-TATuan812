package ss11_map_java_collection_framework.bai_tap.mvc_product.service;

import ss11_map_java_collection_framework.bai_tap.mvc_product.model.Product;
import ss11_map_java_collection_framework.bai_tap.mvc_product.repository.ProductRepoImpl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductServiceImpl implements IProductService {
   Scanner sc = new Scanner(System.in);
    private static ProductRepoImpl productRepo = new ProductRepoImpl();
    @Override
    public void add(Product product) {
        productRepo.add(product);
    }

    @Override
    public void update() {
        System.out.println("Nhập id của sản phẩm bạn muốn sửa");
        String idUpdate = sc.nextLine();
        productRepo.update(idUpdate);
    }

    @Override
    public void remove() {
        System.out.println("Nhập id sản phẩm bạn muốn xoá");
        String idToDelete = sc.nextLine();
        System.out.println("Bạn có chắc chắn muốn xoá ko ? 'Yes' để xoá");
        String comfirm = sc.nextLine();
        if (comfirm.equals("Yes")){
            for (Product product:productRepo.display()) {
                if (product.getId().equals(idToDelete)){
                    productRepo.remove(product);
                }
            }
        }else {
            System.out.println("đã huỷ xoá sản phẩm!");
        }
    }

    @Override
    public void display() {
        List<Product> productList = productRepo.display();
        for (Product product : productList){
            System.out.println(product);
        }
    }

    @Override
    public void search() {
        System.out.println("Nhập Tên sản phẩm bạn muốn tìm kiếm");
        String nameFindout = sc.nextLine();
        System.out.println(productRepo.search(nameFindout));

    }
    public List<Product> sortDown(){
        return productRepo.sortDown();
    }
    public List<Product> sortUp(){
        return productRepo.sortUp();
    }


}
