package com.sai;

import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter side a: ");
        int a=input.nextInt();
        int Perimeter=4*a;
        System.out.println("Perimeter: " +Perimeter);

    }
}
