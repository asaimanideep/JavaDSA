package com.sai;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String fruit=input.next();

        switch (fruit) {
            case "Apple" -> System.out.println("It's Apple");
            case "Mango" -> System.out.println("It's a Mango");
            default -> System.out.println("Please enter a fruit");
        }
    }
}
