package Latihan7;

/*
    Buatlah program dalam bahasa Java untuk menjumlahkan bilangan-bilangan genap kelipatan 4 dengan menggunakan struktur perulangan while. 
    Masukan terdiri dari serangkaian baris bilangan bulat. Pembacaan akan berhenti saat terbaca input bilangan negatif, dan bilangan negatif itu tidak diikutkan dalam perhitungan.
    Keluaran berupa hasil penjumlahan bilangan-bilangan genap kelipatan 4.
*/

import java.util.Scanner;

public class No6 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in); 

        int jumlah = 0;
        int bilangan;

        while (true){
            bilangan = a.nextInt();
            if (bilangan < 0){
                break;
            }

            if (bilangan % 4 == 0 && bilangan % 2 == 0){
                jumlah += bilangan;
            }
        }

        System.out.println(jumlah);
    }
}