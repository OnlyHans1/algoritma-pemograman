package TP11;

import java.util.Scanner;

class Makanan{
    public static int makanKarbo(int porsi, int kaloriPerPorsi){
        return porsi * kaloriPerPorsi;
    }

    public static int makanProtein(int porsi, int kaloriPerPorsi){
        return porsi * kaloriPerPorsi;
    }

    public static int makanCemilan(int porsi, int kaloriPerItem){
        return porsi * kaloriPerItem;
    }
}

public class No2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("");
        int porsiKarbo = a.nextInt();
        System.out.print("");
        int kalKarbo = a.nextInt();

        System.out.print("");
        int porsiProtein = a.nextInt();
        System.out.print("");
        int kalProtein = a.nextInt();

        System.out.print("");
        int jmlCemilan = a.nextInt();
        System.out.print("");
        int kalCemilan = a.nextInt();

        int karbo = Makanan.makanKarbo(porsiKarbo, kalKarbo);
        int protein = Makanan.makanProtein(porsiProtein, kalProtein);
        int cemilan = Makanan.makanCemilan(jmlCemilan, kalCemilan);
        int kalori = karbo + protein + cemilan;

        System.out.println(kalori);
    }
}
