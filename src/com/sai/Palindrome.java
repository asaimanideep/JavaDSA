package com.sai;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter a number");
//        int num=input.nextInt();
        for(int num=10;num<=200;num++) {
            if(checkpalindrome(num)){
                System.out.println(num);
            };
        }
    }
    static boolean checkpalindrome(int num){
        int original=num;
        int rev=0;
        int reminder;
        while(num>0) {
            reminder = num % 10;
            rev = (rev)*10 + reminder;
            num=num/10;
        }
        return rev==original;
//       if(original==rev){
//           System.out.println("It's a Palindrome");
//       }else{
//           System.out.println("It's not a Palindrome");
//       }
    }
}
