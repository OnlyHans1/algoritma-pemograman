import java.util.Scanner;

public class No3 {
    public static boolean beasiswaPenuh(double ipk, double penghasilan){
        return (ipk >= 3.75 && penghasilan <= 5);
    }

    public static boolean beasiswaParsial(double ipk, double penghasilan){
        return (ipk >= 3.25 && ipk < 3.75 && penghasilan > 5 && penghasilan <= 10);
    }

    public static boolean tidakDapatBeasiswa(double ipk, double penghasilan){
        return (ipk < 3.25 || penghasilan > 10);
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("");
        double ipk = a.nextDouble();
        System.out.print("");
        double penghasilan = a.nextDouble();

        if (beasiswaPenuh(ipk, penghasilan)){
            System.out.println("Beasiswa Penuh");
        } else if (beasiswaParsial(ipk, penghasilan)){
            System.out.println("Beasiswa Parsial");
        } else if (tidakDapatBeasiswa(ipk, penghasilan)){
            System.out.println("Tidak Dapat Beasiswa");
        }
    }
}
