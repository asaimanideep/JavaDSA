package com.sai;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Height: ");
        int b=input.nextInt();
        System.out.println("Enter Breadth: ");
        int h=input.nextInt();
        int Area=b*h;
        System.out.println("Area of Parallelogram : " + Area);

    }
}
