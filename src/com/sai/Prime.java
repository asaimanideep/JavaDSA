package com.sai;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("Enter a Number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int status=0;
            for (int i = 2; i <= num-1; i++)
            {
                if ((num % i) == 0) {
                    //System.out.println("It's not a prime");
                    status=1;
                    break;
                }
                if(status==0){
                    System.out.println("It is a prime");
                    }
                else{
                    System.out.println("It is not a prime");
                }

            }
    }
   }
