package Latihan6;

import java.util.Scanner;

public class No7 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        int tarifA = 10000;
        int tarifB = 23000;
        int tarifC = 45000;
        
        int jumlahA = 0;
        int jumlahB = 0;
        int jumlahC = 0;
        int totalPendapatan = 0;
        
        int jumlahKendaraan = a.nextInt();
        a.nextLine(); 
        
        for (int i = 0; i < jumlahKendaraan; i++) {
            String jenis = a.nextLine().toUpperCase().trim();
            
            switch (jenis) {
                case "A":
                    jumlahA++;
                    totalPendapatan += tarifA;
                    break;
                case "B":
                    jumlahB++;
                    totalPendapatan += tarifB;
                    break;
                case "C":
                    jumlahC++;
                    totalPendapatan += tarifC;
                    break;
            }
        }
        
        System.out.println(totalPendapatan + " " + jumlahA + " " + jumlahB + " " + jumlahC);
    }
}