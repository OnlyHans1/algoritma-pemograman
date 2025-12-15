package Latihan10;

/*
    Buatlah fungsi dalam bahasa Java untuk mengubah huruf besar dalam sebuah string menjadi huruf kecil. 
    Buatlah prosedur rekursif lowercase menampilkan suatu string dengan semua hurufnya berupa huruf kecil

    Masukan suatu string dengan semua hurufnya kapital
    Keluaran menampilkan string dengan semua hurufnya berupa huruf kecil
*/

public class No2 {
    public static void lowercase(String s, int n) {
        if (n > 0) {
            lowercase(s, n - 1);
            System.out.print((char) (s.charAt(n - 1) + 32));
        }
    }
}
