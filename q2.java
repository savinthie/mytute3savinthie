package com.company;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner read = new Scanner(System.in);
        System.out.print("first number : ");
        num1 = read.nextInt();
        System.out.print("second number : ");
        num2 = read.nextInt();
        if (num1 <= num2) {
            int i = num1 - 1;
            int j = num2 - 1;
            while (i <= j) {
                System.out.println(i);
                i++;
            }


        } else {
            System.out.println("first number is greater than the second one...Try again!");
        }
    }}
