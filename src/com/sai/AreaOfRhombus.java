package com.sai;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Diagonal P");
        int p=input.nextInt();
        System.out.println("Enter Diagonal Q");
        int q=input.nextInt();
        float Area;
        Area = (float) ((p*q)/2.0);
        System.out.println("Area of Rhombus: " +Area);
    }
}
