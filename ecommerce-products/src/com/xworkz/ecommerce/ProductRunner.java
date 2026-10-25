package com.xworkz.ecommerce;

import com.xworkz.ecommerce.Ecommerce.Ecommerce;
import com.xworkz.ecommerce.products.Products;

import java.util.Scanner;

public class ProductRunner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many products you want to add: ");
        int size = sc.nextInt();
        sc.nextLine();

        if (size <= 0) {
            System.out.println("Enter a valid number");
            sc.close();
            return;
        }

        Ecommerce ecommerce = new Ecommerce();
        ecommerce.setSize(size);

        for (int i = 0; i < size; i++) {

            Products product = new Products();

            System.out.println("\nEnter details for product " + (i + 1));

            System.out.print("Enter product ID: ");
            product.setProductId(sc.nextInt());
            sc.nextLine();

            System.out.print("Enter product name: ");
            product.setProductName(sc.nextLine());

            System.out.print("Enter price: ");
            product.setPrice(sc.nextDouble());
            sc.nextLine();

            System.out.print("Enter brand: ");
            product.setBrand(sc.nextLine());

            System.out.print("Enter category: ");
            product.setCategory(sc.nextLine());

            System.out.print("Enter quantity: ");
            product.setQuantity(sc.nextInt());
            sc.nextLine();

            System.out.print("Enter discount (0-100): ");
            product.setDiscount(sc.nextDouble());
            sc.nextLine();

            boolean added = ecommerce.addProducts(product);

            if (added) {
                System.out.println("Product added successfully!");
            } else {
                System.out.println("Failed to add product");
            }
        }

        System.out.println("\n--- All Product Names ---");
        ecommerce.getAllProducts();

        System.out.println("\n--- All Product Information ---");
        ecommerce.getProductsInfo();

        System.out.print("\nEnter product ID to search: ");
        int searchId = sc.nextInt();

        Products foundProduct = ecommerce.getProductsById(searchId);

        if (foundProduct != null) {
            System.out.println("Product found: " + foundProduct);
        } else {
            System.out.println("Product not found");
        }

        System.out.print("\nEnter quantity to search: ");
        int quantity = sc.nextInt();
        System.out.println("Products matching quantity:");
        ecommerce.getProductNamesByQuantity(quantity);

        sc.nextLine();
        System.out.print("\nEnter brand to search: ");
        String brand = sc.nextLine();
        System.out.println("Products matching brand:");
        ecommerce.getProductNamesByBrand(brand);

        System.out.print("\nEnter category to search: ");
        String category = sc.nextLine();
        System.out.println("Products matching category:");
        ecommerce.getProductsByCategory(category);

        System.out.print("\nEnter price to search: ");
        double price = sc.nextDouble();
        System.out.println("Products matching price:");
        ecommerce.getProductsByPrice(price);

        System.out.print("\nEnter discount to search: ");
        double discount = sc.nextDouble();
        System.out.println("Products matching discount:");
        ecommerce.getProductsByDiscount(discount);

        sc.close();
    }
}