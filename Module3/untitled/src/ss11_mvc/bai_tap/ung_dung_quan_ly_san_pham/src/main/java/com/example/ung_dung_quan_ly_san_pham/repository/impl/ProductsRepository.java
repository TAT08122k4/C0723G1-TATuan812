package com.example.ung_dung_quan_ly_san_pham.repository.impl;

import com.example.ung_dung_quan_ly_san_pham.model.Products;
import com.example.ung_dung_quan_ly_san_pham.repository.IProductsRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductsRepository implements IProductsRepository {
    private static List<Products> productsList = new ArrayList<>();
    static {
        productsList.add(new Products(1,"Phone",1000,"New","Apple"));
        productsList.add(new Products(2,"Samsung A21S",900,"New","SamSung"));
        productsList.add(new Products(3,"Toshiba 7 Kg",1000,"New","Toshiba"));
        productsList.add(new Products(4,"Samsung Smart TV",1000,"New","Samsung"));
        productsList.add(new Products(5,"Funiki Inverter 1HP",1000,"New","Funiki"));

    }
    @Override
    public List<Products> getAll() {
        return productsList;
    }

    @Override
    public void saveProducts(Products products) {
     productsList.add(products);
    }

    @Override
    public void edit(int id,Products products) {
        productsList.set(id,products);

    }

    @Override
    public void remove(int id) {
       for (int i = 0;i < productsList.size();i++){
           if (productsList.get(i).getId() == id){
               productsList.remove(productsList.get(i));
               break;
           }
       }
    }


    @Override
    public Products getDetail(int id) {
        return productsList.get(id);
    }

    @Override
    public List<Products> findByName(String name) {
        List<Products> products = new ArrayList<>();
        for (Products products1: productsList) {
            if (products1.getName().equals(name)){
                products.add(products1);
            }
        }
        return products;
    }
}
