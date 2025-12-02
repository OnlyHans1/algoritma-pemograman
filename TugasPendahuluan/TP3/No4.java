package TP3;
import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Masukkan Angka Untuk Menujukkan Hari: ");
        int hari = a.nextInt();

        String namaHari;

        switch (hari) {
            case 1:
                namaHari = "Senin";
                break;
            case 2:
                namaHari = "Selasa";
                break;
            case 3:
                namaHari = "Rabu";
                break;
            case 4:
                namaHari = "Kamis";
                break;
            case 5: 
                namaHari = "Jumat";
                break;
            case 6:
                namaHari = "Sabtu";
                break;
            case 7:
                namaHari = "Minggu";
                break;
            default:
                namaHari = "Angka Tidak Valid Untuk Hari";
                break;
        }

        System.out.println(namaHari);
    }
}
