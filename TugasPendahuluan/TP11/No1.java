package TP11;

import java.util.Scanner;

class busPandemi{
    public static double persentase(int penumpang, int kapasitas){
        return (double) penumpang / kapasitas * 100;
    }

    public static boolean berangkat(int penumpang, int kapasitas){
        double persen = persentase(penumpang, kapasitas);
        return persen >= 50 && persen <= 75;
    }
}

public class No1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("");
        int kapasitas = a.nextInt();
        System.out.print("");
        int penumpang = a.nextInt();

        boolean status = busPandemi.berangkat(penumpang, kapasitas);

        System.out.println((status ? "berangkat" : "tidak berangkat"));
    }
}
