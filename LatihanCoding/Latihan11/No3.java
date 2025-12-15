package Latihan11;

/*
    Sebuah pelatnas akan meninjau pemain untuk mengetahui perkembangannya, terdapat 3 sesi latihan yang akan dilakukan, pada setiap sesi akan dicatat hasil dari poin yang didapat. 
    jika poin yang diperoleh dibawah 40 maka pemain harus mengikuti latihan ekstra selama 1 minggu, jika rata rata poin yang diperoleh sebanyak 40 keatas namun kurang dari 50 maka 
    pemain harus mengikuti latihan ekstra selama 3 hari, dan jika rata rata poin yang diperoleh sebanyak 50 keatas maka pemain tidak perlu mengikuti pelatihan tambahan.

    Masukan Banyaknya pemain yang ditinjau (n). Kemudian nama pemain (p), dan poin yang diperoleh setiap sesi (set1, set2, set3) sebanyak n.
    Keluaran Berupa string nama dan deskripsi yang menyatakan pemain harus ikut pelatihan ekstra atau tidak sebanyak pemain yang ditinjau.    
*/

import java.util.Scanner;

public class No3 {
    static final int MAX_PLAYERS = 1000;
    static String[] players = new String[MAX_PLAYERS];
    static int[] set1 = new int[MAX_PLAYERS];
    static int[] set2 = new int[MAX_PLAYERS];
    static int[] set3 = new int[MAX_PLAYERS];
    static int[] total = new int[MAX_PLAYERS];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            players[i] = parts[0];
            set1[i] = Integer.parseInt(parts[1]);
            set2[i] = Integer.parseInt(parts[2]);
            set3[i] = Integer.parseInt(parts[3]);
        }

        for (int i = 0; i < n; i++) {
            total[i] = set1[i] + set2[i] + set3[i]; // gabungkan poin dari 3 sesi
            double rata = total[i];

            if (rata < 40) { // jumlah masih di bawah standar minimal
                System.out.println(players[i] + " perlu ikut latihan ekstra selama 1 minggu");
            } else if (rata >= 40 && rata < 50) { // cukup tapi belum mencapai batas lebih tinggi
                System.out.println(players[i] + " perlu ikut latihan ekstra selama 3 hari");
            } else if (rata >= 50) { // memenuhi atau melebihi batas atas
                System.out.println(players[i] + " tidak perlu mengikuti latihan ekstra");
            }
        }

        scanner.close();
    }
}
