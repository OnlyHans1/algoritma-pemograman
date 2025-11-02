package TP2;
import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Masukkan jumlah mil: ");
        double mil = a.nextDouble();

        double km = mil * 1.6;
        System.out.println(mil + "mil sama dengan " + km + " kilometer");
    }
}
