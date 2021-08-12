package com.sai;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();

        }
 // 1 st way to print using for loops
//        for (int i=0;i<arr.length;i++) {
//            System.out.print(arr[i]+" ");
//        }
 // 2nd way to print enahaced for loop
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
// 3 rd way to print
        System.out.print(Arrays.toString(arr));
    }
}
