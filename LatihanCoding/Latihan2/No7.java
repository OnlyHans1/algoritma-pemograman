/* Buatlah program dalam bahasa Java untuk memeriksa apakah huruf yang diinputkan termasuk huruf mati(konsonan) atau bukan 
   b,c,d,f,g,h,j,k,l,m,n,p,q,r,s,t,v,w,x,y,z

   Masukan berupa sebuah huruf(karakter)
   Keluaran berupa boolean true jika huruf termasuk konsonan atau false jika bukan

   Catatan: Masukan selalu dalam huruf kecil
*/
package Latihan2;

import java.util.Scanner;

public class No7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan huruf: ");
        char huruf = input.next().charAt(0);

        if (huruf == 'a' ||  huruf == 'i' || huruf == 'u' || huruf == 'e' || huruf == 'o') {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
}
