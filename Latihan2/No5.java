/* Buatlah program java yang menyimpan nama dan usia seseorang dalam variabel, lalu tampilkan dalam format berikut
 * Nama: John Doe
 * Usia: 25 tahun
 
 Hasil yang diharapkan: 
 * Nama: John Doe
 * Usia: 25 tahun
 
 Gunakan variabel yang sesuai untuk menyimpan data nama dan usia!
*/


import java.util.Scanner;

public class No5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Usia Anda: ");
        int usia = input.nextInt();

        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia + " tahun");
    }
}
