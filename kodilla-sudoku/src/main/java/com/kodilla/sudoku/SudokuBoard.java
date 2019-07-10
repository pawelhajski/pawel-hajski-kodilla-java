package com.kodilla.sudoku;

import java.util.*;
import java.util.stream.IntStream;

public class SudokuBoard {
    private int ROWS = 9;
    private List<SudokuRow> sudokuRows = new ArrayList<>();

    public SudokuBoard() {
        IntStream.range(0, ROWS).forEach(i -> sudokuRows.add(new SudokuRow()));
    }

    void setElementValue(int row, int column, Integer value) {
        sudokuRows.get(row).getSudokuElements().get(column).setValue(value);
    }

    List<SudokuRow> getSudokuRows() {
        return sudokuRows;
    }

    @Override
    public String toString() {
        return  "      1   2   3    4   5   6    7   8   9   " + "\n" +
                "   -----------------------------------------" + "\n" +
                " 1 " + sudokuRows.get(0).toString() + "\n" +
                "   -----------------------------------------" + "\n" +
                " 2 " + sudokuRows.get(1).toString() + "\n" +
                "   -----------------------------------------" + "\n" +
                " 3 " + sudokuRows.get(2).toString() + "\n" +
                "   -----------------------------------------" + "\n" +
                "   -----------------------------------------" + "\n" +
                " 4 " + sudokuRows.get(3).toString() + "\n" +
                "   -----------------------------------------" + "\n" +
                " 5 " + sudokuRows.get(4).toString() + "\n" +
                "   -----------------------------------------" + "\n" +
                " 6 " + sudokuRows.get(5).toString() + "\n" +
                "   -----------------------------------------" + "\n" +
                "   -----------------------------------------" + "\n" +
                " 7 " + sudokuRows.get(6).toString() + "\n" +
                "   -----------------------------------------" + "\n" +
                " 8 " + sudokuRows.get(7).toString() + "\n" +
                "   -----------------------------------------" + "\n" +
                " 9 " + sudokuRows.get(8).toString() + "\n" +
                "   -----------------------------------------";
    }
}