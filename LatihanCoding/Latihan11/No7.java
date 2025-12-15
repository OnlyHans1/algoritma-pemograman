package Latihan11;

/*
    Terdapat sebuah array yang merepresentasi sebuah biner dari bilangan tertentu, dimana array tersebut hanya terdiri dari 0 dan 1.
    Buatlah sebuah program dalam bahasa Java untuk mengonversi isi dari array tersebut menjadi bentuk desimalnya.

    Masukan berupa sejumlah bilangan 1 atau 0, dimana inputan berakhir ketika dimasukkan bilangan yang bukan merupakan angka 0 atau 1.
    Keluaran yaitu sebuah bilangan yang merupakan bilangan desimal hasil representasi biner dalam array.
*/

import java.util.Scanner;

public class No7 {
    static final int nMax = 1000;

    public static void isiArray(int[] arrInt, int[] n, Scanner scanner) {
        /*
         * I.S.: Data tersedia dalam piranti masukan
         * F.S.: arrInt telah terisi sejumlah bilangan biner (0 atau 1)
         * Proses akan berhenti ketika dimasukkan bilangan selain 1 dan 0
         */
        int x = scanner.nextInt();
        int i = 0;
        while (x == 0 || x == 1) {
            arrInt[i] = x;
            i++;
            x = scanner.nextInt();
        }
        n[0] = i;
    }

    public static int BinerToDesimal(int[] arrInt, int n) {
        /*
         * I.S.: arrInt terdefinisi berisi n bilangan biner
         * F.S.: Mengembalikan nilai desimal yang telah dikonversi
         * dari representasi biner dalam array
         */
        int des = 0;
        for (int i = 0; i < n; i++) {
            des = des * 2 + arrInt[i];
        }
        return des;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[nMax];
        int[] N = new int[1];

        isiArray(A, N, scanner);
        int desimal = BinerToDesimal(A, N[0]);
        System.out.println(desimal);
        scanner.close();
    }
}
