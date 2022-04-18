package com.company;

import java.util.Scanner;

public class Main {

    static int Factorial(int n){
        int fact =1;
        for(int i=1; i<=n;i++){
            fact=fact*i;
        }
        return (fact);
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the No For Factorial:");
        int Num= sc.nextInt();
        System.out.print("Factorial of "+Num+ " is: "+Factorial(Num));

    }
}
