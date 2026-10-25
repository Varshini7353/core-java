package com.xworkz.ecommerce.products;

public class Products {

    private int productId;
    private String productName;
    private double price;
    private String brand;
    private String category;
    private int quantity;
    private double discount;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Product ID: " + productId
                + ", Name: " + productName
                + ", Price: " + price
                + ", Brand: " + brand
                + ", Category: " + category
                + ", Quantity: " + quantity
                + ", Discount: " + discount;
    }
}