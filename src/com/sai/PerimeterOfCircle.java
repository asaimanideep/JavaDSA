package com.sai;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        System.out.println("Enter a radius: ");
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        System.out.println("Perimeter of Circle:" + 2 * 3.14 * r);
    }
}
