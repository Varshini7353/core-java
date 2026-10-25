package com.xworkz.ecommerce.Ecommerce;

import com.xworkz.ecommerce.products.Products;
import com.xworkz.ecommerce.products.ProductsInfo;

public class Ecommerce implements ProductsInfo {

    private Products[] products = new Products[2];
    int index;

    public void setSize(int size) {
        products = new Products[size];
        index = 0;
    }

    @Override
    public boolean addProducts(Products product) {

        if (product == null) {
            System.out.println("Product cannot be null");
            return false;
        }

        boolean isProductsIdValid = product.getProductId() > 0;
        boolean isProductNameValid = product.getProductName() != null
                && !product.getProductName().trim().isEmpty();
        boolean isPriceValid = product.getPrice() > 0;
        boolean isBrandValid = product.getBrand() != null
                && !product.getBrand().trim().isEmpty();
        boolean isCategoryValid = product.getCategory() != null
                && !product.getCategory().trim().isEmpty();
        boolean isQuantityValid = product.getQuantity() > 0;
        boolean isDiscountValid = product.getDiscount() >= 0
                && product.getDiscount() <= 100;

        if (isProductsIdValid && isProductNameValid && isPriceValid
                && isBrandValid && isCategoryValid && isQuantityValid
                && isDiscountValid) {

            if (index < products.length) {
                products[index++] = product;
                return true;
            } else {
                System.out.println("Product list is full");
            }
        } else {
            System.out.println("Invalid product details");
        }

        return false;
    }

    @Override
    public void getAllProducts() {
        for (Products product : products) {
            if (product != null) {
                System.out.println(product.getProductName());
            }
        }
    }

    @Override
    public Products getProductsById(int id) {
        for (Products product : products) {
            if (product != null && product.getProductId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void getProductsInfo() {
        for (Products product : products) {
            if (product != null) {
                System.out.println(product);
            }
        }
    }

    // 1. Get product names by quantity
    @Override
    public void getProductNamesByQuantity(int quantity) {
        for (Products product : products) {
            if (product != null && product.getQuantity() == quantity) {
                System.out.println(product.getProductName());
            }
        }
    }

    // 2. Get product names by brand
    @Override
    public void getProductNamesByBrand(String brand) {
        for (Products product : products) {
            if (product != null && product.getBrand().equalsIgnoreCase(brand)) {
                System.out.println(product.getProductName());
            }
        }
    }

    // 3. Get products by category
    @Override
    public void getProductsByCategory(String category) {
        for (Products product : products) {
            if (product != null && product.getCategory().equalsIgnoreCase(category)) {
                System.out.println(product);
            }
        }
    }

    // 4. Get products by price
    @Override
    public void getProductsByPrice(double price) {
        for (Products product : products) {
            if (product != null && product.getPrice() == price) {
                System.out.println(product);
            }
        }
    }

    // 5. Get products by discount
    @Override
    public void getProductsByDiscount(double discount) {
        for (Products product : products) {
            if (product != null && product.getDiscount() == discount) {
                System.out.println(product);
            }
        }
    }
}