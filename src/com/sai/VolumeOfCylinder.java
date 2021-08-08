package com.sai;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        System.out.println("Enter a radius: ");
        Scanner input=new Scanner(System.in);
        int r=input.nextInt();
        System.out.println("Enter a Height: ");
        int h=input.nextInt();
        System.out.println("Volume Of Cylinder:" + 3.14*r*r*h);
    }
}
