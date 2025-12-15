package Latihan9;

/*
    A adalah akar, B dan E adalah verteks dalam, sedangkan C, D, F, dan G adalah daun. 
    Buatlah prosedur cekJenisNode untuk menentukan jenis verteks berdasarkan pohon di atas.
    Prosedur dipanggil dalam program dengan masukan (in) dan keluaran sebagai berikut:

    Masukan berupa sebuah karakter yang menyatakan nama verteks ('A', 'B', .., 'G').
    Keluaran mencetak jenis verteks masukan ("akar", "daun", atau "verteks dalam"). 
*/

import java.util.Scanner;

public class No4 {
    public static void cekJenisNode(char v) {
        if (v == 'A'){
            System.out.println("akar");
        } else if (v == 'B' || v == 'E'){
            System.out.println("verteks dalam");
        } else if (v == 'C' || v == 'D' || v == 'F' || v == 'G'){
            System.out.println("daun");
        } else {
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char v = scanner.next().charAt(0);
        cekJenisNode(v);
        scanner.close();
    }
}
