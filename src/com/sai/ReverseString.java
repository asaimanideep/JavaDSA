package com.sai;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name=input.nextLine();

        reverse(name);
    }

    static void reverse(String name) {
        int len=name.length();
        String rev="";
        for(int i=len-1;i>=0;i--){
            rev=rev+name.charAt(i);

        }
        if(name.equals(rev)){
            System.out.println(name+ " It's a palindrome too");
        }
        System.out.println(rev);
    }
}
