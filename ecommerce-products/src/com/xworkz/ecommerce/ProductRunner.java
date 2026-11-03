package com.xworkz.ecommerce;

import com.xworkz.ecommerce.Ecommerce.Ecommerce;
import com.xworkz.ecommerce.products.Products;

import java.util.Scanner;

public class ProductRunner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter how many products you want to add: ");
            int size = sc.nextInt();
            sc.nextLine();

            if (size <= 0) {
                System.out.println("Enter a valid number");
                sc.close();
                return;
            }

            Ecommerce ecommerce = new Ecommerce(size);


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
            String YesOrNo = null;
            do {
                System.out.println("Press 1 to getAllProducts");

                System.out.println("Press 2 to getProductsInfo");

                System.out.println("Press 3 to getProductsById");

                System.out.println("Press 4 to getProductNamesByQuantity");

                System.out.println("Press 5 to getProductNamesByBrand");

                System.out.println("Press 6 to  getProductsByCategory");

                System.out.println("Press 7 to getProductsByPrice");

                System.out.println("Press 8 to getProductsByDiscount");

                System.out.println("Press 9 to updatePricebyName");

                int options = sc.nextInt();
                switch (options) {
                    case 1:
                        System.out.println("\n--- All Product Names ---");
                        ecommerce.getAllProducts();
                        break;

                    case 2:
                        System.out.println("\n--- All Product Information ---");
                        ecommerce.getProductsInfo();
                        break;

                    case 3:
                        System.out.print("\nEnter product ID to search: ");
                        int searchId = sc.nextInt();

                        Products foundProduct = ecommerce.getProductsById(searchId);

                        if (foundProduct != null) {
                            System.out.println("Product found: " + foundProduct);
                        } else {
                            System.out.println("Product not found");
                        }
                        break;

                    case 4:
                        System.out.print("\nEnter quantity to search: ");
                        int quantity = sc.nextInt();
                        System.out.println("Products matching quantity:");
                        ecommerce.getProductNamesByQuantity(quantity);
                        break;

                    case 5:
                        sc.nextLine();
                        System.out.print("\nEnter brand to search: ");
                        String brand = sc.nextLine();
                        System.out.println("Products matching brand:");
                        ecommerce.getProductNamesByBrand(brand);
                        break;

                    case 6:
                        sc.nextLine();
                        System.out.print("\nEnter category to search: ");
                        String category = sc.nextLine();

                        System.out.println("Products matching category:");
                        ecommerce.getProductsByCategory(category);
                        break;

                    case 7:
                        System.out.print("\nEnter price to search: ");
                        double price = sc.nextDouble();
                        System.out.println("Products matching price:");
                        ecommerce.getProductsByPrice(price);
                        break;

                    case 8:
                        System.out.print("\nEnter discount to search: ");
                        double discount = sc.nextDouble();
                        System.out.println("Products matching discount:");
                        ecommerce.getProductsByDiscount(discount);
                        break;

                    case 9:
                        boolean newPrice = ecommerce.updatePriceByName(35000, "Laptop");
                        System.out.println(newPrice);
                        break;

                    default:
                        System.out.println("Enter valid options");

                }
                System.out.println("do you want to continue Y/N");
                YesOrNo = sc.next();
            } while (YesOrNo.equalsIgnoreCase("Y"));

        }finally {
            sc.close();
        }

    }
}