package com.institution.library;

import com.institution.library.product.Product;

public class ProductRunner {

    public static void main(String[] args) {

        Product product=new Product();
        product.setProductId(1);
        product.setProductName("Toster");
        product.setPrice(900.00);
        product.setBrandName("Bella");
        product.setModelNumber("u7889o");
        product.setPartNumber(982787);

        int id=product.getProductId();
        System.out.println(id);

        String name=product.getProductName();
        System.out.println(name);

        double price=product.getPrice();
        System.out.println(price);

        String bName=product.getBrandName();
        System.out.println(bName);

        String mNum= product.getModelNumber();
        System.out.println(mNum);

        int pNum=product.getPartNumber();
        System.out.println(pNum);


        System.out.println(product);
        System.out.println("----------------------------------------");

        Product product1=new Product();
        product1.setProductId(2);
        product1.setProductName("eyeliner");
        product1.setPrice(950.00);
        product1.setBrandName("Mascara");
        product1.setModelNumber("78treqw66");
        product1.setPartNumber(14678987);

        int id1 =product1.getProductId();
        System.out.println(id1);

        String name1=product1.getProductName();
        System.out.println(name1);

        double price1=product1.getPrice();
        System.out.println(price1);

        String bName1=product1.getBrandName();
        System.out.println(bName1);

        String mNum1= product1.getModelNumber();
        System.out.println(mNum1);

        int pNum1=product1.getPartNumber();
        System.out.println(pNum1);


        int productHash=product.hashCode();
        System.out.println(productHash);

        boolean isEquals=product.equals(product1);
        System.out.println("product equals to product1:" +isEquals);
        System.out.println(product1);
        System.out.println("--------------------------------------");

        Product product2=new Product();
        product2.setProductId(3);
        product2.setProductName("stove");
        product2.setPrice(950.00);
        product2.setBrandName("Peigon");
        product2.setModelNumber("u7iuoujjhj0o");
        product2.setPartNumber(987687647);

        int id2 =product2.getProductId();
        System.out.println(id2);

        String name2=product2.getProductName();
        System.out.println(name2);

        double price2=product2.getPrice();
        System.out.println(price2);

        String bName2=product2.getBrandName();
        System.out.println(bName2);

        String mNum2= product2.getModelNumber();
        System.out.println(mNum2);

        int pNum2=product2.getPartNumber();
        System.out.println(pNum2);


        System.out.println(product2);
        System.out.println("--------------------------------------");


        Product product4=new Product();
        product4.setProductId(4);
        product4.setProductName("Lipstick");
        product4.setPrice(8900.00);
        product4.setBrandName("Mac");
        product4.setModelNumber("rt78900");
        product4.setPartNumber(878657887);

        int id4 =product4.getProductId();
        System.out.println(id4);

        String name4=product4.getProductName();
        System.out.println(name4);

        double price4=product4.getPrice();
        System.out.println(price4);

        String bName4=product4.getBrandName();
        System.out.println(bName4);

        String mNum4= product4.getModelNumber();
        System.out.println(mNum4);

        int pNum4=product4.getPartNumber();
        System.out.println(pNum4);


        System.out.println(product4);
        System.out.println("----------------------------------------------");

        Product product5=new Product();
        product5.setProductId(5);
        product5.setProductName("Laptop");
        product5.setPrice(60000.00);
        product5.setBrandName("HP");
        product5.setModelNumber("tyjnj87676");
        product5.setPartNumber(115678);

        int id5 =product5.getProductId();
        System.out.println(id5);

        String name5=product5.getProductName();
        System.out.println(name5);

        double price5=product5.getPrice();
        System.out.println(price5);

        String bName5=product5.getBrandName();
        System.out.println(bName5);

        String mNum5= product5.getModelNumber();
        System.out.println(mNum5);

        int pNum5=product5.getPartNumber();
        System.out.println(pNum5);

        System.out.println(product5);




    }
}
