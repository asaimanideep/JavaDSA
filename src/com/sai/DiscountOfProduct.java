package com.sai;

import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Discount");
        float DiscountGiven=input.nextFloat();
        float DiscountPercentage=DiscountGiven/100;
        System.out.println("Enter Original Price");
        Double OriginalPrice=input.nextDouble();
        Double DiscountPrice=OriginalPrice*DiscountPercentage;
        Double FinalPrice=OriginalPrice-DiscountPrice;

        System.out.println("Your Final Product with Discount Price is: "+ FinalPrice);
    }
}
