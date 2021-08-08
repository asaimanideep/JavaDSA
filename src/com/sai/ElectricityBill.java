package com.sai;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        float CostPerUnit=7.0f;
        System.out.println("Enter Watts used: ");
        Scanner input=new Scanner(System.in);
        Long watts=input.nextLong();
        //units conversion
        Long Units=watts/1000;

        long Bill= Units*24*30;

        System.out.println("Your monthly bill is: "+Bill);
    }
}
