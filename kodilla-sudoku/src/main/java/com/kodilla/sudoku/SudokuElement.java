package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SudokuElement {

    private int EMPTY = 0;
    private int SIZE = 9;
    private Integer value;
    private List<Integer> possibleValues = new ArrayList<>();

    public SudokuElement() {
        this.value = EMPTY;
        IntStream.range(0, SIZE).forEach(i -> possibleValues.add(i + 1));
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String printValue() {
        if(value == EMPTY) {
            return " ";
        } else {
            return value.toString();
        }
    }
}
