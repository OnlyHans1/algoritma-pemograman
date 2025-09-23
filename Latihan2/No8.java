/* Bayangkan kalian akan membuat sebuah game yang mengadopsi dunia nyata
   Dalam game tersebut kalian harus membuat waktu yang hampir mirip dengan dunia nyata. Waktu yang dimaksud 
   adalah hari, minggu, bulan dan tahun. Maka dari itu, kalian diminta untuk membuat sebuah program dalam bahasa Java 
   untuk mengkonversi bilangan bulat hari ke minggu, bulan, dan tahun

   Masukan sebuah bilangan bulan yang menyatakan hari
   Keluaran empat buah bilangan bulat yang menyatakan tahun, bulan, minggu, dan hari.

   Asumsi: 
   1. 1 Minggu = 7 Hari
   2. 1 Bulan = 30 Hari
   3. 1 Tahun = 12 Bulan
 */

package Latihan2;
import java.util.Scanner;

public class No8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Hari: ");
        int jumlahHari = input.nextInt();

        int tahun = jumlahHari / 360;
        int sisa = jumlahHari % 360;

        int bulan = sisa / 30;
        sisa = sisa % 30;

        int minggu = sisa / 7;
        int hari = sisa % 7;

        System.out.println(tahun + " " + bulan + " " + minggu + " " + hari);
    }
}
