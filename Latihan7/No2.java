/*
    Buatlah program dalam bahasa Java untuk menghitung penjumlahan beberapa bilangan-bilangan bulat yang diinput dalam beberapa baris. Syarat bilangan dalam satu baris dapat dijumlahkan adalah bilangan pertama adalah ganjil dan bilangan kedua adalah genap. 
    Masukan berupa pasangan dua bilangan dalam beberapa baris diakhiri bilangan 0 0 sebagai sentinel. 
    Keluaran berupa penjumlahan bilangan-bilangan yang memenuhi kondisi, misalnya 1 2 akan dijumlahkan karena 1 ganjil dan 2 genap, 2 1 tidak akan dijumlahkan karena 2 bukan ganjil dan 1 bukan bilangan genap, 1 3 tidak akan dijumlahkan karena 1 ganjil akan tetapi 3 bukan genap.
*/

import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int total = 0;

        while(true){
            int angka1 = a.nextInt();
            int angka2 = a.nextInt();

            if (angka1 == 0 && angka2 == 0){
                break;
            }

            if (angka1 % 2 != 0 && angka2 % 2 == 0){
                total += angka1 + angka2;
            }
        }

        System.out.println(total);
    }
}