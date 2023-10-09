package luyentap.product.repository.Impl;

import luyentap.product.model.Product;
import luyentap.product.repository.IProductRepository;
import luyentap.product.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private final String SOURCE_FILE = "E:\\CodeGym FullTime\\Module2\\module_2\\src\\luyentap\\product\\data\\product.csv";
    private final String COMMOS = ",";

    public List<String> convertToString(List<Product> products) {
        List<String> strings = new ArrayList<>();
        for (Product product : products) {
            strings.add(product.getIdProduct() + COMMOS +
                    product.getNameProduct() + COMMOS +
                    product.getPrice() + COMMOS +
                    product.getDateProduct());
        }
        return strings;
    }

    public List<Product> convertToObj(List<String> strings) {
        List<Product> products = new ArrayList<>();
        String[] data;
        for (String str : strings) {
            data = str.split(",");
            products.add(new Product(data[0], data[1], Integer.parseInt(data[2]), data[3]));
        }
        return products;
    }

    @Override
    public void addProduct(Product product) {
        List<Product> products = getAll();
        products.add(product);
        ReadAndWrite.write(SOURCE_FILE, convertToString(products), true);
    }

    @Override
    public List<Product> getAll() {
        return convertToObj(ReadAndWrite.read(SOURCE_FILE));
    }

    @Override
    public void edit(Product product) {
        List<Product> products = getAll();
        for (Product product1 : products){
            if (product1.getIdProduct().equals(product.getIdProduct())){
                product1.setIdProduct(product.getIdProduct());
                product1.setNameProduct(product.getNameProduct());
                product1.setPrice(product.getPrice());
                product1.setDateProduct(product.getDateProduct());
            }
        }
    }

    @Override
    public List<Product> sort() {
        List<Product> products = getAll();
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
        return products;
    }

    @Override
    public void deleteProduct(String idProduct) {
        List<Product> products = getAll();
        for (Product product : products) {
            if (product.getIdProduct().equals(idProduct)) {
                products.remove(product);
                break;
            }
        }
        ReadAndWrite.write(SOURCE_FILE, convertToString(products), false);
    }
}
