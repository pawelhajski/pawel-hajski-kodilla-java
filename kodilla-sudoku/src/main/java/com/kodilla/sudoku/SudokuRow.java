package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SudokuRow {
    public int ELEMENTS = 9;
    private List<SudokuElement> sudokuElements = new ArrayList<>();

    public SudokuRow() {
        IntStream.range(0, ELEMENTS).forEach(i -> sudokuElements.add(new SudokuElement()));
    }

    public List<SudokuElement> getSudokuElements() {
        return sudokuElements;
    }

    @Override
    public String toString() {
        return "|| " + sudokuElements.get(0).printValue() +
                " | " + sudokuElements.get(1).printValue() +
                " | " + sudokuElements.get(2).printValue() +
                " || " + sudokuElements.get(3).printValue() +
                " | " + sudokuElements.get(4).printValue() +
                " | " + sudokuElements.get(5).printValue() +
                " || " + sudokuElements.get(6).printValue() +
                " | " + sudokuElements.get(7).printValue() +
                " | " + sudokuElements.get(8).printValue() + " ||";
    }
}
