package Latihan7;

import java.util.Scanner;

public class No5 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        int n = a.nextInt();
        int jumlah = 0;

        for (int i = 1; i <= n; i++){
            jumlah += 2 * i;
        }

        System.out.println(jumlah);
    }
}
