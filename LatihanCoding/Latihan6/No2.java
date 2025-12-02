package Latihan6;

import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int n = x.nextInt();

        int ganjilA = 0;
        int ganjilB = 0;
        int ganjilC = 0;

        for (int i = 0; i < n; i++) {
            int a = x.nextInt();
            int b = x.nextInt();
            int c = x.nextInt();

            ganjilA += a;
            ganjilB += b;
            ganjilC += c;
        }

        char pemenang;
        int total;

        if (ganjilA >= ganjilB && ganjilA >= ganjilC) {
            pemenang = 'A';
            total = ganjilA;
        } else if (ganjilB >= ganjilA && ganjilB >= ganjilC) {
            pemenang = 'B';
            total = ganjilB;
        } else {
            pemenang = 'C';
            total = ganjilC;
        }

        System.out.println(pemenang + " " + total);
    }
}
