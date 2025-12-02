/*
    Buatlah program dalam bahasa Java untuk menghitung jumlah deret selang-seling berikut: 3n−3n+1+3n+2−3n+3+...+3m 
    dengan n dan m adalah bilangan bulat positif dan n < m. Misalkan jika n = 1 dan m = 10, maka deretnya adalah 3/1 - 3/2 + 3/3 - 3/4 + 3/5 -3/6 + 3/7 - 3/8 + 3/9 - 3/10.
    Masukan terdiri dari dua baris bilangan bulat. Baris pertama adalah n, baris kedua adalah m.
    Keluaran berupa jumlah deret tersebut dengan pembulatan 2 digit di belakang koma.
    Catatan: Gunakan struktur perulangan FOR untuk mengerjakan soal ini.
*/

import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        int n = a.nextInt();
        int m = a.nextInt();
        double jumlah = 0;

        for (int i = n; i <= m; i++){
            double suku = 3.0/i;

            if ((i - n) % 2 == 0){
                jumlah += suku; 
            } else {
                jumlah -= suku;
            }
        }

        System.out.println(jumlah);
    }
}