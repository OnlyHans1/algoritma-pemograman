package TP11;

import java.util.Scanner;

class segitiga{
    public static boolean segitigaSah(int a, int b, int c){
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static boolean segitigaSamaSisi(int a, int b, int c){
        return a == b && b == c;
    } 

    public static boolean segitigaSamaKaki(int a, int b, int c){
        return (a == b && b != c) || (a == c && c != b) || (b == c && c != a);
    }

    public static boolean segitigaSikuSiku(int a, int b, int c){
        return (a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a);
    }
}

public class No3 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("");
        int sisiA = a.nextInt();
        System.out.print("");
        int sisiB = a.nextInt();
        System.out.print("");
        int sisiC = a.nextInt();

        boolean samaSisi = segitiga.segitigaSamaSisi(sisiA, sisiB, sisiC);
        boolean samaKaki = segitiga.segitigaSamaKaki(sisiA, sisiB, sisiC);
        boolean sikuSiku = segitiga.segitigaSikuSiku(sisiA, sisiB, sisiC);

        System.out.println("Segitiga sama sisi: " + samaSisi);
        System.out.println("Segitiga sama kaki: " + samaKaki);
        System.out.println("Segitiga siku siku: " + sikuSiku);
    }
}
