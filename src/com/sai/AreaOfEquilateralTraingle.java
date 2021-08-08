package com.sai;

import java.util.Scanner;

public class AreaOfEquilateralTraingle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter side of triangle a: ");
        int a=input.nextInt();
        double Area;
        Area= (Math.sqrt(3)/4)*a*a;
        System.out.println("Area: " +Area);
    }
}
