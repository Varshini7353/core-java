package com.ecommerce.app;

import com.ecommerce.app.amazon.Amazon;
import com.ecommerce.app.product.Product;

public class AmazonRunner {

    public static void main(String[] args) {

        Amazon amazon=new Amazon();

        String[] products={"Mouse","Keyboard","cpu","Printer"};
        String[] phoneProducts = {"Phone", "Charger", "Earphones", "Phone Case"};
        String[] televisionProducts = {"Television", "Remote", "HDMI Cable", "Wall Mount"};
        String[] refrigeratorProducts = {"Refrigerator", "Ice Tray", "Water Bottle", "Cleaning Cloth"};
        String[] washingMachineProducts = {"Washing Machine", "Detergent", "Drain Pipe", "Inlet Pipe"};
        String[] cameraProducts = {"Camera", "Camera Bag", "Memory Card", "Tripod"};
        String[] printerProducts = {"Printer", "Ink Cartridge", "USB Cable", "Printer Paper"};
        String[] headphonesProducts = {"Headphones", "Charging Cable", "Audio Cable", "Carrying Case"};
        String[] smartwatchProducts = {"Smart Watch", "Charger", "Watch Strap", "Screen Guard"};
        String[] tabletProducts = {"Tablet", "Charger", "Stylus Pen", "Tablet Cover"};
        String[] keyboardProducts = {"Keyboard", "USB Cable", "Wrist Rest", "Keycap Set"};
        String[] mouseProducts = {"Mouse", "USB Receiver", "Mouse Pad", "Batteries"};
        String[] speakerProducts = {"Bluetooth Speaker", "Charger", "AUX Cable", "Carrying Case"};
        String[] powerbankProducts = {"Power Bank", "USB Cable", "Adapter", "Travel Pouch"};
        String[] routerProducts = {"WiFi Router", "LAN Cable", "Power Adapter", "User Manual"};
        String[] gamingProducts = {"Gaming Keyboard", "Gaming Mouse", "Gaming Headset", "Mouse Pad"};
        String[] monitorProducts = {"Monitor", "HDMI Cable", "Power Cable", "Monitor Stand"};
        String[] airconditionerProducts = {"Air Conditioner", "Remote", "Stabilizer", "AC Filter"};
        String[] microwaveProducts = {"Microwave Oven", "Glass Tray", "Rack", "Cleaning Cloth"};
        String[] printerScannerProducts = {"Scanner", "USB Cable", "Scanner Stand", "Cleaning Kit"};


        Product product=new Product();
        product.setProductId(1);
        product.setProductName("Laptop");
        product.setPrice(40000);
        product.setCustomerName("Varsha");
        product.setAddress("Madhugiri");
        product.setProductsList(products);

        Product product1=new Product();
        product1.setProductId(2);
        product1.setProductName("Mobile");
        product1.setPrice(25000);
        product1.setCustomerName("Darshan");
        product1.setAddress("Sira");
        product1.setProductsList(phoneProducts);

        Product product2=new Product();
        product2.setProductId(3);
        product2.setProductName("Television");
        product2.setPrice(80000);
        product2.setCustomerName("Rahul");
        product2.setAddress("Tumkur");
        product2.setProductsList(televisionProducts);

        Product product3=new Product();
        product3.setProductId(4);
        product3.setProductName("Refrigirator");
        product3.setPrice(90000);
        product3.setCustomerName("Ram");
        product3.setAddress("Turvekere");
        product3.setProductsList(refrigeratorProducts);

        Product product4=new Product();
        product4.setProductId(5);
        product4.setProductName("WashingMachine");
        product4.setPrice(40000);
        product4.setCustomerName("Ramesh");
        product4.setAddress("Tiptur");
        product4.setProductsList(washingMachineProducts);

        Product product5=new Product();
        product5.setProductId(6);
        product5.setProductName("CameraProducts");
        product5.setPrice(30000);
        product5.setCustomerName("Tharun");
        product5.setAddress("Bhasham circle");
        product5.setProductsList(cameraProducts);

        Product product6=new Product();
        product6.setProductId(7);
        product6.setProductName("Printer products");
        product6.setPrice(20000);
        product6.setCustomerName("Abhi");
        product6.setAddress("mysore");
        product6.setProductsList(printerProducts);

        Product product7=new Product();
        product7.setProductId(8);
        product7.setProductName("HeadPhone products");
        product7.setPrice(7000);
        product7.setCustomerName("Acharya");
        product7.setAddress("Mandya");
        product7.setProductsList(headphonesProducts);

        Product product8=new Product();
        product8.setProductId(9);
        product8.setProductName("Smartwatch products");
        product8.setPrice(3000);
        product8.setCustomerName("Archana");
        product8.setAddress("Maddur");
        product8.setProductsList(smartwatchProducts);

        Product product9=new Product();
        product9.setProductId(10);
        product9.setProductName("Tablet products");
        product9.setPrice(70000);
        product9.setCustomerName("Amith");
        product9.setAddress("Manglore");
        product9.setProductsList(tabletProducts);

        Product product10=new Product();
        product10.setProductId(11);
        product10.setProductName("Keyboard products");
        product10.setPrice(8000);
        product10.setCustomerName("Akash");
        product10.setAddress("Banglore");
        product10.setProductsList(keyboardProducts);

        Product product11=new Product();
        product11.setProductId(12);
        product11.setProductName("Mouse products");
        product11.setPrice(2000);
        product11.setCustomerName("Akanksha");
        product11.setAddress("Bidar");
        product11.setProductsList(mouseProducts);

        Product product12=new Product();
        product12.setProductId(13);
        product12.setProductName("Speker products");
        product12.setPrice(9000);
        product12.setCustomerName("Bindu");
        product12.setAddress("Bagalkot");
        product12.setProductsList(speakerProducts);

        Product product13=new Product();
        product13.setProductId(14);
        product13.setProductName("Powerbank products");
        product13.setPrice(5000);
        product13.setCustomerName("Sneha");
        product13.setAddress("Bankok");
        product13.setProductsList(powerbankProducts);

        Product product14=new Product();
        product14.setProductId(15);
        product14.setProductName("Router products");
        product14.setPrice(8000);
        product14.setCustomerName("Akaay");
        product14.setAddress("Bangladesh");
        product14.setProductsList(routerProducts);

        Product product15=new Product();
        product15.setProductId(16);
        product15.setProductName("Gaming products");
        product15.setPrice(30000);
        product15.setCustomerName("Santhosh");
        product15.setAddress("Pavagada");
        product15.setProductsList(gamingProducts);

        Product product16=new Product();
        product16.setProductId(17);
        product16.setProductName("Monitor products");
        product16.setPrice(7000);
        product16.setCustomerName("Srinivas");
        product16.setAddress("Gubbi");
        product16.setProductsList(monitorProducts);

        Product product17=new Product();
        product17.setProductId(18);
        product17.setProductName("AC products");
        product17.setPrice(1500);
        product17.setCustomerName("Puneeth");
        product17.setAddress("Kolar");
        product17.setProductsList(airconditionerProducts);

        Product product18=new Product();
        product18.setProductId(19);
        product18.setProductName("Microwave products");
        product18.setPrice(34000);
        product18.setCustomerName("Arun");
        product18.setAddress("Kodagu");
        product18.setProductsList(microwaveProducts);

        Product product19=new Product();
        product19.setProductId(20);
        product19.setProductName("PrinterScanner products");
        product19.setPrice(45000);
        product19.setCustomerName("Chandan");
        product19.setAddress("Hassan");
        product19.setProductsList(printerScannerProducts);


        amazon.addProduct(product);
        amazon.addProduct(product1);
        amazon.addProduct(product2);
        amazon.addProduct(product3);
        amazon.addProduct(product4);
        amazon.addProduct(product5);
        amazon.addProduct(product6);
        amazon.addProduct(product7);
        amazon.addProduct(product8);
        amazon.addProduct(product9);
        amazon.addProduct(product10);
        amazon.addProduct(product11);
        amazon.addProduct(product12);
        amazon.addProduct(product13);
        amazon.addProduct(product14);
        amazon.addProduct(product15);
        amazon.addProduct(product16);
        amazon.addProduct(product17);
        amazon.addProduct(product18);
        amazon.addProduct(product19);




        amazon.getProductInfo();

    }


}
