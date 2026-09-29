package com.shop.fancystore;

import com.shop.fancystore.items.Items;
import com.shop.fancystore.store.FancyStore;

public class FancystoreRunner {

    public static void main(String[] args) {

        FancyStore store=new FancyStore();

        String[] items = {"Bangles", "Earrings", "Necklace", "Hair Clips"};
        String[] items2 = {"Bangles", "Earrings", "Hair Clips", "Necklace"};
        String[] items3 = {"Bracelet", "Ring", "Anklet", "Hair Band"};
        String[] items4 = {"Bindi", "Bangles", "Earrings", "Hair Pins"};
        String[] items5 = {"Necklace", "Bracelet", "Earrings", "Ring"};
        String[] items6 = {"Hair Clips", "Hair Bands", "Scrunchies", "Hair Pins"};
        String[] items7 = {"Bangles", "Anklets", "Toe Rings", "Bracelets"};
        String[] items8 = {"Earrings", "Necklace", "Pendant", "Rings"};
        String[] items9 = {"Bindi", "Kajal", "Hair Clips", "Hair Bands"};
        String[] items10 = {"Bracelets", "Earrings", "Rings", "Anklets"};
        String[] items11 = {"Necklace", "Bangles", "Hair Clips", "Bindi"};
        String[] items12 = {"Hair Pins", "Scrunchies", "Hair Bands", "Clips"};
        String[] items13 = {"Earrings", "Bangles", "Bracelet", "Pendant"};
        String[] items14 = {"Ring", "Necklace", "Earrings", "Bracelet"};
        String[] items15 = {"Bangles", "Bindi", "Anklets", "Hair Clips"};
        String[] items16 = {"Earrings", "Hair Bands", "Scrunchies", "Bracelets"};
        String[] items17 = {"Necklace", "Earrings", "Bangles", "Rings"};
        String[] items18 = {"Hair Clips", "Bindi", "Hair Pins", "Kajal"};
        String[] items19 = {"Bracelet", "Anklet", "Toe Rings", "Bangles"};
        String[] items20 = {"Earrings", "Pendant", "Necklace", "Rings"};
        String[] items21 = {"Bangles", "Bracelets", "Hair Clips", "Earrings"};
        String[] items22 = {"Bindi", "Hair Pins", "Hair Bands", "Scrunchies"};
        String[] items23 = {"Necklace", "Bracelet", "Earrings", "Anklets"};
        String[] items24 = {"Rings", "Bangles", "Pendant", "Hair Clips"};
        String[] items25 = {"Earrings", "Necklace", "Bangles", "Bracelet"};



        Items  item=new Items();
        item.setStoreId(1);
        item.setStoreName("Fashion corner");
        item.setOwnerName("Varsha");
        item.setLocation("Tumkur");
        item.setItems(items);

        Items item1=new Items();
        item1.setStoreId(2);
        item1.setStoreName("Beauty corner");
        item1.setOwnerName("Ganga");
        item1.setLocation("Bangalore");
        item1.setItems(items2);

        Items item2=new Items();
        item2.setStoreId(3);
        item2.setStoreName("Fancy world");
        item2.setOwnerName("Tunga");
        item2.setLocation("Mysore");
        item2.setItems(items3);

        Items item3=new Items();
        item3.setStoreId(4);
        item3.setStoreName("Style point ");
        item3.setOwnerName("Sneha");
        item3.setLocation("Mandya");
        item3.setItems(items4);

        Items item4=new Items();
        item4.setStoreId(5);
        item4.setStoreName("Fashion Hub");
        item4.setOwnerName("Prema");
        item4.setLocation("Maddur");
        item4.setItems(items5);

        Items item5=new Items();
        item5.setStoreId(6);
        item5.setStoreName("Pretty collections");
        item5.setOwnerName("Prerthi");
        item5.setLocation("Chikkmaglur");
        item5.setItems(items6);

        Items item6=new Items();
        item6.setStoreId(7);
        item6.setStoreName("Classic fancy");
        item6.setOwnerName("Prameela");
        item6.setLocation("Madhugiri");
        item6.setItems(items7);

        Items item7=new Items();
        item7.setStoreId(8);
        item7.setStoreName("Royal Accesories");
        item7.setOwnerName("Suma");
        item7.setLocation("Sira");
        item7.setItems(items8);

        Items item8=new Items();
        item8.setStoreId(9);
        item8.setStoreName("Beauty palace ");
        item8.setOwnerName("Sara");
        item8.setLocation("SHivmogga");
        item8.setItems(items9);

        Items item9=new Items();
        item9.setStoreId(10);
        item9.setStoreName("Fashion Zone");
        item9.setOwnerName("Likitha");
        item9.setLocation("Pavagada");
        item9.setItems(items10);

        Items item10=new Items();
        item10.setStoreId(11);
        item10.setStoreName("Elegant store");
        item10.setOwnerName("Asha");
        item10.setLocation("Belagum");
        item10.setItems(items11);

        Items item11=new Items();
        item11.setStoreId(12);
        item11.setStoreName("Trendy collection ");
        item11.setOwnerName("Nidhi");
        item11.setLocation("Bidar");
        item11.setItems(items12);


        Items item12=new Items();
        item12.setStoreId(13);
        item12.setStoreName("Glitter store");
        item12.setOwnerName("Bhavya");
        item12.setLocation("NagarBhavi");
        item12.setItems(items13);

        Items item13=new Items();
        item13.setStoreId(14);
        item13.setStoreName("Shine Collection");
        item13.setOwnerName("Bhagya");
        item13.setLocation("Jaynagar");
        item13.setItems(items14);

        Items item14=new Items();
        item14.setStoreId(15);
        item14.setStoreName("Women fashion");
        item14.setOwnerName("Pallavi");
        item14.setLocation("Mejestic");
        item14.setItems(items15);

        Items item15=new Items();
        item15.setStoreId(16);
        item15.setStoreName("Fashion gallery");
        item15.setOwnerName("Swathi");
        item15.setLocation("Koppal");
        item15.setItems(items16);

        Items item16=new Items();
        item16.setStoreId(17);
        item16.setStoreName("Star fancy store");
        item16.setOwnerName("Sabha");
        item16.setLocation("Kodagu");
        item16.setItems(items17);

        Items item17=new Items();
        item17.setStoreId(18);
        item17.setStoreName("Beauty worls");
        item17.setOwnerName("Suhas");
        item17.setLocation("Kunigal");
        item17.setItems(items18);

        Items item18=new Items();
        item18.setStoreId(19);
        item18.setStoreName("Modern fancy");
        item18.setOwnerName("Soujanya");
        item18.setLocation("rajajinagar");
        item18.setItems(items19);

        Items item19=new Items();
        item19.setStoreId(20);
        item19.setStoreName("jewellery corner");
        item19.setOwnerName("kiran");
        item19.setLocation("Hebbal");
        item19.setItems(items20);

        Items item20=new Items();
        item20.setStoreId(21);
        item20.setStoreName("Fashion world");
        item20.setOwnerName("Harish");
        item20.setLocation("Kaverinagara");
        item20.setItems(items21);

        Items item21=new Items();
        item21.setStoreId(22);
        item21.setStoreName("Cute collections");
        item21.setOwnerName("Manasa");
        item21.setLocation("Bijapur");
        item21.setItems(items22);

        Items item22=new Items();
        item22.setStoreId(23);
        item22.setStoreName("Elegant fancy");
        item22.setOwnerName("Divya");
        item22.setLocation("Vijaynagar");
        item22.setItems(items23);

        Items item23=new Items();
        item23.setStoreId(24);
        item23.setStoreName("Fashion trends");
        item23.setOwnerName("Deepa");
        item23.setLocation("Chitradurga");
        item23.setItems(items24);

        Items item24=new Items();
        item24.setStoreId(25);
        item24.setStoreName("Fancy paradise");
        item24.setOwnerName("kavya");
        item24.setLocation("Kengeri");
        item24.setItems(items25);



        store.addItems(item);
        store.addItems(item1);
        store.addItems(item2);
        store.addItems(item3);
        store.addItems(item4);
        store.addItems(item5);
        store.addItems(item6);
        store.addItems(item7);
        store.addItems(item8);
        store.addItems(item9);
        store.addItems(item10);
        store.addItems(item11);
        store.addItems(item12);
        store.addItems(item13);
        store.addItems(item14);
        store.addItems(item15);
        store.addItems(item16);
        store.addItems(item17);
        store.addItems(item18);
        store.addItems(item19);
        store.addItems(item20);
        store.addItems(item21);
        store.addItems(item22);
        store.addItems(item23);
        store.addItems(item24);
        store.getItemInfo();





    }
}
