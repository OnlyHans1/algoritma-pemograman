/* Buatlah program dalam bahasa java untuk mencetak nilai boolean
   Masukan berupa boolean true atau false
   Keluaran berupa boolean true atau false
*/


import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Kondisi: ");
        boolean kondisi = input.nextBoolean();

        System.out.println("Kondisi yang anda input: " + kondisi);
    }
}
