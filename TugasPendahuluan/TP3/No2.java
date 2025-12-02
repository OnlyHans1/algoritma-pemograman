package TP3;
import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Masukkan tahun: ");
        int tahun = a.nextInt();
        a.nextLine();

        System.out.print("Masukkan bulan: ");
        String bulan = a.nextLine();

        if (bulan.equals("Jan")  || bulan.equals("Mar") || bulan.equals("May") || bulan.equals("Jul") || bulan.equals("Aug") || bulan.equals("Oct")){
            System.out.println(bulan + " " + tahun + " Memiliki 31 Hari");
        } else if (bulan.equals("Apr") || bulan.equals("Jun") || bulan.equals("Sep") || bulan.equals("Nov")){
            System.out.println(bulan + " " + tahun + " Memiliki 30 Hari");
        } else if (bulan.equals("Feb")){
            if ((tahun % 400 == 0) || (tahun % 4 == 0 && tahun % 100 != 0)){
                System.out.println(bulan + " " + tahun + " Memiliki 29 Hari");
            } else {
                System.out.println(bulan + " " + tahun + " Memiliki 28 Hari");
            }
        } else {
            System.out.println(bulan + " Bukan nama bulan yang benar");
        }
    }
}
