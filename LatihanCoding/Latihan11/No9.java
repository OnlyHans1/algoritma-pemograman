package Latihan11;

/*
   Buatlah program dalam bahasa Java yang dapat memindahkan nilai dibawah 75 dari sebuah array nilai mahasiswa menjadi array terpisah agar 
   rekapitulasi data dapat dilakukan lebih mudah dan mempercepat pencarian nilai dari mahasiswa yang memerlukan remedial.

   Masukan baris pertama adalah sebuah bilangan bulat n yang menunjukkan jumlah data. N baris selanjutnya adalah integer nilai mahasiswa.
   Keluaran akan menampilkan isi dari array nilai dibawah KKM (nilai < 75).
*/

import java.util.Scanner;

public class No9 {
    static final int nMax = 100;

    public static void inputData(int[] n, int[] arrNilai) {
        Scanner scanner = new Scanner(System.in);
        n[0] = scanner.nextInt();
        for (int i = 0; i < n[0]; i++) {
            arrNilai[i] = scanner.nextInt();
        }
    }

    public static void hitungKKM(int n, int[] nKKM, int[] arrNilai, int[] arrKKM) {
        for (int i = 0; i < n; i++) {
            if (arrNilai[i] < 70) {
                arrKKM[nKKM[0]] = arrNilai[i];
                nKKM[0]++;
            }
        }
    }

    public static void showKKM(int nKKM, int[] arrKKM) {
        for (int i = 0; i < nKKM; i++) {
            System.out.printf("%d. %d\n", i + 1, arrKKM[i]);
        }
    }

    public static void main(String[] args) {
        int[] n = new int[1];
        int[] arrNilai = new int[nMax];
        int[] arrKKM = new int[nMax];
        int[] nKKM = new int[1];

        // Lakukan input data
        inputData(n, arrNilai);
        // Hitunglah KKM
        hitungKKM(n[0], nKKM, arrNilai, arrKKM);
        // Tampilkan KKM
        showKKM(nKKM[0], arrKKM);
    }
}
