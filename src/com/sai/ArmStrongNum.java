package com.sai;

import java.util.Scanner;

public class ArmStrongNum {
    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter a num");
//        int num=input.nextInt();

//        boolean output=ArmStrong(num);
//        System.out.println(output);

        for(int i=100;i<1000;i++){
            if(ArmStrong(i)){
                System.out.println(i);
            }
        }
    }
        static boolean ArmStrong(int num){
        int original=num;
        int sum = 0;
        while(num>0) {

            int rem = num % 10;

            sum = sum + rem * rem * rem;
            num = num / 10;
        }
            return original == sum;
        }
}
