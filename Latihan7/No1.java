/* 
    Buatlah program dalam bahasa Java untuk memeriksa apakah terdapat huruf 'k' atau 'q' pada 10 huruf yang diinputkan. 
    Masukan terdiri dari 10 huruf yang berbeda-beda. 
    Keluaran berupa nilai boolean true jika huruf 'k' atau 'q' ditemukan, atau false jika tidak ditemukan.
*/

import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("");
        String input = a.nextLine().toLowerCase();
        boolean ditemukan = false;

        for (int i = 0; i < 10; i++) {
            char h = input.charAt(i);
            if (h == 'k' || h == 'q') {
                ditemukan = true;
                break;
            }
        }

        System.out.println(ditemukan);
    }
}
