package com.xworkz.cart;

import com.xworkz.cart.carts.CartInfo;
import com.xworkz.cart.carts.CartOrder;
import com.xworkz.cart.order.CartInfoImpl;

import java.util.Scanner;

public class CartRunner {


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of orders: ");
            int size = scanner.nextInt();
            scanner.nextLine();

            if (size <= 0) {
                System.out.println("Enter a valid number");
                scanner.close();
                return;
            }

            CartInfo cartInfo = new CartInfoImpl();

            for (int i = 0; i < size; i++) {

                CartOrder order = new CartOrder();

                System.out.println("\nEnter details for order " + (i + 1));

                System.out.print("Enter order ID: ");
                order.setOrderId(scanner.nextInt());
                scanner.nextLine();

                System.out.print("Enter product name: ");
                order.setProductName(scanner.nextLine());

                System.out.print("Enter product price: ");
                order.setPrice(scanner.nextDouble());

                System.out.print("Enter quantity: ");
                order.setQuantity(scanner.nextInt());
                scanner.nextLine();

                System.out.print("Enter order status: ");
                order.setOrderStatus(scanner.nextLine());

                System.out.print("Enter customer name: ");
                order.setCustomerName(scanner.nextLine());

                int result = cartInfo.addOrder(order);

                if (result > 0) {
                    System.out.println("Order added successfully!");
                } else {
                    System.out.println("Order not added");
                }
            }

            System.out.println("\n--- All Orders ---");
            cartInfo.getOrders();

            System.out.print("\nEnter order ID to find product name: ");
            int searchId = scanner.nextInt();
            String productName = cartInfo.getProductNameByOrderId(searchId);
            System.out.println("Product name: " + productName);

            System.out.print("\nEnter order ID to find price: ");
            int priceId = scanner.nextInt();
            double price = cartInfo.getPriceByOrderId(priceId);
            System.out.println("Price: " + price);

            System.out.print("\nEnter order ID to find quantity: ");
            int quantityId = scanner.nextInt();
            int quantity = cartInfo.getQuantityByOrderId(quantityId);
            System.out.println("Quantity: " + quantity);

            System.out.print("\nEnter order ID to find order status: ");
            int statusId = scanner.nextInt();
            String status = cartInfo.getOrderStatusByOrderId(statusId);
            System.out.println("Order status: " + status);

            System.out.print("\nEnter order ID to find customer name: ");
            int customerId = scanner.nextInt();
            String customerName = cartInfo.getCustomerNameByOrderId(customerId);
            System.out.println("Customer name: " + customerName);

            scanner.close();
        }
    }

