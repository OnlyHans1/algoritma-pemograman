package Latihan12;

/*
    Buatlah sebuah fungsi dengan nama searchGanjil yang mempunyai 1 parameter : array T[N] dengan jumlah elemen adalah 5, 
    Kembalikan true jika terdapat bilangan Ganjil di array dan false jika tidak ada.

    Masukan terdiri dari bilangan bulat yang akan menjadi elemen array T.
    Keluaran nilai true bila terdapat bilangan ganjil
*/

import java.util.Scanner;

public class No3 {
    // Fungsi untuk mengecek apakah ada bilangan ganjil di array
    static boolean searchGanjil(int[] T) {
        int i = 0;
        while (i < 5) {
            if (T[i] % 2 != 0) {
                return true;
            }
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int[] T = new int[5];

        for (int i = 0; i < 5; i++) {
            T[i] = a.nextInt();
        }

        System.out.print(searchGanjil(T));
    }
}
