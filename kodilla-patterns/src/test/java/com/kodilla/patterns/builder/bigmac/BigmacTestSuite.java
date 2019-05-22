package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(new Bun("WITH SESAME"))
                .burgers(2)
                .ingredient(new Ingredient("BACON"))
                .ingredient(new Ingredient(Ingredient.CHEESE))
                .ingredient(new Ingredient(Ingredient.PICKLES))
                .sauce(new Sauce(Sauce.BBQ))
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals("WITH SESAME", bigmac.getBun().getType());
        Assert.assertEquals("BBQ", bigmac.getSauce().getType());
        Assert.assertEquals(2, bigmac.getBurgers());
        Assert.assertEquals(3, howManyIngredients);
    }
}
