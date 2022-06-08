package com.example.t2008m_restful_client.service;

import com.example.t2008m_restful_client.entity.Product;
import com.example.t2008m_restful_client.retofit.RetrofitServiceGenerator;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {

    @Test
    void getProducts() throws IOException {
        ProductService productService = RetrofitServiceGenerator.createService(ProductService.class);
        List<Product> products = productService.getProducts().execute().body();
        for (Product pro:
             products) {
            System.out.println(pro.toString());
        }
//        productService.save(new Product(2,"Product 2",20));
    }
}