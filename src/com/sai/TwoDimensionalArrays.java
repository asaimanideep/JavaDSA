package com.sai;

import java.util.Scanner;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr2d = new int[3][3];
        for (int row = 0; row < arr2d.length; row++) {
            for (int col = 0; col < arr2d[row].length; col++) {
                arr2d[row][col] = input.nextInt();
            }
        }

        for (int row = 0; row < arr2d.length; row++) {
            for (int col = 0; col < arr2d[row].length; col++) {
                System.out.print(arr2d[row][col] + " ");
            }
            System.out.println();
        }
    }
}
