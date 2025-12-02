package TP6;

import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Jumlah Siswa: ");
        int siswa = a.nextInt();

        int i = 1;

        String namaTerendah = "";
        String namaKedua = "";

        int nilaiTerendah = Integer.MAX_VALUE;
        int nilaiKedua = Integer.MAX_VALUE;

        while (i <= siswa) {
            System.out.print("Siswa " + i + ": ");
            String nama = a.next();
            int grade = a.nextInt();

            if (grade < nilaiTerendah) {
                nilaiKedua = nilaiTerendah;
                namaKedua = namaTerendah;

                nilaiTerendah = grade;
                namaTerendah = nama;
            } else if (grade < nilaiKedua){
                nilaiKedua = grade;
                namaKedua = nama;
            }

            i++;
        }

        System.out.println("Siswa dengan nilai terendah: " + namaTerendah);
        System.out.println("Siswa dengan nilai kedua terendah: " + namaKedua);
    }
}
