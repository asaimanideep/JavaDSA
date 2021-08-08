package com.sai;

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter height: ");
        float height =input.nextInt();
        System.out.println("Enter radius:");
        float radius=input.nextInt();

//      //  System.out.println(3.14*radius*radius);
//        System.out.println(height/3);
//
        double Volume=(3.14*radius*radius)*(height/3);
        System.out.println("Volume: "+Volume);
    }
}
