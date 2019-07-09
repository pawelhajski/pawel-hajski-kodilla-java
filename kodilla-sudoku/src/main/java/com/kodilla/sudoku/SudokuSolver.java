package com.kodilla.sudoku;

public class SudokuSolver {

    private int SIZE = 9;
    private int ROWS = 9;
    private int COLUMNS = 9;
    private int EMPTY = 0;


    public boolean solveSudoku(SudokuBoard sudokuBoard) {

        for(int row = 0; row < SIZE; row++) {
            for(int column = 0; column < SIZE; column++) {
                SudokuElement currentElement = sudokuBoard.getSudokuRows().get(row).getSudokuElements().get(column);
                if(currentElement.getValue().equals(0)) {
                    for(int number = 1; number <= SIZE; number++) {
                        if(checkIfNumberIsOk(sudokuBoard, row, column, number)) {
                            sudokuBoard.setElementValue(row, column, number);
                            if(solveSudoku(sudokuBoard)) {
                                return true;
                            } else {
                                sudokuBoard.setElementValue(row, column, EMPTY);
                            }
                        }
                    } return false;
                }
            }
        } return true;
    }

    private boolean checkRowIfDoubles(SudokuBoard sudokuBoard, int row, Integer randomNumber) {
        boolean rowPassed = true;
        for(int i = 0; i < ROWS; i++) {
            if(sudokuBoard.getSudokuRows().get(row).getSudokuElements().get(i).getValue().equals(randomNumber)) {
                rowPassed = false;
                break;
            }
        } return rowPassed;
    }

    private boolean checkColumnIfDoubles(SudokuBoard sudokuBoard, int column, Integer randomNumber) {
        boolean columnPassed = true;
        for (int i = 0; i < COLUMNS; i++) {
            if (sudokuBoard.getSudokuRows().get(i).getSudokuElements().get(column).getValue().equals(randomNumber)) {
                columnPassed = false;
                break;
            }
        } return columnPassed;
    }

    private boolean checkBoxIfDoubles(SudokuBoard sudokuBoard, int row, int column, Integer randomNumber) {
        int boxRowStart = row - row % 3;
        int boxColumnStart = column - column % 3;
        boolean boxPassed = true;
        for (int i = boxRowStart; i < boxRowStart + 3; i++) {
            for (int j = boxColumnStart; j < boxColumnStart + 3; j++) {
                if (sudokuBoard.getSudokuRows().get(i).getSudokuElements().get(j).getValue().equals(randomNumber)) {
                    boxPassed = false;
                    break;
                }
            }
        } return boxPassed;
    }

    boolean checkIfNumberIsOk(SudokuBoard sudokuBoard, int row, int column, Integer randomNumber) {
        if (checkRowIfDoubles(sudokuBoard, row, randomNumber) && checkColumnIfDoubles(sudokuBoard, column, randomNumber) && checkBoxIfDoubles(sudokuBoard, row, column, randomNumber)) {
            return true;
        } else {
            return false;
        }
    }
}