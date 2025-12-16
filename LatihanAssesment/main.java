package LatihanAssesment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nilai = new int[5];
        int i = 0;

        while (i < 5) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
            i++;
        }

        i = 0;
        System.out.println("\nData nilai:");
        while (i < 5) {
            System.out.println(nilai[i]);
            i++;
        }
    }
}

