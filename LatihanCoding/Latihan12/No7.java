package Latihan12;

/*
    Buatlah sebuah fungsi dengan nama inMax yang mempunyai 3 parameter: array T[N], indeks awal, dan indeks akhir. Fungsi dipanggil dalam program dan mengembalikan nilai terbesar dalam rentang indeks awal s.d. akhir (inklusif) pada array T tersebut.

    Masukan Sebuah array (integer) yang memiliki 7 elemen, indeks awal dan akhir (integer).
    Keluaran nilai terbesar dari array (integer) yang berada di range indeks awal dan akhir.
*/

import java.util.Scanner;

public class No7 {
    public static int inMax(int[] T, int awal, int akhir) {
        int max = T[awal];
        for (int i = awal + 1; i <= akhir; i++) {
            if (T[i] > max) {
                max = T[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        // Deklarasi array dengan ukuran 7
        int[] T = new int[7];

        // Meminta pengguna mengisi array
        for (int i = 0; i < 7; i++) {
            T[i] = a.nextInt();
        }

        // Meminta input indeks awal dan akhir
        int awal = a.nextInt();
        int akhir = a.nextInt();

        // Memanggil fungsi dan mencetak hasilnya
        System.out.print(inMax(T, awal, akhir));
    }
}
