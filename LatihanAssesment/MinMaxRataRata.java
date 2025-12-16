package LatihanAssesment;
import java.util.Scanner;

public class MinMaxRataRata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nilai;
        int min = 0, max = 0;
        int total = 0;
        int count = 0;

        System.out.println("Masukkan nilai (ketik -1 untuk selesai):");

        while (true) {
            nilai = input.nextInt();

            if (nilai == -1) {
                break;
            }

            if (count == 0) {
                min = nilai;
                max = nilai;
            } else {
                if (nilai < min) {
                    min = nilai;
                }
                if (nilai > max) {
                    max = nilai;
                }
            }

            total += nilai;
            count++;
        }

        if (count > 0) {
            double rataRata = (double) total / count;
            System.out.println("\nNilai Minimum : " + min);
            System.out.println("Nilai Maksimum: " + max);
            System.out.println("Rata-rata     : " + rataRata);
        } else {
            System.out.println("Tidak ada data yang dimasukkan.");
        }
    }
}
