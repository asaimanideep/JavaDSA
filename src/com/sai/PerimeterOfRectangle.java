package com.sai;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        System.out.println("Enter length: ");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        System.out.println("Enter width: ");
        int width = input.nextInt();
        long l = 2*(length+width);
        System.out.println(l);
    }
}
