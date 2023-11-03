package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int cellSize = 7;

        Scanner scanner = new Scanner(System.in);
        int row;
        do {
            System.out.println("Podaj liczbę wierszy:");
            row = scanner.nextInt();
        } while (checkNumber(row));

        int column;
        do {
            System.out.println("Podaj liczbę kolumn:");
            column = scanner.nextInt();
        } while (checkNumber(column));

        int[][] tab = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int n = 0; n < column; n++) {
                tab[i][n] = i * n;
                System.out.printf("%5s |", tab[i][n]);
            }
            System.out.printf("%n");
            printLine(column, cellSize);
            System.out.printf("%n");
        }
    }

    private static void printLine(int column, int cellSize) {
        int j = 0;
        do {
            System.out.print("_");
            j++;
        } while (j != column * cellSize);
    }

    private static boolean checkNumber(int row) {
        if (row > 100) {
            System.out.println("Podaj liczbę mniejszą od 100");
            return true;
        } else {
            return false;
        }
    }
}