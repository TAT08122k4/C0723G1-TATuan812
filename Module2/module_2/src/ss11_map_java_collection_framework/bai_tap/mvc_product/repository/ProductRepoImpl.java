package ss11_map_java_collection_framework.bai_tap.mvc_product.repository;

import ss11_map_java_collection_framework.bai_tap.mvc_product.model.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductRepoImpl implements IProductRepo {
    Scanner sc = new Scanner(System.in);
    private static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product("1", "Iphone", 5));
        productList.add(new Product("2", "SamSung", 4));
    }

    @Override
    public void add(Product product) {
        productList.add(product);
    }

    @Override
    public void update(Product product) {
      for(Product value: productList) {
          if(value.getId().equals(product.getId())) {
              value.setName(product.getName());
              value.setPrice(product.getPrice());
          }
      }
    }

    @Override
    public void remove(Product product) {
        productList.remove(product);
    }

    @Override
    public List<Product> display() {
        return productList;
    }

    @Override
    public Product search(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public List<Product> sortDown() {
        productList.sort(((o1, o2) -> {
            if (o1.getPrice() < o2.getPrice()) {
                return -1;
            } else if (o1.getPrice() == o2.getPrice()) {
                return 0;
            } else {
                return 1;
            }
        }));
        return productList;
    }

    @Override
    public List<Product> sortUp() {
        productList.sort(((o1, o2) -> {
            if (o1.getPrice() > o2.getPrice()) {
                return 1;
            } else if (o1.getPrice() == o2.getPrice()) {
                return 0;
            } else {
                return -1;
            }
        }));
        return productList;
    }
    public boolean checkId(String id){
        for (Product product: productList) {
            if (id.equals(product.getId())){
                return true;
            }
        }
        return false;
    }
}
