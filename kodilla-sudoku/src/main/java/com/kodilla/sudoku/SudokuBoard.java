package com.kodilla.sudoku;

import java.util.*;
import java.util.stream.IntStream;

public class SudokuBoard {
    private int ROWS = 9;
    private int EMPTY = 0;
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




                /*for (int i = 0; i < COLUMNS; i++) {
                    if (sudokuRows.get(row).getSudokuElements().get(i).getValue().equals(randomNumber)) {
                        rowPassed = false;
                        break;
                    }
                }*/

                /*for (int i = 0; i < ROWS; i++) {
                    if (sudokuRows.get(i).getSudokuElements().get(column).getValue().equals(randomNumber)) {
                        columnPassed = false;
                        break;
                    }
                }*/

                /*for (int i = squareRowStart; i < squareRowStart + 3; i++) {
                    for (int j = squareColumnStart; j < squareColumnStart + 3; j++) {
                        if (sudokuRows.get(i).getSudokuElements().get(j).getValue().equals(randomNumber)) {
                            squarePassed = false;
                            break;
                        }
                    }
                }*/

                /*if (rowPassed && columnPassed && squarePassed) {
                    sudokuRows.get(row).getSudokuElements().get(column).setValue(randomNumber);
                    elementsInBoard++;
                    //System.out.println("Wiersz: " + row + " Kolumna: " + column + " Wartość: " + sudokuRows.get(row).getSudokuElements().get(column).getValue());
                }*/

                /*if (rowPassed && columnPassed && squarePassed) {
                    setElementValue(row, column, randomNumber);
                    elementsInBoard++;
                }*/

                /*private void generateNumbers(int elementsToGenerate) {
        int elementsInBoard = 0;
        while (elementsInBoard < elementsToGenerate) {
            Integer randomNumber = randomValue.nextInt(9) + 1;
            int row = randomValue.nextInt(ROWS);
            int column = randomValue.nextInt(COLUMNS);
            if(sudokuRows.get(row).getSudokuElements().get(column).getValue().equals(EMPTY)) {
                if (checkIfNumberIsOk(row, column, randomNumber)) {
                    setElementValue(row, column, randomNumber);
                    elementsInBoard++;
                }
            }
        }
    }*/

    /*private boolean checkRowIfDoubles(int row, Integer randomNumber) {
        boolean rowPassed = true;
        for(int i = 0; i < ROWS; i++) {
            if(sudokuRows.get(row).getSudokuElements().get(i).getValue().equals(randomNumber)) {
                rowPassed = false;
                break;
            }
        } return rowPassed;
    }

    private boolean checkColumnIfDoubles(int column, Integer randomNumber) {
        boolean columnPassed = true;
        for (int i = 0; i < COLUMNS; i++) {
            if (sudokuRows.get(i).getSudokuElements().get(column).getValue().equals(randomNumber)) {
                columnPassed = false;
                break;
            }
        } return columnPassed;
    }

    private boolean checkBoxIfDoubles(int row, int column, Integer randomNumber) {
        int boxRowStart = row - row % 3;
        int boxColumnStart = column - column % 3;
        boolean boxPassed = true;
        for (int i = boxRowStart; i < boxRowStart + 3; i++) {
            for (int j = boxColumnStart; j < boxColumnStart + 3; j++) {
                if (sudokuRows.get(i).getSudokuElements().get(j).getValue().equals(randomNumber)) {
                    boxPassed = false;
                    break;
                }
            }
        } return boxPassed;
    }

    boolean checkIfNumberIsOk(int row, int column, Integer randomNumber) {
        if (checkRowIfDoubles(row, randomNumber) && checkColumnIfDoubles(column, randomNumber) && checkBoxIfDoubles(row, column, randomNumber)) {
            return true;
        } else {
            return false;
        }
    }*/