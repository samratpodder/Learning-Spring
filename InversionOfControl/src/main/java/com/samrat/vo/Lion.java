package com.samrat.vo;

import com.samrat.service.FavouriteMeal;

public class Lion implements Animal {

    FavouriteMeal favouriteMeal;

    //    public Lion(FavouriteMeal favouriteMeal) {
//        this.favouriteMeal = favouriteMeal;
//    }
    public Lion() {
    }

    public void setFavouriteMeal(FavouriteMeal favouriteMeal) {
        this.favouriteMeal = favouriteMeal;
    }

    @Override
    public void sayHello() {
        System.out.println("Roar");
    }

    @Override
    public String myFavoriteMeal() {
        return favouriteMeal.getFavouriteMeal();
    }
}
