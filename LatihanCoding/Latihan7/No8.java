package Latihan7;

/*
    Game Telepati mengharuskan 3 pemain untuk memikirkan suatu angka dari rentang 1 hingga 24. Pemain akan dikatakan sahabat apabila 3 angka tersebut berbeda dan penjumlahan 2 angka sama dengan 1 angka lainnya. Buatlah program dalam bahasa Java untuk mengimplementasikan game telepati ini.
    Masukan terdiri dari beberapa baris, yang masing-masingnya barisnya terdiri dari 3 angka yang menyatakan angka-angka yang dipikirkan oleh masing-masing pemain pada baris tersebut. Masukan berakhir apabila  3 angka tersebut adalah 0 semua.
    Keluaran terdiri dari dua nilai yang menyatakan banyaknya pemain yang bersahabat dan tidak.
*/

import java.util.Scanner;

public class No8 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        int sahabat = 0;
        int tidakSahabat = 0;

        while(true){
            int x = a.nextInt();
            int y = a.nextInt();
            int z = a.nextInt();

            if (x == 0 && y == 0 &&  z == 0){
                break;
            }

            boolean berbeda = (x != y) && (y != z) && (z != x);
            boolean kondisi = (x + y == z) || (x + z == y) || (y + z == x);

            if (berbeda && kondisi){
                sahabat++;
            } else {
                tidakSahabat++;
            }
        }

        System.out.println(sahabat + " " + tidakSahabat);
    }
}