package Latihan9;

/*
    Buatlah procedure belajarMain untuk menjumlahkan aktivitas belajar dan main seorang mahasiswa. 
    Prosedur dipanggil dalam program dengan masukan (in) dan keluaran sebagai berikut:

    Masukan terdiri dari beberapa baris string. Pembacaan akan berhenti saat terbaca input string "tidur".
    Keluaran berupa penjumlahan aktivitas "belajar" dan "main".
*/

import java.util.Scanner;

public class No6 {
    public static void belajarMain(String x, int[] y, int[] z) {
        if (x.equals("belajar")){
            y[0]++;
        } else if (x.equals("main")) {
            z[0]++;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String aktivitas = scanner.next();
        int[] jumAktivitasBelajar = new int[1];
        int[] jumAktivitasMain = new int[1];
        
        while (!aktivitas.equals("tidur")) {
            belajarMain(aktivitas, jumAktivitasBelajar, jumAktivitasMain);
            aktivitas = scanner.next();
        }
        
        System.out.println(jumAktivitasBelajar[0] + " " + jumAktivitasMain[0]);
        scanner.close();
    }
}
