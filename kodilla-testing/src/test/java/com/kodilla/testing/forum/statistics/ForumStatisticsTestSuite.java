package com.kodilla.testing.forum.statistics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    @Test
    public void testCalculateAdvStatisticsWhenEmpty() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, forumStatistics.getUsers());
        assertEquals(0, forumStatistics.getPosts());
        assertEquals(0, forumStatistics.getComments());
        assertEquals(0.0, forumStatistics.getAvgPosts(), 0.00001);
        assertEquals(0.0, forumStatistics.getAvgComments(), 0.00001);
        assertEquals(0.0, forumStatistics.getAvgCommentsPerPost(), 0.00001);
    }

    @Test
    public void testCalculateAdvStatisticsWhenUsers100() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersNames = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("");
        }

        when(statisticsMock.usersNames()).thenReturn(usersNames);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100, forumStatistics.getUsers());
        assertEquals(0, forumStatistics.getPosts());
        assertEquals(0, forumStatistics.getComments());
        assertEquals(0.0, forumStatistics.getAvgPosts(), 0.00001);
        assertEquals(0.0, forumStatistics.getAvgComments(), 0.00001);
        assertEquals(0.0, forumStatistics.getAvgCommentsPerPost(), 0.00001);
    }

    @Test
    public void testCalculateAdvStatisticsWhenUsers100Posts1000() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersNames = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("");
        }

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(1000);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100, forumStatistics.getUsers());
        assertEquals(1000, forumStatistics.getPosts());
        assertEquals(0, forumStatistics.getComments());
        assertEquals(10.0, forumStatistics.getAvgPosts(), 0.00001);
        assertEquals(0.0, forumStatistics.getAvgComments(), 0.00001);
        assertEquals(0.0, forumStatistics.getAvgCommentsPerPost(), 0.00001);
    }

    @Test
    public void testCalculateAdvStatisticsWhenUsers100AndMorePosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersNames = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("");
        }

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(700);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100, forumStatistics.getUsers());
        assertEquals(1000, forumStatistics.getPosts());
        assertEquals(700, forumStatistics.getComments());
        assertEquals(10.0, forumStatistics.getAvgPosts(), 0.00001);
        assertEquals(7.0, forumStatistics.getAvgComments(), 0.00001);
        assertEquals(700./1000.0, forumStatistics.getAvgCommentsPerPost(), 0.00001);
    }

    @Test
    public void testCalculateAdvStatisticsWhenUsers100AndMoreComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersNames = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("");
        }

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1700);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100, forumStatistics.getUsers());
        assertEquals(1000, forumStatistics.getPosts());
        assertEquals(1700, forumStatistics.getComments());
        assertEquals(10.0, forumStatistics.getAvgPosts(), 0.00001);
        assertEquals(1700.0/100.0, forumStatistics.getAvgComments(), 0.00001);
        assertEquals(1700.0/1000.0, forumStatistics.getAvgCommentsPerPost(), 0.00001);
    }

    @Test
    public void testCalculateAdvStatisticsWhenUsersEmpty() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1700);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, forumStatistics.getUsers());
        assertEquals(1000, forumStatistics.getPosts());
        assertEquals(1700, forumStatistics.getComments());
        assertEquals(0.0, forumStatistics.getAvgPosts(), 0.00001);
        assertEquals(0.0, forumStatistics.getAvgComments(), 0.00001);
        assertEquals(1700.0/1000.0, forumStatistics.getAvgCommentsPerPost(), 0.00001);
    }

    @Test
    public void testShowStatistics() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersNames = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("");
        }

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1700);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals("Number of users: 100" +
                "\n Number of posts: 1000" +
                "\n Number of comments: 1700" +
                "\n Average posts per user: 10.0" +
                "\n Average comments per user: 17.0" +
                "\n Average comments per post: " + 1700.0/1000.0, forumStatistics.showStatistics(statisticsMock));
    }
}