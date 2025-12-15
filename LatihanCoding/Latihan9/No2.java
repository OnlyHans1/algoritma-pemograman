package Latihan9;

/*
    Buatlah prosedur cetak untuk mencetak string sebanyak n kali dengan menggunakan struktur perulangan. 
    Prosedur dipanggil dalam program dengan masukan (in) dan keluaran sebagai berikut:

    Masukan berupa sebuah bilangan bulat, n, yang menyatakan banyaknya pencetakan dan sebuah string yang akan dicetak.
    Keluaran berupa string sebanyak n kali. 
*/

import java.util.Scanner;

public class No2 {
    public static void cetak(int n, String x) {
        for (int i = 0; i < n; i++) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String x = scanner.next();
        cetak(n, x);
        scanner.close();
    }
}
