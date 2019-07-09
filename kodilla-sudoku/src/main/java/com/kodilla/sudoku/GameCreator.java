package com.kodilla.sudoku;

import java.util.Random;

public class GameCreator {
    private int ROWS = 9;
    private int COLUMNS = 9;
    private int EMPTY = 0;
    private Random randomValue = new Random();
    private SudokuBoard sudokuBoard;
    private SudokuSolver sudokuSolver;

    public GameCreator(SudokuBoard sudokuBoard, SudokuSolver sudokuSolver) {
        this.sudokuBoard = sudokuBoard;
        this.sudokuSolver = sudokuSolver;
    }

    private void generateNumbers(int elementsToGenerate) {
        int elementsInBoard = 0;
        while (elementsInBoard < elementsToGenerate) {
            Integer randomNumber = randomValue.nextInt(9) + 1;
            int row = randomValue.nextInt(ROWS);
            int column = randomValue.nextInt(COLUMNS);
            if(sudokuBoard.getSudokuRows().get(row).getSudokuElements().get(column).getValue().equals(EMPTY)) {
                if (sudokuSolver.checkIfNumberIsOk(sudokuBoard, row, column, randomNumber)) {
                    sudokuBoard.setElementValue(row, column, randomNumber);
                    elementsInBoard++;
                }
            }
        }
    }

    public void createNewGame(int elementsAtStart) {
        generateNumbers(15);
        sudokuSolver.solveSudoku(sudokuBoard);
        int elementsInBoard = 81;
        while(elementsInBoard > elementsAtStart) {
            int row = randomValue.nextInt(ROWS);
            int column = randomValue.nextInt(COLUMNS);
            if(!sudokuBoard.getSudokuRows().get(row).getSudokuElements().get(column).getValue().equals(EMPTY)) {
                sudokuBoard.setElementValue(row, column, EMPTY);
                elementsInBoard--;
            }
        }
    }
}
