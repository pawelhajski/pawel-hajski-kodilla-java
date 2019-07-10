package com.kodilla.sudoku;

public class SudokuGame {

    public static void main(String[] args) {

        System.out.println("Welcome to Sudoku.");
        boolean gameRunning = true;
        while(gameRunning) {
            //Creating required objects.
            SudokuBoard sudokuBoard = new SudokuBoard();
            SudokuSolver sudokuSolver = new SudokuSolver();
            SudokuScanner sudokuScanner = new SudokuScanner();
            GameCreator gameCreator = new GameCreator(sudokuBoard, sudokuSolver);

            //Generate a new Sudoku grid. User will be asked to choose difficulty: easy, medium or hard.
            System.out.println("Choose difficulty by typing \"easy\", \"medium\" or \"hard\".");
            gameCreator.createNewGame();
            System.out.println("Your new Sudoku grid to solve.");
            System.out.println("Input values into board typing row number, column number and value as 3-digit number, i.e. row: 1, column: 2 and value: 3 should be typed as \"123\".");
            System.out.println("You can automatically solve Sudoku grid typing \"Sudoku\".");
            System.out.println("Good luck!" + "\n");
            System.out.println(sudokuBoard.toString());

            //Actual game. Game ends when there are 81 elements in grid (then boolean `sudokuSolved` turns `true`.
            boolean sudokuSolved = false;
            while(!sudokuSolved) {
                System.out.println("Elements in board: " + sudokuScanner.countElements(sudokuBoard));
                System.out.println("\n");
                sudokuScanner.move(sudokuBoard);
                if(sudokuScanner.countElements(sudokuBoard) == 81) {
                    System.out.println(sudokuBoard + "\n");
                    System.out.println("Sudoku solved! Congratulations!");
                    sudokuSolved = true;
                } else {
                    System.out.println("Choose next row, column and value." + "\n");
                    System.out.println(sudokuBoard);
                }
            }
            //If grid is solved, user will be asked if wants to start a new game (y/n).
            gameRunning = gameCreator.startAnotherGame();
        }
    }
}

//Do zrobienia: