package com.samrat.vo;

import com.samrat.service.FavouriteMeal;

public class Tiger implements Animal {
    FavouriteMeal favouriteMeal;

    public Tiger(FavouriteMeal favouriteMeal) {
        this.favouriteMeal = favouriteMeal;
    }

    @Override
    public void sayHello() {
        System.out.println("Tiger is eating");
    }

    @Override
    public String myFavoriteMeal() {
        return this.favouriteMeal.getFavouriteMeal();
    }
}
