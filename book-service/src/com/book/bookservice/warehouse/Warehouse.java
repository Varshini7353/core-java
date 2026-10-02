package com.book.bookservice.warehouse;

public class Warehouse {

    public int warehouseId;
    public String warehouseName;
    public String location;
    public String managerName;
    public String capacity;


    @Override
    public boolean equals(Object obj) {
        Warehouse house = (Warehouse) obj;


        if (this.warehouseId == house.warehouseId &&
                this.warehouseName.equals(house.warehouseName) &&
                this.location.equals(house.location) &&
                this.managerName.equals(house.managerName) &&
                this.capacity.equals(house.capacity)) {
        return true;
    }
        return false;

    }
}
