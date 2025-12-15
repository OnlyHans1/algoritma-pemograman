package Latihan10;

/*
   Buatlah fungsi dalam bahasa Java bernama faktor untuk menentukan apakah bilangan bulat a merupakan faktor dari bilangan bulat b atau bukan. Fungsi memiliki dua buah parameter berjenis bilangan bulat dan mengembalikan nilai berupa boolean.
   Fungsi dipanggil dalam sebuah program dengan masukan dan keluaran sebagai berikut:

   Masukan berupa sebuah bilangan bulat.
   Keluaran boolean true bila bilangan masukan a adalah faktor dari b atau false bila bukan.

   Catatan: Bilangan bulat a merupakan faktor dari b bila b habis dibagi a.
*/

import java.util.Scanner;

public class No4 {
    public static boolean faktor(int a, int b){
        return b % a == 0;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println(faktor(a, b));
    }
}
