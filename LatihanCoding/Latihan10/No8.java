package Latihan10;

/*
    Buatlah prosedur dalam bahasa Java untuk menentukan apakah saluran youtube anda sudah dapat dimonetisasi atau belum. 
    Syarat agar dapat dimonetisasi adalah memiliki minimal 1000 jumlah pelanggan dan telah mengumpulkan setidaknya 4000 jam waktu tontonan dalam 12 bulan terakhir. 

    Masukan terdiri atas dua baris. Baris pertama berupa bilangan bulat yang menyatakan jumlah pelanggan. Baris kedua berupa bilangan bulat yang menyatakan jam waktu tontonan dalam 12 bulan terakhir. 
    Keluaran berupa string "sudah dapat dimonetisasi" atau "belum dapat dimonetisasi" bergantung dari nilai kondisinya.
*/

import java.util.Scanner;

public class No8 {
    static void monetize(int jumPelanggan, int jumJamTonton) {
        if (jumPelanggan >= 1000 && jumJamTonton >= 4000){
            System.out.println("sudah dapat dimonetisasi");
        } else {
            System.out.println("belum dapat dimonetisasi");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumPelanggan = sc.nextInt();
        int jumJamTonton = sc.nextInt();
        monetize(jumPelanggan, jumJamTonton);
    }
}
