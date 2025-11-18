import java.util.Scanner;

public class No1 {
    public static int jumlahBus (int penumpang, int kapasitasBus){
        return (penumpang + kapasitasBus - 1) / kapasitasBus;
    }    

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("");
        int n = a.nextInt();

        System.out.print("");
        int m = a.nextInt();

        int hasil = jumlahBus(n, m);
        System.out.println(hasil + " bus");
    }
}
