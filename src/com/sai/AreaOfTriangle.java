package com.sai;

import java.util.Scanner;

public class AreaOfTriangle {

        public static void main(String[] args) {
            System.out.println("Enter height: ");
            Scanner input = new Scanner(System.in);
            int height = input.nextInt();
            System.out.println("Enter Breadth: ");
            int breadth = input.nextInt();
            double t = (0.5) * (height * breadth);
            System.out.println(t);
        }
    }
