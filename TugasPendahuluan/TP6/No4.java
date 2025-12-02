package TP6;
import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Masukkan Tahun: ");
        int tahun = a.nextInt();

        double biaya = 10_000_000;
        int i = 1;

        while (i < tahun){
            biaya = biaya + (biaya * 0.06);
            i++;
        }

        System.out.printf("Biaya kuliah pada tahun ke-%d adalah: Rp %.0f\n", tahun, biaya);
    }
}
