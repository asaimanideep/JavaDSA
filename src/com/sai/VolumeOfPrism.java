package com.sai;

import java.util.Scanner;

public class VolumeOfPrism {
        public static void main(String[] args) {
            //Need to find out the Rectangle area, because Base of prsim is Rectangle
            System.out.println("Enter length: ");
            Scanner input = new Scanner(System.in);
            int length = input.nextInt();
            System.out.println("Enter width: ");
            int width = input.nextInt();
            long Base = length*width;
            System.out.println("Base: "+Base);
            System.out.println("Enter height: ");
            int Height = input.nextInt();
            long prismvolume= Base*Height;
            System.out.println("Prism Volume: "+ prismvolume);

        }
    }

