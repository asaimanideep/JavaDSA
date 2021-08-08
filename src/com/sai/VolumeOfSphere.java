package com.sai;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter radius:");
        int radius=input.nextInt();
        double Volume=(4/3f) *(3.14*(radius*radius*radius));
        System.out.println("Volume of sphere: "+Volume);
    }
}
