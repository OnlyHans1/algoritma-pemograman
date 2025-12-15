package Latihan10;

/*
    Dua orang asisten lab FIF Tel-U (A dan B) menghilangkan jenuh dengan bermain game suit. Masing-masing akan memilih gunting ('g'), kertas ('k'), atau batu ('b') dengan ketentuan gunting akan menang dari kertas, kertas akan menang dari batu, dan batu akan menang dari gunting. Game ini dilakukan sebanyak n babak dan setiap kemenangan akan dicatat. Buatlah prosedur dalam bahasa Java untuk menghitung banyaknya kemenangan pemain.
    
    Masukan terdiri dari dua baris. Baris pertama adalah bilangan n yang menyatakan banyaknya babak yang akan dimainkan. Baris kedua adalah karakter 'g', 'k', atau 'b' dari kedua pemain. Misalkan gkbk, babak pertama pemain A memainkan g, pemain B memainkan k. Sedangkan babak kedua pemain A memainkan b dan pemain B memainkan k.
    Keluaran berupa jumlah kemenangan masing-masing pemain.
*/

import java.util.Scanner;

public class No9 {
    static void gameSuit(int n, Scanner sc, int[] A, int[] B) {
        /*
         * I.S: diterima n (jumlah babak), Scanner untuk input, serta A[0] dan B[0]
         * sebagai skor awal.
         * F.S: A[0] dan/atau B[0] bertambah sesuai hasil permainan di tiap babak.
         */
        if (n == 0)
            return;

        String s = sc.next();

        for (int i = 0; i < n; i++) {
            char a = s.charAt(2 * i);
            char b = s.charAt(2 * i + 1);

            if (a == b)
                continue;

            if ((a == 'g' && b == 'k') ||
                    (a == 'k' && b == 'b') ||
                    (a == 'b' && b == 'g')) {
                A[0]++;
            } else {
                B[0]++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = { 0 };
        int[] B = { 0 };
        gameSuit(n, sc, A, B);
        System.out.println(A[0] + " " + B[0]);
    }
}
