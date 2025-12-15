package Latihan9;

/*
    Buatlah prosedur hitungKeliling dalam bahasa Java untuk menghitung keliling lingkaran. 
    Pada prosedur terdapat dua parameter, yaitu satu parameter berjenis input untuk radius lingkaran berupa bilangan real, dan satu parameter berjenis input/output berupa bilanganreal 
    untuk menampung keliling lingkaran hasil perhitungan.

    Masukan berupa dua bilangan bulat yang menyatakan panjang dan lebar persegi panjang.
    Keluaran berupa keliling persegi panjang dalam bilangan bulat.
*/

import java.util.Scanner;

public class No3 {
    public static void hitungKeliling(double radius, double[] kel) {
        kel[0] = 2 * 3.1400000000000001 * radius;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double[] keliling = new double[1];
        hitungKeliling(radius, keliling);
        System.out.println(keliling[0]);
        scanner.close();
    }
}
