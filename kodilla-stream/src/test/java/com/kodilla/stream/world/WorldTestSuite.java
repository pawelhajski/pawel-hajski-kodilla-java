package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();
        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Continent africa = new Continent("Africa");
        Continent na = new Continent("North America");
        Country poland = new Country("Poland", new BigDecimal("39000000"));
        Country germany = new Country("Germany", new BigDecimal("83000000"));
        Country japan = new Country("Japan", new BigDecimal("127000000"));
        Country china = new Country("China", new BigDecimal("1386000000"));
        Country egypt = new Country("Egypt", new BigDecimal("98000000"));
        Country congo = new Country("Congo", new BigDecimal("5000000"));
        Country usa = new Country("USA", new BigDecimal("327000000"));
        Country canada = new Country("Canada", new BigDecimal("37000000"));

        //When
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);
        world.addContinent(na);
        europe.addCountry(poland);
        europe.addCountry(germany);
        asia.addCountry(japan);
        asia.addCountry(china);
        africa.addCountry(egypt);
        africa.addCountry(congo);
        na.addCountry(usa);
        na.addCountry(canada);

        //Then
        BigDecimal expected = new BigDecimal("2102000000");
        Assert.assertEquals(expected, world.getPeopleQuantity());
    }
}
