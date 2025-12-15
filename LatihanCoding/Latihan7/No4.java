package Latihan7;

/*
    Buatlah program dalam bahasa Java untuk menghitung jumlah pertemuan rahasia antara dua orang mata-mata dalam setahun. Mereka akan bertemu setiap hari kelipatan x atau kelipatan y, dengan x dan y adalah bilangan bulat positif. Jumlah hari dalam setahun diasumsikan 365, sehingga hari bernilai dari 1 hingga 365. 
    Masukan berupa bilangan bulat positif x dan y.
    Keluaran berupa jumlah pertemuan dalam setahun.
*/

import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int hari = 365;

        int a = x;
        int b = y;
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }

        int kpk = (x * y) / a;
        int jumlah = (hari / x) + (hari / y) - (hari / kpk);

        System.out.println(jumlah);
    }
}
