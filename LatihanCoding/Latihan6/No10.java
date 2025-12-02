package Latihan6;

import java.util.Scanner;

public class No10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double A = 0.0;
        double B = 0.0;
        
        for (int i = 1; i <= n; i++) {
            double yin = input.nextDouble();
            double yang = input.nextDouble();
            
            if (yin < yang) {
                B += 0.15;
            } else if (yin > yang) {
                A += 0.25;
            }
            
            if (i % 3 == 0) {
                A *= 0.95;
            }
        }
        
        A = Math.round(A * 10000.0) / 10000.0;
        B = Math.round(B * 10000.0) / 10000.0;
        
        if (A == (long) A) {
            System.out.print((long) A);
        } else {
            System.out.print(A);
        }
        
        System.out.print(" ");
        
        if (B == (long) B && B == 0) {
            System.out.print("0.0");
        } else if (B == (long) B) {
            System.out.print((long) B);
        } else {
            System.out.print(B);
        }
        
        System.out.println();
    }
}