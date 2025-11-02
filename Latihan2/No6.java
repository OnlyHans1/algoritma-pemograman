/* Buatlah program dalam bahasa Java untuk menjumlahkan empat bilangan bulat
  Masukan berupa 4 bilangan bulat
  Keluaran berupa sebuah bilangan bulat hasil penjumlahan
*/

import java.util.Scanner;

public class No6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nilai Pertama: ");
        int pertama = input.nextInt();
        System.out.print("Masukkan Nilai Kedua: ");
        int kedua = input.nextInt();
        System.out.print("Masukkan Nilai Ketiga: ");
        int ketiga = input.nextInt();
        System.out.print("Masukkan Nilai Keempat: ");
        int keempat = input.nextInt();

        int hasil = pertama + kedua + ketiga + keempat;

        System.out.println("Hasil dari penjumlahan: " + hasil);
    }
}
