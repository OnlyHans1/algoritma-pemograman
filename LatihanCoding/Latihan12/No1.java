package Latihan12;

/*
    Sekelompok mahasiswa yang terdiri dari empat orang telah mendapat hasil ujian pada sebuah mata kuliah dan ingin mencari nilai tertinggi antar-mereka berempat. 
    Buatlah sebuah function dengan nama searchMax yang mempunyai satu parameter, yaitu array T[N] berisi nilai ujian keempat mahasiswa tersebut dalam bilangan real. 

    Masukkan terdiri dari empat bilangan yang merupakan nilai hasil ujian empat orang mahasiswa.
    Keluaran berupa nilai tertinggi dari keempat nilai yang telah diinputkan.
*/

import java.util.Scanner;

public class No1 {
    static final int N = 1000;

    public static double searchMax(double[] T) {
        double max = T[0];
        for (int i = 1; i < T.length; i++) {
            if (T[i] > max) {
                max = T[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        double[] T = new double[4];

        for (int i = 0; i < 4; i++) {
            T[i] = a.nextDouble();
        }

        System.out.printf("%.1f", searchMax(T));
    }
}
