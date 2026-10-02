package com.book.bookservice.restaurant;

public class Restaurant {


    public int restaurantId;
    public String restaurantName;
    public String location;
    public String cuisine;
    public String rating;

    @Override
    public boolean equals(Object obj){
        Restaurant restaurant=(Restaurant) obj;

        if(this.restaurantId==restaurant.restaurantId &&
        this.restaurantName.equals(restaurant.restaurantName) &&
        this.location.equals(restaurant.location) &&
        this.cuisine.equals(restaurant.cuisine) &&
        this.rating.equals(restaurant.rating)){
            return true;
        }
        return false;
    }
}
