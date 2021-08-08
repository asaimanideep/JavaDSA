package com.sai;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        System.out.println("Enter a Number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean prime=true;
        for(int i=2;i<num;i++){
            if(num%i==0){
                prime=false;
                //System.out.println("It's not a prime");
                break;
            }
        }
        System.out.println(prime);
    }
}
