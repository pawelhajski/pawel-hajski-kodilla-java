package com.kodilla.sudoku;

public class SudokuGame {

    public static void main(String[] args) {
        SudokuBoard sudokuBoard = new SudokuBoard(15);
        System.out.println(sudokuBoard.toString());
    }
}
