package com.xworkz.ecommerce.Ecommerce;

import com.xworkz.ecommerce.exception.*;
import com.xworkz.ecommerce.products.Products;
import com.xworkz.ecommerce.products.ProductsInfo;

public class Ecommerce implements ProductsInfo {

    int size;
    private Products[] products = new Products[size];
    int index;

    public Ecommerce(int size) {
        this.size=size;
        products=new Products[size];
    }


    @Override
    public boolean addProducts(Products product) {
        boolean isAdded=false;

        boolean isProductIdValid=false;
        boolean isProductnameValid=false;
        boolean isPriceValid=false;
        boolean isBrandValid=false;
        boolean isCategoryValid=false;
        boolean isQuantityValid=false;
        boolean isDiscountValid=false;


        int productId = product.getProductId();
        if(productId>0){
            isProductIdValid=true;
        }else System.out.println("Invalid productId");

        String productName = product.getProductName();
        if(productName!=null && !productName.isEmpty()){
            isProductnameValid=true;
        }else System.out.println("Invalid productName");

        double price=product.getPrice();
        if(price>0){
            isPriceValid=true;
        }else System.out.println("Invalid price");

        String brand=product.getBrand();
        if(brand!=null && !brand.isEmpty()){
            isBrandValid=true;
        }else System.out.println("Invalid brand");

        String category=product.getCategory();
        if(category!=null && !category.isEmpty()){
            isCategoryValid=true;
        }else System.out.println("Invalid category");

        int quantity=product.getQuantity();
        if(quantity>0){
            isQuantityValid=true;
        }else System.out.println("Quantity invalid");

        double discount=product.getDiscount();
        if(discount>0){
            isDiscountValid=true;
        }else System.out.println("Invalid discount ");



        if (isProductIdValid && isProductnameValid && isPriceValid
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
        try {
            for (Products product : products) {
                if (product != null) {
                    System.out.println(product.getProductName());
                }
            }
            if (products == null) {
                InvalidproductInfoException exception = new InvalidproductInfoException("Sorry...Failed to get products");
                throw exception;
            }
        }catch (InvalidproductInfoException tt){
            tt.printStackTrace();
        }
    }

    @Override
    public Products getProductsById(int id) {

        try {
            for (Products product : products) {
                if (product != null && product.getProductId() == id) {
                    return product;
                }
            }
            if (products == null) {
                ProductbyIdInvalidException exception = new ProductbyIdInvalidException("Failed to fetch products");
                throw exception;
            }
        }catch (ProductInvalidInfoException oo){
            oo.printStackTrace();
        }
        return null;
    }

    @Override
    public void getProductsInfo() {
        try {
            for (Products product : products) {
                if (product != null) {
                    System.out.println(product);
                }
            }
            if (products == null) {
                ProductInvalidInfoException exception = new ProductInvalidInfoException("Sorry invalid roduct info");
                throw exception;
            }
        }catch (ProductInvalidInfoException w){
            w.printStackTrace();
        }
    }

    // 1. Get product names by quantity
    @Override
    public void getProductNamesByQuantity(int quantity) {

        try{
        for (Products product : products) {
            if (product != null && product.getQuantity() == quantity) {
                System.out.println(product.getProductName());
            }
        }

            if (products == null) {
                InvalidProductNamebyQuantityException exception = new InvalidProductNamebyQuantityException("Sorry... productnames not available");
                throw exception;
            }

        }catch(InvalidProductNamebyQuantityException ee){
                ee.printStackTrace();


            }
        }

    // 2. Get product names by brand
    @Override
    public void getProductNamesByBrand(String brand) {

        try{
        for (Products product : products) {
            if (product != null && product.getBrand().equalsIgnoreCase(brand)) {
                System.out.println(product.getProductName());
            }
        }
            if(products==null) {
                ProductInvalidBrandException exception = new ProductInvalidBrandException("Sorry... invalid brand name");
                throw exception;
            }
            }catch(ProductInvalidBrandException r){
                r.printStackTrace();

            }
        }

    // 3. Get products by category
    @Override
    public void getProductsByCategory(String category) {
        try {
        for (Products product : products) {
                if (product != null && product.getCategory().equalsIgnoreCase(category)) {
                    System.out.println(product);
                }
                }

                if (products == null) {
                    ProductInvalidCategoryException exception = new ProductInvalidCategoryException("Sorry...invalid category ");
                    throw exception;
                }
            }catch(ProductInvalidCategoryException ww){
                ww.printStackTrace();
                }
            }


    // 4. Get products by price
    @Override
    public void getProductsByPrice(double price) {
        try {
            for (Products product : products) {
                if (product != null && product.getPrice() == price) {
                    System.out.println(product);
                }

            }
            if (products == null) {
                ProductPriceInvalidException exception = new ProductPriceInvalidException("Invalid price");
                throw exception;
            }
        }catch (ProductPriceInvalidException zz){
            zz.printStackTrace();
        }
    }

    // 5. Get products by discount
    @Override
    public void getProductsByDiscount(double discount) {
        try {
            for (Products product : products) {
                if (product != null && product.getDiscount() == discount) {
                    System.out.println(product);
                }
            }
            if (products == null) {
                ProductInvalidDiscountException exception = new ProductInvalidDiscountException("Unable to fetch products");
                throw exception;
            }
        }catch (ProductInvalidDiscountException aa){
            aa.printStackTrace();
        }
    }

    @Override
    public boolean updatePriceByName(double newPrice, String productName) {

            boolean isPriceUpdated = false;
            try {
            for (Products product : products) {
                if (product.getProductName().equals(productName)) {
                    product.setPrice(newPrice);
                    isPriceUpdated = true;
                }
            }
            if (products == null) {
                ProductInvalidPriceByNameException exception = new ProductInvalidPriceByNameException("Sorry... update failed");
                throw exception;
            }
        } catch (ProductInvalidPriceByNameException ee){
            ee.printStackTrace();
        }
        return  isPriceUpdated;
    }
}