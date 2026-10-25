package com.xworkz.cart.carts;

public interface CartInfo {


        int addOrder(CartOrder order);

        void getOrders();

        String getProductNameByOrderId(int orderId);

        double getPriceByOrderId(int orderId);

        int getQuantityByOrderId(int orderId);

        String getOrderStatusByOrderId(int orderId);

        String getCustomerNameByOrderId(int orderId);
    }

