package com.in28minutes.oops.level2.abstarctclass;

public class Recipe1 extends AbstractRecipe{

    @Override
    void getReady() {
        System.out.println("Get the row material");
        System.out.println("Get the utinsils");
    }

    @Override
    void doTheDish() {
        System.out.println("Do the Dish");
    }

    @Override
    void cleanup() {
        System.out.println("Cleanup the utinsils");
    }
}
