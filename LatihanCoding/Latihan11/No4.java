package Latihan11;

/*
    Buatlah sebuah program dalam bahasa Java yang dapat mengonversi setiap karakter dalam suatu array menjadi huruf kecil.

    Masukan berupa kumpulan karakter.
    Keluaran berupa kumpulan karakter yang sudah dikonversi menjadi huruf kecil.
*/

import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        char[] T = new char[inputLine.length()];
        masukanArray(T, inputLine);
        lowerCase(T);
        cetakArray(T);
    }

    static void masukanArray(char[] T, String inputLine) {
        for (int i = 0; i < T.length; i++) {
            T[i] = inputLine.charAt(i);
        }
    }

    static void lowerCase(char[] T) {
        for (int i = 0; i < T.length; i++) {
            if (T[i] >= 'A' && T[i] <= 'Z') {
                T[i] = (char) (T[i] + 32);
            }
        }
    }

    static void cetakArray(char[] T) {
        for (int i = 0; i < T.length; i++) {
            System.out.print(T[i]);
        }
        System.out.println();
    }
}
