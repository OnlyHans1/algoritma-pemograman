package TP6;

import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        System.out.print(" ");
        int nilai = a.nextInt();

        int hasil = 0;
        int i = 1;

        while (i <= nilai) {
            hasil += i;
            i++;
        }

        System.out.println(hasil);
    }
}
