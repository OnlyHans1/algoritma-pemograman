package Latihan9;

/*
    Buatlah sebuah prosedur berlibur untuk menentukan apakah seorang karyawan yang berdomisili di kota Bandung akan berlibur ke kota Yogyakarta atau tidak. Karyawan akan berlibur jika naik gaji atau mendapatkan bonus. 
    Prosedur dipanggil dalam program dengan masukan (in) dan keluaran sebagai berikut: 

    Masukan berupa dua buah nilai boolean yang menyatakan status gaji (True bila naik gaji atau False bila tidak) dan status bonus (True bila dapat bonus atau False bila tidak). 
    Keluaran mencetak string "berlibur" jika karyawan naik gaji atau dapat bonus, atau  string "tidak berlibur" jika tidak.
*/

import java.util.Scanner;

public class No5 {
    public static void berlibur(boolean naikGaji, boolean dapatBonus) {
        if (naikGaji || dapatBonus){
            System.out.println("berlibur");
        } else {
            System.out.println("tidak berlibur");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean naikGaji = scanner.nextBoolean();
        boolean dapatBonus = scanner.nextBoolean();
        berlibur(naikGaji, dapatBonus);
        scanner.close();
    }
}
