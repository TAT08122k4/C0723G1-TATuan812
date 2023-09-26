package ss17_io_binary_file_serialization.bai_tap.mvc_product.repository.impl;

import ss17_io_binary_file_serialization.bai_tap.mvc_product.model.Product;
import ss17_io_binary_file_serialization.bai_tap.mvc_product.repository.AbstractClassUtil;
import ss17_io_binary_file_serialization.bai_tap.mvc_product.repository.IProductRepo;

import java.util.List;

public class ProductRepoImpl extends AbstractClassUtil<Product> implements IProductRepo {
    private static final String PRODUCT_CSV_PATH = "E:\\CodeGym FullTime\\Module2\\module_2\\src\\ss17_io_binary_file_serialization\\bai_tap\\mvc_product\\repository\\product.csv";
    private static final String PRODUCT_DAT_PATH = "E:\\CodeGym FullTime\\Module2\\module_2\\src\\ss17_io_binary_file_serialization\\bai_tap\\mvc_product\\repository\\product.dat";
    private static final String COMMA = ",";

    @Override
    public List<Product> displayProduct() {
        return readFile(PRODUCT_DAT_PATH);
    }


    @Override
    public void addProduct(Product product) {
        List<Product> productList = displayProduct();
        product.setId(productList.size() + 1);
        productList.add(product);
        writeFile(PRODUCT_DAT_PATH, productList);
    }

    @Override
    public Product searchProduct(int id) {
        List<Product> productList = displayProduct();
        for (Product product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
}
