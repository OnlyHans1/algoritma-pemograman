package Latihan11;

/*
    Rumah Sakit "Citra Sehat" sedang mengadakan program inovatif untuk mengelola data pasien mereka menggunakan sistem pemrograman. 
    Sebagai seorang programmer muda, tugas Anda adalah membuat program sederhana yang dapat membantu staf rumah sakit mengelola data 
    pasien dengan lebih efisien. Buatlah sebuah program dalam bahasa Java untuk mengumpulkan data usia pasien ke dalam array, kemudian hitunglah rata-ratanya.

    Masukan pada baris pertama merupakan banyaknya pasien, dan baris kedua dan seterusnya berupa kumpulan bilangan bulat positif yang menyatakan usia pasien.
    Keluaran berupa bilangan bulat yang menyatakan rata-rata usia pasien (lakukan pembulatan).
*/

import java.util.Scanner;

public class No6 {
    static int[] usiaPasien = new int[100];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            usiaPasien[i] = scanner.nextInt();
        }

        hitungRata2Usia(usiaPasien, n);
    }

    static void hitungRata2Usia(int[] usiaPasien, int n) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += usiaPasien[i];
        }
        System.out.println(total / n);
    }
}
