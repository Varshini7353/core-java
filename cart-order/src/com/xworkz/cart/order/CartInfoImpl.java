package com.xworkz.cart.order;

import com.xworkz.cart.carts.CartInfo;
import com.xworkz.cart.carts.CartOrder;
import com.xworkz.cart.exception.*;

import java.util.SortedMap;

public class CartInfoImpl implements CartInfo {


        private CartOrder[] orders = new CartOrder[5];
        private int index = 0;

        @Override
        public boolean addOrder(CartOrder order) {
            boolean isAdded = false;

            boolean isOrderIdValid = false;
            boolean isProductNameValid = false;
            boolean isPriceValid = false;
            boolean isQuantityValid = false;
            boolean isOrderStatusValid = false;
            boolean isCustomerNameValid = false;


            int orderId = order.getOrderId();
            if (orderId > 0) {
                isOrderIdValid = true;
            } else System.out.println("Invalid orderId");

            String productName = order.getProductName();
            if (productName != null && !productName.isEmpty()) {
                isProductNameValid = true;
            } else System.out.println("Invalid productName");

            double price = order.getPrice();
            if (price > 0) {
                isPriceValid = true;
            } else System.out.println("Invalid price");

            int quantity = order.getQuantity();
            if (quantity > 0) {
                isQuantityValid = true;
            } else System.out.println("Invalid quantity");


            String orderStatus = order.getOrderStatus();
            if (orderStatus != null && !orderStatus.isEmpty()) {
                isOrderStatusValid = true;
            } else System.out.println("Invalid orderStatus");

            String customerName = order.getCustomerName();
            if (customerName != null && !customerName.isEmpty()) {
                isCustomerNameValid = true;
            } else System.out.println("Invalid customerName");

            if (isOrderIdValid && isProductNameValid && isPriceValid && isQuantityValid &&
                    isOrderStatusValid && isCustomerNameValid) {

                if (index < orders.length) {
                    orders[index++] = order;
                    isAdded = true;
                } else {
                    System.out.println("Cart list is full");
                }
            }
            return isAdded;
        }
        @Override
        public void getOrders() {
            try {

                for (CartOrder order : orders) {
                    if (order != null) {
                        order.getProductName();
                        System.out.println(order);
                    }
                }
                if (orders == null) {
                    CartInvalidOrderException exception = new CartInvalidOrderException("Invalid orders");
                    throw exception;
                }
            } catch (CartInvalidOrderException ee) {
                ee.printStackTrace();
            }
        }

        @Override
        public String getProductNameByOrderId(int orderId) {
            try {
                for (CartOrder order : orders) {
                    if (order != null && order.getOrderId() == orderId) {
                        return order.getProductName();
                    }
                }
                if (orders == null) {
                    CartInvalidProductNamebyidException exception = new CartInvalidProductNamebyidException("Invalid productId");
                    throw exception;
                }
            }catch (CartInvalidProductNamebyidException qq){
                qq.printStackTrace();
            }
            return "Order not found";
        }

        @Override
        public double getPriceByOrderId(int orderId) {
            try {
                for (CartOrder order : orders) {
                    if (order != null && order.getOrderId() == orderId) {
                        return order.getPrice();
                    }
                }
                if (orders == null) {
                    CartInvalidPricebyOrderIdException exception = new CartInvalidPricebyOrderIdException("Invalid orderId");
                    throw exception;
                }
            }catch (CartInvalidPricebyOrderIdException rr){
                rr.printStackTrace();
            }
            return -1;
        }

        @Override
        public int getQuantityByOrderId(int orderId) {
            try {
                for (CartOrder order : orders) {
                    if (order != null && order.getOrderId() == orderId) {
                        return order.getQuantity();
                    }
                }
                if (orders == null) {
                    CartInvalidQuantitybyOderIdException exception = new CartInvalidQuantitybyOderIdException("Sorry..invlid quantity");
                    throw exception;
                }
            }catch (CartInvalidQuantitybyOderIdException aa){
                aa.printStackTrace();
            }
            return -1;
        }

        @Override
        public String getOrderStatusByOrderId(int orderId) {

            try {
                for (CartOrder order : orders) {
                    if (order != null && order.getOrderId() == orderId) {
                        return order.getOrderStatus();
                    }
                }
                if (orders == null) {
                  CartInvalidCartStatusException exception = new CartInvalidCartStatusException("Sorry invalid oderstatus");
                    throw exception;
                }
            }catch (CartInvalidOrderException zz){
                zz.printStackTrace();
            }
            return "Order not found";
        }

        @Override
        public String getCustomerNameByOrderId(int orderId) {
            try {
                for (CartOrder order : orders) {
                    if (order != null && order.getOrderId() == orderId) {
                        return order.getCustomerName();
                    }
                }
                if (orders == null) {
                    OrderIdInvalidCustomerNameException exception = new OrderIdInvalidCustomerNameException("Invalid customerName");
                    throw exception;
                }
            }catch (OrderIdInvalidCustomerNameException ee){
                ee.printStackTrace();
            }
            return "Order not found";
        }
    }
