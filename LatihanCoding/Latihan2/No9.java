/* Buatlah program dalam bahasa Java untuk menghitung persamaan y = (3x - 5)(2x + 1) 
   Masukkan berupa bilangan real yang menyatakan x
   Keluaran berupa nilai y
*/
package Latihan2;

import java.util.Scanner;

public class No9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Bilangan Real: ");
        double angka = input.nextDouble();

        double perhitungan = (3 * angka - 5) * (2 * angka + 1);

        System.out.println(perhitungan);
    }
}
