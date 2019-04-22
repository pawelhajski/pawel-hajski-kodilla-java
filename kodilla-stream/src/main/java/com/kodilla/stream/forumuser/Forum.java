package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum() {
        usersList.add(new ForumUser(001, "adamsmith", 'M', LocalDate.of(1991, 01, 20), 10));
        usersList.add(new ForumUser(002, "brianadams", 'M', LocalDate.of(2000, 02, 19), 0));
        usersList.add(new ForumUser(003, "jenniferaniston", 'F', LocalDate.of(1984, 03, 05), 1));
        usersList.add(new ForumUser(004, "chloekowalski", 'F', LocalDate.of(2003, 04, 10), 5));
        usersList.add(new ForumUser(005, "denisjameson", 'M', LocalDate.of(1999, 04, 21), 2));
        usersList.add(new ForumUser(006, "katenovitzki", 'F', LocalDate.of(1994, 05, 21), 15));
    }

    public List<ForumUser> getUsersList() {
        return new ArrayList<>(usersList);
    }
}
