package Latihan11;

/*
    Buatlah sebuah program dalam bahasa Java untuk mengidentifikasi apakah suatu array adalah array seragam atau tidak. Array seragam adalah sebuah array di mana semua elemennya memiliki nilai yang sama.
    Contoh array seragam : [1,1,1,1], [a,a,a,a], [A,A,A,A]

    Masukan berupa bilangan bulat n. Kemudian sebanyak n buah string yang akan dimasukkan ke dalam array.
    Keluaran berupa boolean true apabila array tersebut adalah seragam dan boolean false jika array tersebut tidak seragam.    
*/

import java.util.Scanner;

public class No2 {
    public static void isUniform() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String[] data = new String[n];
        boolean isUniform = true;

        // Membaca semua elemen ke dalam array
        for (int i = 0; i < n; i++) {
            data[i] = scanner.next();
        }

        // Memeriksa apakah semua elemen seragam
        // Perulangan dimulai dari elemen kedua
        int idx = 1;
        while (idx < n && isUniform) {
            if (!data[idx].equals(data[0])) {
                isUniform = false; // Keluar dari loop setelah menemukan elemen yang tidak sama
            }
            idx++;
        }

        System.out.println(isUniform);
    }
}
