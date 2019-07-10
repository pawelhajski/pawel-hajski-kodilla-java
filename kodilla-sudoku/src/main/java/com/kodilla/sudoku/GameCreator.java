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
        while(elementsInBoard < elementsToGenerate) {
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

    public void createNewGame() {
        generateNumbers(15);
        sudokuSolver.solveSudoku(sudokuBoard);
        int elementsInBoard = 81;
        int elementsAtStart = chooseDifficulty();
        while(elementsInBoard > elementsAtStart) {
            int row = randomValue.nextInt(ROWS);
            int column = randomValue.nextInt(COLUMNS);
            if(!sudokuBoard.getSudokuRows().get(row).getSudokuElements().get(column).getValue().equals(EMPTY)) {
                sudokuBoard.setElementValue(row, column, EMPTY);
                elementsInBoard--;
            }
        }
    }

    private int chooseDifficulty() {
        SudokuScanner sudokuScanner = new SudokuScanner();
        boolean difficultyChosen = false;
        int elementsAtStart = 0;
        while(!difficultyChosen) {
            String difficulty = sudokuScanner.getScanner().nextLine();
            if (difficulty.equals("easy")) {
                elementsAtStart = 35;
            } else if (difficulty.equals("medium")) {
                elementsAtStart = 30;
            } else if (difficulty.equals("hard")) {
                elementsAtStart = 25;
            } else {
                System.out.println("Incorrect input. Choose difficulty by typing \"easy\", \"medium\" or \"hard\".");
            } return  elementsAtStart;
        } return elementsAtStart;
    }

    public boolean startAnotherGame() {
        System.out.println("Do you wish to start a new game (y/n)?");
        SudokuScanner sudokuScanner = new SudokuScanner();
        String answer = sudokuScanner.getScanner().next();
        if(answer.equals("n")) {
            System.out.println("Thank you for playing!");
            return false;
        } else {
            return true;
        }
    }
}
