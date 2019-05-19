package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User born1980 = new Millenials("Adam");
        User born1990 = new YGeneration("Eva");
        User born2000 = new ZGeneration("Jessica");

        //When
        String adamSharePost = born1980.sharePost();
        String evaSharePost = born1990.sharePost();
        String jessicaSharePost = born2000.sharePost();

        System.out.println("Adam's new post: [...] (" + adamSharePost + ")");
        System.out.println("Eva's new post: [...] (" + evaSharePost + ")");
        System.out.println("Jessica's new post: [...] (" + adamSharePost + ")");

        //Then
        Assert.assertEquals("Sharing on Facebook", adamSharePost);
        Assert.assertEquals("Sharing on Twitter", evaSharePost);
        Assert.assertEquals("Sharing on Snapchat", jessicaSharePost);
    }

    @Test
    public void testIndividualSharingStrategies() {
        //Given
        User born1980 = new Millenials("Adam");
        System.out.println("Adam's new Facebook post: [...] (" + born1980.sharePost() + ")");

        //When
        born1980.setSocialPublisher(new SnapchatPublisher());
        System.out.println("Adam's newest Snapchat post: [...] (" + born1980.sharePost() + ")");

        //Then
        Assert.assertEquals("Sharing on Snapchat", born1980.sharePost());
    }
}
