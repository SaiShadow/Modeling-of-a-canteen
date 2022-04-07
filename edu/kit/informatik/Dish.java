package edu.kit.informatik;

/**
 * Represents the dishes served in the food counters.
 *
 * @author uogok
 * @version 3.0
 */

public class Dish {

    private String name;
    private double price;
    
    public enum DishType {
        VEGAN, 
        VEGETARIAN;
        enum NONVEG {
            PORK,
            BEEF
        }
    }
}
