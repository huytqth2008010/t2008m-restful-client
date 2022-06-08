package com.example.t2008m_restful_client.service;

import com.example.t2008m_restful_client.entity.Product;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface ProductService {
    @GET("api/v1/products")
    public Call<List<Product>> getProducts();

    @GET("api/v1/products/{id}")
    public Call<Product> getProductDetail(@Path("id") int id);

    @GET("api/v1/products")
    public Call<Product> save(@Body Product product);

    @GET("api/v1/products/{id}")
    public Call<Product> update(@Body Product product, @Path("id") int id);

    @GET("api/v1/products/{id}")
    public Call<Product> delete(@Path("id") int id);

}
