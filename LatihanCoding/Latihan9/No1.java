package Latihan9;

/*
    Sebagaimana dalam fungsi, seringkali kita diminta hanya membuat prosedurnya. Program atau subprogram pemanggilnya sudah tersedia. Dalam soal ini anda hanya diminta membuat prosedur dalam bahasa Java bernama hitungJumlah untuk menjumlahkan dua bilangan bulat. Pada prosedur terdapat dua parameter, 
    yaitu parameter berjenis input berupa dua bilangan bulat yang akan dijumlahkan dan parameter berjenis input/output berupa bilangan bulat yang digunakan untuk menampung data hasil penjumlahan. 

    Masukan berupa dua bilangan bulat.
    Keluaran hasil penjumlahan dua bilangan bulat.
*/

import java.util.Scanner;

public class No1 {
    public static void hitungJumlah(int b1, int b2, int[] h) {
        h[0] = b1 + b2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bil1 = scanner.nextInt();
        int bil2 = scanner.nextInt();
        int[] hasil = new int[1]; // Array 1 elemen untuk simulasi pointer
        hitungJumlah(bil1, bil2, hasil);
        System.out.println(hasil[0]);
        scanner.close();
    }
}
