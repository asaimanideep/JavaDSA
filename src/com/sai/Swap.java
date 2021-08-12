package com.sai;

import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter size: ");
        int size=input.nextInt();
        int[] num=new int[size];
        for (int i = 0; i <size; i++) {
            num[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(num));
        int index1=input.nextInt();
        int index2=input.nextInt();
        swapfun(num,index1,index2);

        System.out.println(Arrays.toString(num));
        System.out.println(sumofArray(num));

    }
    static void swapfun(int[] num,int index1,int index2){
        int temp=num[index1];
        num[index1]=num[index2];
        num[index2]=temp;

    }

    static int sumofArray(int[] num){
        int sum=0;
        for (int i = 0; i < num.length; i++) {
            sum+=num[i];
        }
        return sum;
    }
}
