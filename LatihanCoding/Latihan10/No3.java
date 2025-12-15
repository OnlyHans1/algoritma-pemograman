package Latihan10;

/*
    Buatlah prosedur untuk menentukan apakah seseorang akan berangkat dari rumahnya atau diam saja di rumahnya berdasarkan pohon keputusan dalam gambar di bawah.

    Masukan terdiri dari 2 buah string yang menyatakan status turunnya hujan ("ya" bila turun hujan atau "tidak" bila tidak turun hujan) dan status membawa ("ya" bila membawa payung atau "tidak" bila tidak membawa).
    Keluaran mencetak string "berangkat" bila hujan turun atau membawa payung, atau "diam di rumah" bila tidak memenuhi kondisi tersebut.  
*/

import java.util.Scanner;

public class No3 {
    public static void keputusan(String hujan, String payung){
        if (hujan.equals("ya") && payung.equals("tidak")){
            System.out.println("diam di rumah");
        } else {
            System.out.println("berangkat");
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String hujan = sc.next();
        String payung = sc.next();
        
        keputusan(hujan, payung);
    }
}
