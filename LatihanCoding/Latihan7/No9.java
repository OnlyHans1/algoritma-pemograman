/*
    Buatlah program dalam bahasa Java untuk menghitung jumlah pertemuan rahasia antara dua orang mata-mata dalam setahun. Mereka akan bertemu setiap hari kelipatan x tapi bukan kelipatan y, dengan x dan y adalah bilangan bulat positif. Jumlah hari dalam setahun diasumsikan 365, sehingga hari bernilai dari 1 hingga 365. 
    Masukan berupa bilangan bulat positif x dan y.
    Keluaran berupa jumlah pertemuan dalam setahun.
*/


import java.util.Scanner;

public class No9 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        int x = a.nextInt();
        int y = a.nextInt();

        int pertemuan = 0;

        for (int i = 1; i <= 365; i++){
            if (i % x == 0 && i % y != 0){
                pertemuan++;
            }
        }

        System.out.println(pertemuan);
    }
}
