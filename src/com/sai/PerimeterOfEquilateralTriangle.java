package com.sai;

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter side of triangle a: ");
        int a = input.nextInt();
        double Perimeter;
        Perimeter = 3 * a;
        System.out.println("Perimeter: " + Perimeter);
    }
}
