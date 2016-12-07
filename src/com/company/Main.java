package com.company;

public class Main {

    public static final int SIZE_X = 150;
    public static final int SIZE_Y = 35;
    public static final char EMPTY = ' ';
    public static final char FULL = '@';

    public static char[][] pole = new char[SIZE_Y][SIZE_X];
    public static char[][] poleD = new char[SIZE_Y][SIZE_X];


    public static void makeLoop() {


    }

    public static void show() {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++)
                System.out.println(pole[i][j]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < SIZE_Y; i++)
            for (int j = 0; j < SIZE_X; j++)
                pole[i][j] = EMPTY;
    }
}



