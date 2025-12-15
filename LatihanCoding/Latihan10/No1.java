package Latihan10;

/*
    Menurut catatan sejarah, terdapat beberapa gunung api di Indonesia yang selalu meletus setiap x atau y tahun sekali (x < y). Untuk kurun n tahun, 
    berapa kalikah gunung ini akan meletus jika frekuensi meletusnya bergantian antara x dan y tahun, dengan meletus pertama kali pada tahun ke-x? 
    Buatlah fungsi dalam bahasa Java untuk menghitung jumlah letusan gunung tersebut. 

    Masukan berupa bilangan bulat x, y, dan n. 
    keluaran berupa bilangan bulat yang menyatakan jumlah letusan.
*/

import java.util.Scanner;

public class No1 {
    public static int hitungLetusan(int x, int y, int n){
        int tahun = 0;
        int hitung = 0;
        boolean pakaiX = true;
        
        while (true){
            if (pakaiX){
                tahun += x;
            } else {
                tahun += y;
            }
            
            if (tahun > n){
                break;
            }
            
            hitung++;
            pakaiX = !pakaiX;
        }
        
        return hitung;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = sc.nextInt();
        
        System.out.println(hitungLetusan(x, y, n));
    }
}
