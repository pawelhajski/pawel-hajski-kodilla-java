package com.kodilla.patterns.builder.bigmac;

public class Ingredient {

    public static final String LETTUCE = "LETTUCE";
    public static final String ONION = "ONION";
    public static final String BACON = "BACON";
    public static final String PICKLES = "PICKLES";
    public static final String CHILLI = "CHILLI";
    public static final String CHAMPIGNON = "CHAMPIGNON";
    public static final String PRAWNS = "PRAWNS";
    public static final String CHEESE = "CHEESE";
    private String type;

    public Ingredient(String type) {
        if(type.equals(LETTUCE) || type.equals(ONION) || type.equals(BACON) || type.equals(PICKLES) || type.equals(CHILLI)
            || type.equals(CHAMPIGNON) || type.equals(PRAWNS) || type.equals(CHEESE)) {
            this.type = type;
        } else {
            throw new IllegalStateException("Incorrect ingredient. Available ingredients: LETTUCE, ONION, BACON, PICKLE, CHILLI, CHAMPIGNON, PRAWNS, CHEESE.");
        }
    }

    public String getType() {
        return type;
    }
}
