package com.xworkz.cart.order;

import com.xworkz.cart.carts.CartInfo;
import com.xworkz.cart.carts.CartOrder;

public class CartInfoImpl implements CartInfo {


        private CartOrder[] orders = new CartOrder[5];
        private int index = 0;

        @Override
        public int addOrder(CartOrder order) {
            if (order == null || index >= orders.length) {
                return 0;
            }

            if (order.getProductName() == null ||
                    order.getOrderStatus() == null ||
                    order.getCustomerName() == null) {
                return 0;
            }

            orders[index++] = order;
            return 1;
        }

        @Override
        public void getOrders() {
            for (CartOrder order : orders) {
                if (order != null) {
                    System.out.println(
                            "Order ID: " + order.getOrderId()
                                    + ", Product: " + order.getProductName()
                                    + ", Price: " + order.getPrice()
                                    + ", Quantity: " + order.getQuantity()
                                    + ", Status: " + order.getOrderStatus()
                                    + ", Customer: " + order.getCustomerName()
                    );
                }
            }
        }

        @Override
        public String getProductNameByOrderId(int orderId) {
            for (CartOrder order : orders) {
                if (order != null && order.getOrderId() == orderId) {
                    return order.getProductName();
                }
            }
            return "Order not found";
        }

        @Override
        public double getPriceByOrderId(int orderId) {
            for (CartOrder order : orders) {
                if (order != null && order.getOrderId() == orderId) {
                    return order.getPrice();
                }
            }
            return -1;
        }

        @Override
        public int getQuantityByOrderId(int orderId) {
            for (CartOrder order : orders) {
                if (order != null && order.getOrderId() == orderId) {
                    return order.getQuantity();
                }
            }
            return -1;
        }

        @Override
        public String getOrderStatusByOrderId(int orderId) {
            for (CartOrder order : orders) {
                if (order != null && order.getOrderId() == orderId) {
                    return order.getOrderStatus();
                }
            }
            return "Order not found";
        }

        @Override
        public String getCustomerNameByOrderId(int orderId) {
            for (CartOrder order : orders) {
                if (order != null && order.getOrderId() == orderId) {
                    return order.getCustomerName();
                }
            }
            return "Order not found";
        }
    }
