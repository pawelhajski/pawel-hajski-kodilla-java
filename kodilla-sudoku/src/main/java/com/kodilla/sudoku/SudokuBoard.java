package com.kodilla.sudoku;

import java.util.*;
import java.util.stream.IntStream;

public class SudokuBoard {
    private int ROWS = 9;
    private int COLUMNS = 9;
    private List<SudokuRow> sudokuRows = new ArrayList<>();
    private Random randomValue = new Random();

    public SudokuBoard(int numbersAtStart) {
        IntStream.range(0, ROWS).forEach(i -> sudokuRows.add(new SudokuRow()));
        generateNumbers3(numbersAtStart);
    }

    private void generateNumbers3(int numbersAtStart) {
        int elementsInBoard = 0;

        while (elementsInBoard < numbersAtStart) {
            Integer randomNumber = randomValue.nextInt(9) + 1;
            int row = randomValue.nextInt(9);
            int column = randomValue.nextInt(9);
            boolean rowPassed = true;
            boolean columnPassed = true;

            if(sudokuRows.get(row).getSudokuElements().get(column).getValue().equals(0)) {

                for (int i = 0; i < COLUMNS; i++) {
                    if (sudokuRows.get(row).getSudokuElements().get(i).getValue().equals(randomNumber)) {
                        rowPassed = false;
                        break;
                    }
                }

                for (int i = 0; i < ROWS; i++) {
                    if (sudokuRows.get(i).getSudokuElements().get(column).getValue().equals(randomNumber)) {
                        columnPassed = false;
                        break;
                    }
                }

                if (rowPassed && columnPassed) {
                    sudokuRows.get(row).getSudokuElements().get(column).setValue(randomNumber);
                    System.out.println("Wiersz: " + row + " Kolumna: " + column + " Wartość: " + sudokuRows.get(row).getSudokuElements().get(column).getValue());
                    elementsInBoard++;
                }
            }
        }
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
