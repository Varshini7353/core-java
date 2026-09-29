package com.shop.fancystore.store;

import com.shop.fancystore.items.Items;

public class FancyStore {

    private Items[] items=new Items[25];
    int index;


    public boolean addItems(Items item){
        boolean isAdded=false;

        boolean isStoreIdValid=false;
        boolean isStroreNameValid=false;
        boolean isOwnernameValid=false;
        boolean isLocationValid=false;
        boolean isItemsValid=false;


        int storeId=item.getStoreId();
        if(storeId>0){
            isStoreIdValid=true;
        }else System.out.println("Invalid id");

        String storeName=item.getStoreName();
        if(storeName!=null && !storeName.isEmpty()){
            isStroreNameValid=true;
        }else System.out.println("Invalid store name");

        String ownerName=item.getOwnerName();
        if(ownerName!=null && !ownerName.isEmpty()){
            isOwnernameValid=true;
        }else System.out.println("Invalid owner name");

        String location=item.getLocation();
        if(location!=null && !location.isEmpty()){
            isLocationValid=true;
        }else System.out.println("Invalid location");

        String[] itemList=item.getItems();
        if(items!=null && items.length>0){
            isItemsValid=true;
        }else System.out.println("invalid items list");


        if(isStoreIdValid && isStroreNameValid && isOwnernameValid &&
        isLocationValid && isItemsValid){
            items[index++]=item;
            isAdded=true;
        }
        return isAdded;

    }
    public void getItemInfo(){

        for(Items item:items){
            System.out.println(item);
            System.out.println("------------------------------------------------------------------------------------------------------------------------");

        }
    }
}
