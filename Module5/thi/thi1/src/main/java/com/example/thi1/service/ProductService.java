package com.example.thi1.service;

import com.example.thi1.model.Product;
import com.example.thi1.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {
    @Autowired
    IProductRepository iProductRepository;
    @Override
    public Page<Product> search(String tenSanPham, Pageable pageable) {
        return iProductRepository.search(tenSanPham,pageable);
    }
}
