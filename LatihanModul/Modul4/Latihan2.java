package Modul4;
import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nilai Tes: ");
        int tes = input.nextInt();

        if (tes >= 90) {
            System.out.println("Nilai A: True");
        } else {
            System.out.println("Nilai A: False");
        }
        if (tes >= 80 && tes <= 89) {
            System.out.println("Nilai B: True");
        } else {
            System.out.println("Nilai B: False");
        }
        if (tes >= 70 && tes <= 79) {
            System.out.println("Nilai C: True");
        } else {
            System.out.println("Nilai C: False");
        }
        if (tes <= 69) {
            System.out.println("Nilai D: True");
        } else {
            System.out.println("Nilai D: False");
        }
    }
}
