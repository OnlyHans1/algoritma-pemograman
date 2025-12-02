import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Masukkan Umur: ");
        int umur = a.nextInt();

        if (umur < 13 ) {
            System.out.println("Anak-anak");
        } else if (umur >= 13 && umur <= 17) {
            System.out.println("Remaja");
        } else if (umur >= 18 && umur <= 59)  {
            System.out.println("Dewasa");
        } else {
            System.out.println("Lansia");
        }
        
        
    }
}
