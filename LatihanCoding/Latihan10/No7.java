package Latihan10;

/*
    Buatlah prosedur lebihKecil untuk menentukan bilangan yang lebih kecil.
  
    Masukan berupa dua buah bilangan bulat yang berbeda.
    Keluaran mencetak bilangan masukan yang lebih kecil.
*/

import java.util.Scanner;

public class No7 {
    public static void lebihKecil(int b1, int b2) {
        /*
        I.S.: Terdefinisi dua buah bilangan bulat yang berbeda
        F.S.: Tercetak bilangan masukan yang lebih kecil
        */
        System.out.println(b1 < b2 ? b1 : b2);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b1 = scanner.nextInt();
        int b2 = scanner.nextInt();
        lebihKecil(b1, b2);
        scanner.close();
    }
}
