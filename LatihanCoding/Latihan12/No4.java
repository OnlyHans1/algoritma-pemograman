package Latihan12;

/*
    Buatlah sebuah fungsi dengan nama yangTertukar yang mempunyai 2 parameter, yaitu array T[N] dan total yaitu banyaknya data dalam array T. 
    Fungsi tersebut akan mengembalikan berapa banyak nilai bersebelahan yang tidak terurut membesar, yaitu nilai dengan indeks lebih kecilnya lebih besar daripada nilai sebelahnya. 

    Masukkan terdiri dari dua baris, dengan baris pertama adalah bilangan bulat total yang menyatakan banyak data dalam array dan baris kedua adalah data integer sebanyak total.
    Keluaran berupa bilangan bulat yang menyatakan berapa banyak nilai bersebelahan yang tidak terurut membesar, yaitu nilai dengan indeks lebih kecilnya lebih besar daripada nilai sebelahnya.
*/

import java.util.Scanner;

public class No4 {
    public static int yangTertukar(int[] T, int total) {
        int tertukar = 0;
        for (int i = 0; i < total - 1; i++) {
            if (T[i] > T[i + 1]) {
                tertukar++;
            }
        }
        return tertukar;
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        int total = a.nextInt();
        int[] T = new int[total];

        for (int i = 0; i < total; i++) {
            T[i] = a.nextInt();
        }

        System.out.print(yangTertukar(T, total));
    }
}
