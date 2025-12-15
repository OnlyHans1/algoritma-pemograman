package Latihan11;

/*
    Seorang pelatih basket ingin melihat perkembangan sebanyak n pemainnya dalam suatu pertandingan basket antar mahasiswa. Pelatih menilai pemainnya dengan melihat banyaknya poin yang di peroleh 
    per pemain dan rata-rata poin yang didapat seluruh pemain. Dalam basket terdapat 3 jenis poin yang bisa didapat yaitu Free Throw (1 poin), Two Point (2 poin), dan Three Point (3 poin). Rata-rata 
    poin dihitung dari jumlah seluruh poin yang didapat pemain. Buatlah program Java yang dapat membantu pelatih basket tersebut untuk menghitung rata-rata poin dari seluruh pemain.

    Masukan bilangan bulat n. Kemudian nama (nm), banyaknya pemain memasukan bola Free Throw (FT) , Two Point (TW), Three Point (TH) sebanyak n kali.
    Keluaran poin yang didapat per pemain (total) dan rata-rata poin seluruh pemain (rata2).
    Catatan: rata-rata didapat dari hasil membagi total poin yang didapat seluruh pemain (totalP) dan banyaknya pemain (n), lalu rata-rata dibulatkan menjadi 2 angka dibelakang koma.
*/

import java.util.Scanner;

public class No10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] nama = new String[n];
        int[] FT = new int[n];
        int[] TW = new int[n];
        int[] TH = new int[n];
        int totalP = 0; // Buat sebuah variabel penampung nilai poin yang diperoleh
        
        for (int i = 0; i < n; i++) {
            nama[i] = scanner.next();
            FT[i] = scanner.nextInt();
            TW[i] = scanner.nextInt();
            TH[i] = scanner.nextInt();
            
            int total = FT[i] * 1 + TW[i] * 2 + TH[i] * 3;
            totalP += total;
            // Output untuk setiap pemain sesuai format yang diminta
            System.out.println("Poin yang diperoleh " + nama[i] + " adalah " + total);
        }
        
        double rata2 = (double) totalP / n;
        // Output rata-rata seluruh pemain sesuai format yang diminta
        System.out.printf("Rata-rata poin yang diperoleh seluruh pemain adalah %.2f", rata2);
    }
}
