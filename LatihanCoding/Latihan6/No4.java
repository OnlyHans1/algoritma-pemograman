package Latihan6;

import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        int n = a.nextInt();
        int totalA = 0;
        int totalB = 0;

        for (int i = 0; i < n; i++){
            int a1 = a.nextInt();
            int a2 = a.nextInt();
            int a3 = a.nextInt();

            int b1 = a.nextInt();
            int b2 = a.nextInt();
            int b3 = a.nextInt();

            totalA += a1 + a2 + a3;
            totalB += b1 + b2 + b3;
        } 

        char pemenang = '0';
        if (totalA > totalB){
            pemenang = 'A';
        } else if (totalA < totalB){
            pemenang = 'B';
        }

        System.out.println(totalA + " " + totalB + " " + pemenang);
    }
}
