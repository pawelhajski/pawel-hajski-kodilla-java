package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter adapter = new MedianAdapter();
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("A1", "T1", 1990, "1-1-90"));
        bookSet.add(new Book("A2", "T2", 1991, "2-2-91"));
        bookSet.add(new Book("A3", "T3", 1992, "3-3-92"));
        bookSet.add(new Book("A4", "T4", 1993, "4-4-93"));
        bookSet.add(new Book("A5", "T5", 1994, "5-5-94"));

        //When
        int yearMedian = adapter.publicationYearMedian(bookSet);

        //Then
        bookSet.stream().map(b -> b.getPublicationYear()).forEach(System.out::println);
        System.out.println("Median: " + yearMedian);
        assertEquals(1992, yearMedian);
    }
}
