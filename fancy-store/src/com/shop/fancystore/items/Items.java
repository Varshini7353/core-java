package com.shop.fancystore.items;

import java.util.Arrays;

public class Items {

    private int storeId;
    private String storeName;
    private String ownerName;
    private String location;
    private String[] items;


    public int getStoreId(){
        return storeId;
    }

    public void setStoreId(int id){
        storeId=id;
    }

    public String getStoreName(){
        return storeName;
    }

    public void setStoreName(String sName){
        storeName=sName;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public void setOwnerName(String oName){
        ownerName=oName;
    }

    public String getLocation(){
        return location;
    }

    public void setLocation(String loc){
        location=loc;
    }

    public String[] getItems(){
        return items;
    }

    public void setItems(String[] item){
        items=item;
    }

    @Override
    public String toString(){
        return "Items(stroreId= "+this.storeId+" , storeName= "+this.storeName+", ownerName= "
                +this.ownerName+" , location= "+this.location+" , items= "+ Arrays.toString(this.items) +")";
    }
}
