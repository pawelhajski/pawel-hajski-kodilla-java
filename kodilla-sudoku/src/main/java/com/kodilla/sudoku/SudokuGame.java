package com.kodilla.sudoku;

public class SudokuGame {

    public static void main(String[] args) {
        //Creating required objects.
        SudokuBoard sudokuBoard = new SudokuBoard();
        SudokuSolver sudokuSolver = new SudokuSolver();
        SudokuScanner sudokuScanner = new SudokuScanner();
        GameCreator gameCreator = new GameCreator(sudokuBoard, sudokuSolver);

        //Generate a new Sudoku grid with <elementsAtStart> values set at start.
        System.out.println("Welcome to Sudoku. Choose difficulty by typing number of values at start by typing number between 0-80");
        int elementsAtStart = 78;
        gameCreator.createNewGame(elementsAtStart);
        System.out.println("Your new Sudoku grid to solve.");
        System.out.println("Input values into board typing row number, column number and value as 3-digit number, i.e. row: 1, column: 2 and value: 3 should be typed as \"234\".");
        System.out.println("You can automatically solve Sudoku grid typing \"Sudoku\".");
        System.out.println("Good luck!");
        System.out.println(sudokuBoard.toString() + "\n");

        //Actual game
        boolean sudokuSolved = false;
        int elementsInBoard = elementsAtStart;
        while(!sudokuSolved) {
            System.out.println("Elements in board: " + elementsInBoard);
            sudokuScanner.move(sudokuBoard, elementsInBoard);
            if (elementsInBoard == 81) {
                System.out.println("Sudoku solved! Congratulations!");
                System.out.println(sudokuBoard + "\n");
                sudokuSolved = true;
            } else {
                System.out.println("Choose next row, column and value.");
                System.out.println(sudokuBoard + "\n");
            }
        }

        //Resolve actual grid if possible or return message that grid is unsolvable.
        /*if(sudokuSolver.solveSudoku(sudokuBoard)) {
            System.out.println("Sudoku solved!");
            System.out.println(sudokuBoard.toString());
        } else {
            System.out.println("Sudoku grid unsolvable :/");
        }*/
    }
}

//Do zrobienia:
// - możliwość wyboru początkowej liczby elementów
// - ciągłe sprawdzanie wypełnienia całej planszy (while) poprzez zliczanie
