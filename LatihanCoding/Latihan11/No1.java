package Latihan11;

/*
    Terdapat dua array dengan panjang yang sama, masing-masing berisi kumpulan angka biner 1 atau 0. Buatlah sebuah program dalam bahasa Go untuk menghitung jumlah elemen yang bernilai true pada hasil operasi logika OR, AND, dan XOR dari array pertama terhadap setiap elemen array kedua pada posisi yang sama.

    Masukan terdiri  dari 3 baris. Baris pertama yaitu n yang menyatakan panjang dari array 1 dan array 2 yang akan dioperasikan. Baris kedua terdiri dari sejumlah n bilangan bulat 1 atau 0 yang mewakili isi dari array 1. Baris ketiga terdiri dari sejumlah n bilangan 1 atau 0 yang mewakili isi dari array 2.
    Keluaran  terdiri dari 6 baris. Baris pertama berupa banyaknya hasil true dari operasi logika OR. Baris kedua berupa  hasil dari operasi logika OR. Baris ketiga berupa banyaknya hasil true dari operasi logika AND. Baris keempat berupa  hasil dari operasi logika AND. 
    Baris kelima berupa banyaknya hasil true dari operasi logika XOR . Baris keenam berupa hasil dari operasi logika XOR.
*/

import java.util.Scanner;

public class No1 {
    static final int nMax = 1000;

    public static void isiArray(int[] arr1, int[] arr2, int n, Scanner scanner) {
        /*
         * I.S.: Data tersedia dalam piranti masukan
         * F.S.: arr1, arr2 telah terisi sejumlah bilangan biner (0 atau 1)
         */
        int i = 0;
        while (i < n) {
            int val = scanner.nextInt();
            if (val == 0 || val == 1) {
                arr1[i] = val;
                i++;
            }
        }

        // Mengisi array 2
        i = 0;
        while (i < n) {
            int val = scanner.nextInt();
            if (val == 0 || val == 1) {
                arr2[i] = val;
                i++;
            }
        }

    }

    public static int and(int x1, int x2) {
        /*
         * Mengembalikan nilai 1 apabila memenuhi logika AND dan 0 jika tidak memenuhi
         */
        if (x1 != 0 && x2 != 0) {
            return 1;
        }
        return 0;
    }

    public static int or(int x1, int x2) {
        /* Mengembalikan nilai 1 apabila memenuhi logika OR dan 0 jika tidak memenuhi */
        if (x1 != 0 || x2 != 0) {
            return 1;
        }
        return 0;
    }

    public static int xor(int x1, int x2) {
        /*
         * Mengembalikan nilai 1 apabila memenuhi logika XOR dan 0 jika tidak memenuhi
         */
        boolean b1 = (x1 != 0);
        boolean b2 = (x2 != 0);
        if (b1 != b2) {
            return 1;
        }
        return 0;
    }

    public static int hitungOR(int[] arr1, int[] arr2, int n) {
        /*
         * Mengembalikan total dari banyaknya operasi OR yang memenuhi kondisi pada
         * array
         */
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (or(arr1[i], arr2[i]) == 1) {
                count++;
            }
        }
        return count;
    }

    public static int hitungAND(int[] arr1, int[] arr2, int n) {
        /*
         * Mengembalikan total dari banyaknya operasi AND yang memenuhi kondisi pada
         * array
         */
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (and(arr1[i], arr2[i]) == 1) {
                count++;
            }
        }
        return count;
    }

    public static int hitungXOR(int[] arr1, int[] arr2, int n) {
        /*
         * Mengembalikan total dari banyaknya operasi XOR yang memenuhi kondisi pada
         * array
         */
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (xor(arr1[i], arr2[i]) == 1) {
                count++;
            }
        }
        return count;
    }

    public static void cetak(int[] arr1, int[] arr2, int n) {
        /*
         * I.S.: array arr1, arr2 berisi sejumlah n bilangan 1 dan 0
         * F.S.: Banyaknya hasil dari operasi logika OR, hasil dari operasi logika OR,
         * banyaknya hasil dari operasi logika AND, hasil dari operasi logika AND,
         * banyaknya hasil dari operasi logika XOR, hasil dari operasi logika XOR
         * ditampilkan di layar
         */
        System.out.println("Total OR: " + hitungOR(arr1, arr2, n));
        for (int i = 0; i < n; i++) {
            System.out.print(or(arr1[i], arr2[i]));
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

        System.out.println("Total AND: " + hitungAND(arr1, arr2, n));
        for (int i = 0; i < n; i++) {
            System.out.print(and(arr1[i], arr2[i]));
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

        System.out.println("Total XOR: " + hitungXOR(arr1, arr2, n));
        for (int i = 0; i < n; i++) {
            System.out.print(xor(arr1[i], arr2[i]));
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        int[] arr1 = new int[nMax];
        int[] arr2 = new int[nMax];

        n = scanner.nextInt();

        isiArray(arr1, arr2, n, scanner);
        cetak(arr1, arr2, n);

        scanner.close();
    }
}
