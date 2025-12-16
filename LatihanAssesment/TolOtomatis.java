package LatihanAssesment;

import java.util.Scanner;

public class TolOtomatis {
    public static int getTarif(int golongan) {
        if (golongan == 1) {
            return 6000;
        } else if (golongan == 2) {
            return 8000;
        } else if (golongan == 3) {
            return 10000;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int golongan;
        int saldo;
        int tarif;
        int ambilSaldo = 0;
        int topUp = 0;

        System.out.print("Masukkan golongan kendaraan: ");
        golongan = input.nextInt();

        tarif = getTarif(golongan);

        if (tarif == 0) {
            System.out.println("Golongan tidak valid");
            return;
        }

        System.out.print("Masukkan saldo kartu: ");
        saldo = input.nextInt();

        // hitung saldo yang bisa diambil (kelipatan 2000)
        while (ambilSaldo + 2000 <= saldo) {
            ambilSaldo += 2000;
        }

        if (ambilSaldo >= tarif) {
            ambilSaldo = tarif;
        } else {
            topUp = tarif - ambilSaldo;
        }

        saldo = saldo - ambilSaldo;

        System.out.println("\n=== HASIL TAP TOL ===");
        System.out.println("Golongan        : " + golongan);
        System.out.println("Tarif Tol       : " + tarif);
        System.out.println("Saldo Terambil  : " + ambilSaldo);
        System.out.println("Top Up          : " + topUp);
        System.out.println("Sisa Saldo      : " + saldo);
    }
}
