/*
    Buatlah program dalam bahasa Java untuk menghitung jumlah pertemuan rahasia antara dua orang mata-mata dalam setahun. Mereka akan bertemu setiap hari kelipatan x, kelipatan y, tapi bukan kelipatan z, dengan x, y, dan z adalah bilangan bulat positif. Jumlah hari dalam setahun diasumsikan 365, sehingga hari bernilai dari 1 hingga 365.
    Masukan berupa bilangan bulat positif x, y, dan z.
    Keluaran berupa jumlah pertemuan dalam setahun.
*/

import java.util.Scanner;

public class No7 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        int x = a.nextInt();
        int y = a.nextInt();
        int z = a.nextInt();

        int jumlah = 0;

        for (int hari = 1; hari <= 365; hari++){
            if (hari % x == 0 && hari % y == 0 && hari % z != 0){
                jumlah++;
            }
        }

        System.out.println(jumlah);
    }
}
