package Latihan10;

/*
    Sebuah tanki kosong dengan kapasitas tertentu akan diisi air menggunakan ember yang memiliki berbagai ukuran volume. Buatlah method dalam bahasa Java untuk mengisi tanki dari asalnya kosong hingga penuh. 

    Masukan terdiri dari beberapa baris. Baris pertama adalah sebuah bilangan bulat positif T yang menyatakan kapasitas tanki dalam satuan liter. T baris berikutnya, masing-masing adalah volume air dalam ember dimasukkan ke dalam tanki.
    Keluaran terdiri dari beberapa baris, yang masing-masing baris berisi boolean yang menyatakan tanki penuh (true) atau tidak (false) setiap kali pengisian tanki
*/

import java.util.Scanner;

public class No6 {
    public static void tanki(int kapasitas, Scanner sc) {
        int  isi = 0;
        
        while (sc.hasNextInt()){
            int ember = sc.nextInt();
            isi += ember;
            
            if (isi >= kapasitas){
                System.out.println(true);
                break;
            } else {
                System.out.println(false);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int kapasitas = sc.nextInt();
            tanki(kapasitas, sc);
        }
    }
}
