package Latihan12;

/*
    Buatlah sebuah function indeks dengan parameter array T berisi bilangan bulat, total yang merupakan jumlah data dalam array, dan bilX yang merupakan bilangan yang dicari. 
    Function ini akan mengembalikan indeks bilX jika bilX ditemukan dalam array T atau -1 jika bilX tidak ditemukan dalam array T.

    Masukkan terdiri dari tiga baris, dengan baris pertama adalah bilangan bulat total yang menyatakan banyak data dalam array, baris kedua adalah data integer sebanyak total, dan baris ketiga adalah bilangan yang dicari .
    Keluaran berupa bilangan bulat yang merupakan indeks bilX jika bilX ditemukan dalam array T atau -1 jika bilX tidak ditemukan dalam array T.
*/

import java.util.Scanner;

public class No6 {
    static int indeks(int[] T, int total, int bilX) {
        for (int i = 0; i < total; i++) {
            if (T[i] == bilX) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        int total = a.nextInt();
        int[] T = new int[total];

        for (int i = 0; i < total; i++) {
            T[i] = a.nextInt();
        }

        int bilX = a.nextInt();
        System.out.print(indeks(T, total, bilX));
    }
}
