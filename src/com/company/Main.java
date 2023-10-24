package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i++) {
           if(i==0 || i==n-1) System.out.print("*");
                if(i==1 || i==n-2) System.out.print("*");
                else System.out.print(" ");
                
        }

    }
}
