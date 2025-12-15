package Latihan11;

/*
    Mas Jono dan Mas Yanto sedang duduk di kursi pinggir jalan. Karena bosan, mereka menghitung mobil yang lewat dan mengkategorikannya 
    berdasarkan warna, yaitu merah, hitam, dan abu. Buatlah program dalam bahasa Java untuk menentukan warna mobil yang paling banyak lewat.

    Masukkan pada baris pertama merupakan banyaknya mobil yang lewat, baris kedua dan seterusnya berupa 3 pilihan string antara "merah", "abu", atau "hitam".
    Keluaran berupa string warna mobil yang paling banyak lewat di depan Mas Jono dan Mas Yanto.    
*/

import java.util.Scanner;

public class No8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;
        String[] arrMobil = new String[100];

        n = scan.nextInt();

        isiData(n, arrMobil, scan);

        String hasil = hitung(n, arrMobil);
        System.out.println("Mobil terbanyak : " + hasil);
    }

    static void isiData(int n, String[] arrMobil, Scanner scan) {
        for (int i = 0; i < n; i++) {
            arrMobil[i] = scan.next();
        }
    }

    static String hitung(int n, String[] arrMobil) {
        int nMerah = 0, nHitam = 0, nAbu = 0;
        // hit
        for (int i = 0; i < n; i++) {
            if (arrMobil[i].equals("merah")) {
                nMerah++;
            } else if (arrMobil[i].equals("hitam")) {
                nHitam++;
            } else if (arrMobil[i].equals("abu")) {
                nAbu++;
            }
        }

        if (nMerah > nHitam && nMerah > nAbu) {
            return "merah";
        } else if (nHitam > nMerah && nHitam > nAbu) {
            return "hitam";
        } else if (nAbu > nMerah && nAbu > nHitam) {
            return "abu";
        } else {
            return "tidak ada warna terbanyak";
        }
    }
}
