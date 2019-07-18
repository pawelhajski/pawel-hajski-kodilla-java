package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaWithAdditionalCheeseBaconMushroomsPepperoniJalapenoCost() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new AdditionalCheeseDecorator(order);
        order = new BaconDecorator(order);
        order = new MushroomsDecorator(order);
        order = new PepperoniDecorator(order);
        order = new JalapenoDecorator(order);

        //When
        BigDecimal cost = order.getCost();

        //Then
        assertEquals(new BigDecimal(28), cost);
    }

    @Test
    public void testBasicPizzaWithAdditionalCheeseBaconMushroomsPepperoniJalapenoDescription() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new AdditionalCheeseDecorator(order);
        order = new BaconDecorator(order);
        order = new MushroomsDecorator(order);
        order = new PepperoniDecorator(order);
        order = new JalapenoDecorator(order);

        //When
        String description = order.getDescription();

        //Then
        assertEquals("Pizza: dough + tomato sauce + cheese + additional cheese + bacon + mushrooms + pepperoni + jalapeno", description);
    }
}
