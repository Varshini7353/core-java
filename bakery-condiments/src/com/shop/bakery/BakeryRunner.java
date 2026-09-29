package com.shop.bakery;

import com.shop.bakery.bakery.Bakery;
import com.shop.bakery.condiments.Condiments;

public class BakeryRunner {

    public static void main(String[] args) {

        Bakery bakery=new Bakery();

        String[] condiments1 = {"Ketchup", "Mayonnaise", "Mustard"};
        String[] condiments2 = {"Chilli Sauce", "Cheese Sauce", "Garlic Sauce"};
        String[] condiments3 = {"Jam", "Honey", "Chocolate Sauce"};
        String[] condiments4 = {"Ketchup", "Chilli Sauce", "Mayonnaise"};
        String[] condiments5 = {"Mustard", "Garlic Sauce", "Cheese Sauce"};
        String[] condiments6 = {"Jam", "Honey", "Ketchup"};
        String[] condiments7 = {"Mayonnaise", "Mustard", "Chilli Sauce"};
        String[] condiments8 = {"Chocolate Sauce", "Honey", "Garlic Sauce"};
        String[] condiments9 = {"Ketchup", "Mustard", "Jam"};
        String[] condiments10 = {"Cheese Sauce", "Mayonnaise", "Honey"};
        String[] condiments11 = {"Garlic Sauce", "Chilli Sauce", "Ketchup"};
        String[] condiments12 = {"Jam", "Chocolate Sauce", "Mustard"};
        String[] condiments13 = {"Honey", "Mayonnaise", "Garlic Sauce"};
        String[] condiments14 = {"Ketchup", "Cheese Sauce", "Chilli Sauce"};
        String[] condiments15 = {"Mustard", "Jam", "Honey"};
        String[] condiments16 = {"Mayonnaise", "Chocolate Sauce", "Garlic Sauce"};
        String[] condiments17 = {"Ketchup", "Chilli Sauce", "Mustard"};


        Condiments condiment1 = new Condiments();
        condiment1.setBakeryId(1);
        condiment1.setBakeryName("Sri Bakery");
        condiment1.setLocation("Bangalore");
        condiment1.setOwnerName("Ramesh");
        condiment1.setPrice(120);
        condiment1.setCondiments(condiments1);

        Condiments condiment2 = new Condiments();
        condiment2.setBakeryId(2);
        condiment2.setBakeryName("Fresh Bake");
        condiment2.setLocation("Mysore");
        condiment2.setOwnerName("Suresh");
        condiment2.setPrice(150);
        condiment2.setCondiments(condiments2);

        Condiments condiment3 = new Condiments();
        condiment3.setBakeryId(3);
        condiment3.setBakeryName("Cake Corner");
        condiment3.setLocation("Tumkur");
        condiment3.setOwnerName("Ravi");
        condiment3.setPrice(180);
        condiment3.setCondiments(condiments3);

        Condiments condiment4 = new Condiments();
        condiment4.setBakeryId(4);
        condiment4.setBakeryName("Sweet Treats");
        condiment4.setLocation("Chennai");
        condiment4.setOwnerName("Kiran");
        condiment4.setPrice(200);
        condiment4.setCondiments(condiments4);

        Condiments condiment5 = new Condiments();
        condiment5.setBakeryId(5);
        condiment5.setBakeryName("Bake House");
        condiment5.setLocation("Hyderabad");
        condiment5.setOwnerName("Vijay");
        condiment5.setPrice(130);
        condiment5.setCondiments(condiments5);

        Condiments condiment6 = new Condiments();
        condiment6.setBakeryId(6);
        condiment6.setBakeryName("Golden Bakery");
        condiment6.setLocation("Mumbai");
        condiment6.setOwnerName("Arun");
        condiment6.setPrice(160);
        condiment6.setCondiments(condiments6);

        Condiments condiment7 = new Condiments();
        condiment7.setBakeryId(7);
        condiment7.setBakeryName("Royal Bakers");
        condiment7.setLocation("Pune");
        condiment7.setOwnerName("Manoj");
        condiment7.setPrice(175);
        condiment7.setCondiments(condiments7);

        Condiments condiment8 = new Condiments();
        condiment8.setBakeryId(8);
        condiment8.setBakeryName("City Bakery");
        condiment8.setLocation("Delhi");
        condiment8.setOwnerName("Ajay");
        condiment8.setPrice(190);
        condiment8.setCondiments(condiments8);

        Condiments condiment9 = new Condiments();
        condiment9.setBakeryId(9);
        condiment9.setBakeryName("Bake Point");
        condiment9.setLocation("Goa");
        condiment9.setOwnerName("Vikas");
        condiment9.setPrice(220);
        condiment9.setCondiments(condiments9);

        Condiments condiment10 = new Condiments();
        condiment10.setBakeryId(10);
        condiment10.setBakeryName("Delight Bakery");
        condiment10.setLocation("Mangalore");
        condiment10.setOwnerName("Naveen");
        condiment10.setPrice(140);
        condiment10.setCondiments(condiments10);

        Condiments condiment11 = new Condiments();
        condiment11.setBakeryId(11);
        condiment11.setBakeryName("Sunrise Bakery");
        condiment11.setLocation("Hubli");
        condiment11.setOwnerName("Ganesh");
        condiment11.setPrice(155);
        condiment11.setCondiments(condiments11);

        Condiments condiment12 = new Condiments();
        condiment12.setBakeryId(12);
        condiment12.setBakeryName("Foodie Bakers");
        condiment12.setLocation("Belgaum");
        condiment12.setOwnerName("Prakash");
        condiment12.setPrice(170);
        condiment12.setCondiments(condiments12);

        Condiments condiment13 = new Condiments();
        condiment13.setBakeryId(13);
        condiment13.setBakeryName("Happy Bakery");
        condiment13.setLocation("Kochi");
        condiment13.setOwnerName("Deepak");
        condiment13.setPrice(185);
        condiment13.setCondiments(condiments13);

        Condiments condiment14 = new Condiments();
        condiment14.setBakeryId(14);
        condiment14.setBakeryName("Creamy Bakes");
        condiment14.setLocation("Coimbatore");
        condiment14.setOwnerName("Santosh");
        condiment14.setPrice(210);
        condiment14.setCondiments(condiments14);

        Condiments condiment15 = new Condiments();
        condiment15.setBakeryId(15);
        condiment15.setBakeryName("Modern Bakery");
        condiment15.setLocation("Salem");
        condiment15.setOwnerName("Harish");
        condiment15.setPrice(145);
        condiment15.setCondiments(condiments15);

        Condiments condiment16 = new Condiments();
        condiment16.setBakeryId(16);
        condiment16.setBakeryName("Tasty Bakes");
        condiment16.setLocation("Madurai");
        condiment16.setOwnerName("Mahesh");
        condiment16.setPrice(165);
        condiment16.setCondiments(condiments16);

        Condiments condiment17 = new Condiments();
        condiment17.setBakeryId(17);
        condiment17.setBakeryName("Star Bakery");
        condiment17.setLocation("Vijayawada");
        condiment17.setOwnerName("Rohit");
        condiment17.setPrice(195);
        condiment17.setCondiments(condiments17);


        bakery.addCondiments(condiment1);
        bakery.addCondiments(condiment2);
        bakery.addCondiments(condiment3);
        bakery.addCondiments(condiment4);
        bakery.addCondiments(condiment5);
        bakery.addCondiments(condiment6);
        bakery.addCondiments(condiment7);
        bakery.addCondiments(condiment8);
        bakery.addCondiments(condiment9);
        bakery.addCondiments(condiment10);
        bakery.addCondiments(condiment11);
        bakery.addCondiments(condiment12);
        bakery.addCondiments(condiment13);
        bakery.addCondiments(condiment14);
        bakery.addCondiments(condiment15);
        bakery.addCondiments(condiment16);
        bakery.addCondiments(condiment17);

        bakery.getCondimentsInfo();

    }
}
