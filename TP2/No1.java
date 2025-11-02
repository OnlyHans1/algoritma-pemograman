package TP2;
import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("");
        int ang1 = a.nextInt();

        System.out.print("");
        int ang2 = a.nextInt();

        int hasil = ang1 % ang2;
        System.out.println(hasil);
    }
}
