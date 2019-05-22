package com.kodilla.patterns.builder.bigmac;

public class Bun {

    public static final String WITHSESAME = "WITH SESAME";
    public static final String WITHOUTSESAME = "wITHOUT SESAME";
    private String type;

    public Bun(String type) {
        if (type.equals(WITHSESAME) || type.equals(WITHOUTSESAME)) {
            this.type = type;
        } else {
            throw new IllegalStateException("Bun should be WITH SESAME or WITHOUT SESAME!");
        }
    }

    public String getType() {
        return type;
    }
}
