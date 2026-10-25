package com.xworkz.ecommerce.products;

public interface ProductsInfo {

    boolean addProducts(Products product);

    void getAllProducts();

    Products getProductsById(int id);

    void getProductsInfo();

    void getProductNamesByQuantity(int quantity);

    void getProductNamesByBrand(String brand);

    void getProductsByCategory(String category);

    void getProductsByPrice(double price);

    void getProductsByDiscount(double discount);
}