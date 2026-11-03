package com.xworkz.cart;

import com.xworkz.cart.carts.CartInfo;
import com.xworkz.cart.carts.CartOrder;
import com.xworkz.cart.order.CartInfoImpl;

import java.util.Scanner;

public class CartRunner {


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            try {
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

                    boolean result = cartInfo.addOrder(order);

                    if (result != false) {
                        System.out.println("Order added successfully!");
                    } else {
                        System.out.println("Order not added");
                    }
                }
                String YesOrNo = null;
                do {

                    System.out.println("Press 1 to getOrders");

                    System.out.println("Press 2 to getProductNameByOrderId");

                    System.out.println("Press 3 to getPriceByOrderId");

                    System.out.println("Press 4 to getQuantityByOrderId");

                    System.out.println("Press 5 to getOrderStatusByOrderId ");

                    System.out.println("Press 6 to getCustomerNameByOrderId");


                    int options = scanner.nextInt();
                    switch (options) {


                        case 1:
                            System.out.println("\n--- All Orders ---");
                            cartInfo.getOrders();
                            break;

                        case 2:
                            System.out.print("\nEnter order ID to find product name: ");
                            int searchId = scanner.nextInt();
                            String productName = cartInfo.getProductNameByOrderId(searchId);
                            System.out.println("Product name: " + productName);
                            break;


                        case 3:
                            System.out.print("\nEnter order ID to find price: ");
                            int priceId = scanner.nextInt();
                            double price = cartInfo.getPriceByOrderId(priceId);
                            System.out.println("Price: " + price);
                            break;

                        case 4:
                            System.out.print("\nEnter order ID to find quantity: ");
                            int quantityId = scanner.nextInt();
                            int quantity = cartInfo.getQuantityByOrderId(quantityId);
                            System.out.println("Quantity: " + quantity);
                            break;


                        case 5:
                            System.out.print("\nEnter order ID to find order status: ");
                            int statusId = scanner.nextInt();
                            String status = cartInfo.getOrderStatusByOrderId(statusId);
                            System.out.println("Order status: " + status);
                            break;


                        case 6:
                            System.out.print("\nEnter order ID to find customer name: ");
                            int customerId = scanner.nextInt();
                            String customerName = cartInfo.getCustomerNameByOrderId(customerId);
                            System.out.println("Customer name: " + customerName);
                            break;

                        default:
                            System.out.println("Enter valid options");
                    }
                    System.out.println("Do you want continue Y/N");
                    YesOrNo = scanner.next();
                } while (YesOrNo.equalsIgnoreCase("Y"));

            }finally {
                scanner.close();
            }

        }
    }

