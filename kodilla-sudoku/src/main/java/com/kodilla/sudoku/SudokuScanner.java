package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuScanner {

    private Scanner scanner = new Scanner(System.in);
    private SudokuSolver sudokuSolver = new SudokuSolver();

    void move(SudokuBoard sudokuBoard, int elementsInBoard) {
        String userInput = scanner.nextLine();
        int row = Integer.parseInt(userInput.charAt(0)+"") - 1;
        int column = Integer.parseInt(userInput.charAt(1)+"") - 1;
        Integer value = Integer.parseInt(userInput.charAt(2)+"");
        if(validateInput(sudokuBoard, row, column, value)) {
            sudokuBoard.setElementValue(row, column, value);
            counter(elementsInBoard, value);
        } else {
            System.out.println("Incorrect input.");
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

    public void counter(int elementsInBoard, int value) {
        if(value != 0) {
            elementsInBoard++;
        } else {
            elementsInBoard--;
        }
    }

    public Scanner getScanner() {
        return scanner;
    }
}
