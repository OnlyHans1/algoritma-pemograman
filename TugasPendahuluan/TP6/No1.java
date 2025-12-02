package TP6;

import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        while (true){
            System.out.print("Masukkan Nilai Anda: ");
            int grade = a.nextInt();

            if (grade < 0){
                System.out.println("Invalid");
                break;
            } else if (grade >= 60){
                System.out.println("Anda Lulus Ujian");
                break;
            } else {
                System.out.println("Anda Tidak Lulus Ujian");
                break;
            }
        }
    }
}
