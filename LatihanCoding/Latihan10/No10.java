package Latihan10;

/*
    Buatlah sebuah program untuk menampilkan pola bintang, hanya untuk angka genap dengan menggunakan fungsi rekursif. N adalah input dari user.

    Masukan Sebuah bilangan bulat N.
    Keluaran Pola bintang yang hanya menampilkan baris dengan jumlah bintang sesuai bilangan genap hingga N.
*/

public class No10 {
    public static String printStars(int N, int i, int j, String result) {
        if (i > N) {
            return result;
        }

        String newResult = result;

        if (i % 2 == 0) {
            if (j < i) {
                newResult = result + "*";
                return printStars(N, i, j + 1, newResult);
            } else {
                newResult = result + "\n";
                return printStars(N, i + 1, 0, newResult);
            }
        }
        return printStars(N, i + 1, 0, result);
    }
}
