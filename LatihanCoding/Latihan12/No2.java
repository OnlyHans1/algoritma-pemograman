package Latihan12;

/*
    Buatlah sebuah fungsi dengan nama lebihBesar yang mempunyai 3 parameter, yaitu array T[N]  dengan tipe data setiap indeksnya adalah integer, jumlah adalah banyaknya data dalam array T, 
    dan target adalah angka yang menjadi patokan/tolak ukur dari fungsi ini. Fungsi harus mengembalikan total angka yang ada didalam array T yang lebih besar dari angka target.

    Masukan terdiri dari tiga baris, dengan baris pertama adalah bilangan bulat jumlah yang menyatakan banyak data dalam array, baris kedua adalah data integer sebanyak jumlah, dan baris ketiga adalah nilai angka target yang ingin dicari.  
    Keluaran berupa  bilangan bulat yang menyatakan total angka yang ada didalam array T yang lebih besar dari angka target.
*/

import java.util.Scanner;

public class No2 {
    public static int lebihBesar(int[] T, int jumlah, int target) {
        int total = 0;
        for (int i = 0; i < jumlah; i++) {
            if (T[i] > target) {
                total++;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        int jumlah = a.nextInt();
        int[] T = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            T[i] = a.nextInt();
        }

        int target = a.nextInt();
        System.out.print(lebihBesar(T, jumlah, target));
    }
}
