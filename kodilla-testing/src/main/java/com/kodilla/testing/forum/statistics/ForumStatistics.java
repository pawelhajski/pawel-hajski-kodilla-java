package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int users;
    private int posts;
    private int comments;
    private double avgComments;
    private double avgPosts;
    private double avgCommentsPerPost;

    Statistics statistics;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public double avgPostsPerUser() {
        if (users != 0) {
            return getPosts() / getUsers();
        } else {
            return 0;
        }
    }

    public double avgCommentsPerUser() {
        if (users != 0) {
            return getComments() / getUsers();
        } else {
            return 0;
        }
    }

    public double avgCommentsPerPost() {
        if (posts != 0) {
            return (double) getComments() / (double) getPosts();
        } else {
            return 0;
        }
    }

    public void calculateAdvStatistics(Statistics statistics) {
        this.users = statistics.usersNames().size();
        this.posts = statistics.postsCount();
        this.comments = statistics.commentsCount();
        this.avgComments = avgCommentsPerUser();
        this.avgPosts = avgPostsPerUser();
        this.avgCommentsPerPost = avgCommentsPerPost();
    }

    public String showStatistics(Statistics statistics) {
        return "Number of users: " + this.users +
                "\n Number of posts: " + this.posts +
                "\n Number of comments: " + this.comments +
                "\n Average posts per user: " + this.avgPosts +
                "\n Average comments per user: " + this.avgComments +
                "\n Average comments per post: " + this.avgCommentsPerPost;
    }

    public int getUsers() {
        return users;
    }

    public int getPosts() {
        return posts;
    }

    public int getComments() {
        return comments;
    }

    public double getAvgComments() {
        return avgComments;
    }

    public double getAvgPosts() {
        return avgPosts;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }
} // teraz utwórz TestSuite
