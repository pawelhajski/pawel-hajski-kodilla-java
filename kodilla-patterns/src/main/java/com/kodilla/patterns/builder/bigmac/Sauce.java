package com.kodilla.patterns.builder.bigmac;

public class Sauce {

    public static final String STANDARD = "STANDARD";
    public static final String TOUSANDISLAND = "TOUSAND ISLAND";
    public static final String BBQ = "BBQ";
    private String type;

    public Sauce(String type) {
        if(type.equals(STANDARD) || type.equals(TOUSANDISLAND) || type.equals(BBQ)) {
            this.type = type;
        } else {
            throw new IllegalStateException("Sauce should be STANDARD, TOUSAND ISLAND or BBQ!");
        }
    }

    public String getType() {
        return type;
    }
}
