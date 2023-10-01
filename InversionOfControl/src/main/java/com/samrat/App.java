package com.samrat;

import com.samrat.vo.Animal;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Animal obj = (Animal) context.getBean("lion", Animal.class);
        obj.sayHello();
        System.out.println("Fav Meal: " + obj.myFavoriteMeal());
        context.close();


    }
}
