package com.sai;

import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Side a: ");
        int a=input.nextInt();
        System.out.println("Enter Base: ");
        int b=input.nextInt();
        int Parallelogram=2*(a+b);
        System.out.println("Parallelogram of Parallelogram : " + Parallelogram);

    }

}
