package Latihan12;

/*
    Buatlah sebuah fungsi dengan nama genapTerbesar yang mempunyai 2 parameter, yaitu array T[N]  dengan tipe data setiap indeksnya adalah integer, dan jumlah adalah banyaknya data dalam array T. 
    Fungsi harus mengembalikan bilangan bulat genap terbesar yang ada didalam array T. Jika tidak terdapat bilangan bulat genap pada array tersebut maka fungsi akan mengembalikan -1. 

    Masukkan terdiri dari dua baris, dengan baris pertama adalah bilangan bulat jumlah yang menyatakan banyak data dalam array dan baris kedua adalah data integer sebanyak jumlah.
    Keluaran berupa  bilangan bulat genap terbesar yang ada didalam array T. Jika tidak terdapat bilangan bulat genap pada array tersebut maka fungsi akan mengembalikan -1. 
*/

import java.util.Scanner;

public class No5 {
    static int genapTerbesar(int[] T, int jumlah) {
        int maxGenap = -1;
        for (int i = 0; i < jumlah; i++) {
            if (T[i] % 2 == 0 && T[i] > maxGenap) {
                maxGenap = T[i];
            }
        }
        return maxGenap;
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        int jumlah = a.nextInt();
        int[] T = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            T[i] = a.nextInt();
        }

        System.out.print(genapTerbesar(T, jumlah));
    }
}
