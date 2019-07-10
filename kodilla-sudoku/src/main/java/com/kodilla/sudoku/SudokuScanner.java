package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuScanner {

    private int EMPTY = 0;

    private Scanner scanner = new Scanner(System.in);
    private SudokuSolver sudokuSolver = new SudokuSolver();

    void move(SudokuBoard sudokuBoard) {
        String userInput = scanner.nextLine();
        try {
            if(userInput.equals("Sudoku")) { //Checks if user input is
                if(!sudokuSolver.solveSudoku(sudokuBoard)) {//Resolve actual grid if possible or return message that grid is unsolvable.
                    System.out.println("Sudoku grid unsolvable :/");
                }
            } else {
                int row = Integer.parseInt(userInput.charAt(0) + "") - 1;
                int column = Integer.parseInt(userInput.charAt(1) + "") - 1;
                Integer value = Integer.parseInt(userInput.charAt(2) + "");
                if (validateInput(sudokuBoard, row, column, value)) {
                    sudokuBoard.setElementValue(row, column, value);
                    System.out.println("Value: " + value + " has been put into field: [row: " + (row + 1) + "" + "], [column: " + (column + 1) + "].");
                } else {
                    System.out.println("Incorrect input.");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Incorrect input. Type 3-digit number to place a new value or type \"Sudoku\" to automatically solve grid");
        }
    }

    private boolean validateInput(SudokuBoard sudokuBoard, int row, int column, Integer value) {
        if(row > -1 && row < 9) {
            if(column > -1 && column < 9) {
                if(value > -1 && value < 10) {
                    if (sudokuSolver.checkIfNumberIsOk(sudokuBoard, row, column, value)) {
                        return true;
                    } else {
                        System.out.println("This value cannot be put here.");
                        return false;
                    }
                } else {
                    System.out.println("Third digit (element value) must be between 0-9.");
                    return false;
                }
            } else {
                System.out.println("Second digit (column number) must be between 1-9.");
                return false;
            }
        } else {
            System.out.println("First digit (row number) must be between 1-9.");
            return false;
        }

    }

    public int countElements(SudokuBoard sudokuBoard) {
        int elements = 0;
        for(SudokuRow row : sudokuBoard.getSudokuRows()) {
            for(SudokuElement element : row.getSudokuElements()) {
                if(element.getValue() != EMPTY) {
                    elements++;
                }
            }
        } return elements;
    }

    public Scanner getScanner() {
        return scanner;
    }
}
