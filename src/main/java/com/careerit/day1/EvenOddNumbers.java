package com.careerit.day1;

import java.util.Scanner;

public class EvenOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("Given number is even");
        }else{
            System.out.println("Given number is odd");
        }
    }
}
