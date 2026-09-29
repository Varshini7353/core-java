package com.ecommerce.app.amazon;

import com.ecommerce.app.product.Product;

public class Amazon {

    private Product[]  products=new Product[20];
    int index;

    public boolean addProduct(Product product){
        boolean isAdded=false;

        boolean isProductIdValid=false;
        boolean isProductNameValid=false;
        boolean isPriceValid=false;
        boolean isCustomerNameValid=false;
        boolean isAddressValid=false;
        boolean isProductsValid=false;



        int productId=product.getProductId();
        if(productId>0){
            isProductIdValid=true;
        }else System.out.println("Invalid productId");

        String productName=product.getProductName();
        if(productName!=null && !productName.isEmpty()){
            isProductNameValid=true;
        }else System.out.println("Invalid productName");

        int price=product.getPrice();
        if(price>0){
            isPriceValid=true;
        }else System.out.println("Invalid price");

        String customerName= product.getCustomerName();
        if(customerName!=null && !customerName.isEmpty()){
            isCustomerNameValid=true;
        }else System.out.println("Invalid customer name");

        String address=product.getAddress();
        if(address!=null && !address.isEmpty()){
            isAddressValid=true;
        }else System.out.println("Invalid address");

        String[] productsList=product.getProductsList();
        if(products!=null && products.length>0){
            isProductsValid=true;
        }else System.out.println("Invalid products");


        if(isProductIdValid && isProductNameValid && isPriceValid &&
        isCustomerNameValid && isAddressValid && isProductsValid){
            products [index++]=product;
            isAdded=true;
        }
        return isAdded;
    }

    public void getProductInfo(){

        for (Product product:products){
            System.out.println(product);
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        }
    }
}
