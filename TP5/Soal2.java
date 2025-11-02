import java.util.Scanner;

public class Soal2 {
  public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
    
    System.out.print("Masukkan Nama Mahasiswa: ");
    String nama = a.nextLine();

    System.out.print("Masukkan IPK: ");
    double nilai = a.nextDouble();

    if (nilai >= 3.50){
        System.out.println(nama + " layak mendapatkan beasiswa penuh");
    } else if (nilai >= 3.00 && nilai <= 3.49){
        System.out.println(nama + " layak mendapatkan beasiswa parsial");
    } else {
        System.out.println(nama + " belum memenuhi syarat beasiswa");
    }
  }  
}
