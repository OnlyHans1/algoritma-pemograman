/* 
    Buatlah program dalam Bahasa Java untuk mencetak karakter yang dimasukkan.
    Masukkan berupa sebuah karakter.
    Keluaran berupa sebuah karakter sebagaimana contoh.
    Petunjuk: Gunakan Scanner.next().charAt(0) untuk pembacaan masukan dan System.out.printf() untuk pencetakan
 */


import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Char: ");
        char huruf = input.next().charAt(0);

        System.out.printf("%c ", huruf);
    }
}
