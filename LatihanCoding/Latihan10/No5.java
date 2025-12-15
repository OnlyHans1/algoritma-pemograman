package Latihan10;

/*
    Buatlah fungsi dalam bahasa Java bernama sudutSegitiga untuk menentukan apakah tiga sudut yang dimasukkan membentuk segitiga atau tidak. Syarat agar dapat membentuk segitiga adalah penjumlahan ketiga sudut itu 180 derajat. 
    Fungsi akan memiliki 3 parameter dengan tipe bilangan bulat positif yang menyatakan sudut segitiga. Keluaran fungsi berupa boolean. Selanjutnya fungsi akan dipanggil dalam program dengan masukan dan keluaran sebagai berikut:

    Masukan berupa tiga buah bilangan bulat positif yang menyatakan sudut segitiga.
    Keluaran berupa boolean true jika membentuk segitiga, atau false jika tidak membentuk segitiga.
*/

import java.util.Scanner;

public class No5 {
    public static boolean sudutSegitiga(int a, int b, int c){
        return (a + b + c == 180);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        System.out.println(sudutSegitiga(a, b, c));
    }
}
