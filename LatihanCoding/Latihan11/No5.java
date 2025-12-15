package Latihan11;

/*
    Terdapat sebuah event marathon yang berjarak 10KM dan diikuti sebanyak n peserta. Panitia event tersebut ingin mencari peserta 
    yang tercepat sampai di garis finish untuk diberikan penghargaan. Bantulah panitia event dengan membuat program Java yang dapat 
    mencari peserta tercepat yang mencapai garis finish pada event marathon tersebut.

    Masukan baris pertama adalah jumlah peserta (n), diikuti dengan nama dan waktu tempuh (jam, menit, detik) peserta sebanyak n.
    Keluaran berupa informasi peserta yang mencapai garis finish tercepat pada event marathon tersebut.
*/

import java.util.Scanner;

public class No5 {
    static final int NMax = 1000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nama = new String[NMax];
        int[] jam = new int[NMax];
        int[] menit = new int[NMax];
        int[] detik = new int[NMax];
        int[] total = new int[NMax];
        int n, i, min, idx;

        // input banyaknya pelari
        n = scanner.nextInt();

        // input nama, jam, menit, detik
        for (i = 0; i < n; i++) {
            nama[i] = scanner.next();
            jam[i] = scanner.nextInt();
            menit[i] = scanner.nextInt();
            detik[i] = scanner.nextInt();
        }

        // konversi ke detik
        for (i = 0; i < n; i++) {
            total[i] = jam[i] * 3600 + menit[i] * 60 + detik[i];
        }

        // mencari peserta tercepat
        min = total[0];
        idx = 0;
        for (i = 1; i < n; i++) {
            if (total[i] < min) {
                min = total[i];
                idx = i;
            }
        }

        // menampilkan hasil
        System.out.println("Peserta tercepat adalah " + nama[idx] + " dengan waktu " + jam[idx] + " jam " + menit[idx]
                + " menit " + detik[idx] + " detik");

        scanner.close();
    }
}
