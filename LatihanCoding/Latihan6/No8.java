package Latihan6;

import java.util.Scanner;

public class No8 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int ganjil = 0;

        while (a.hasNextInt()){
            int dadu1 = a.nextInt();
            int dadu2 = a.nextInt();

            if (dadu1 % 2 == 0 && dadu2 % 2 == 0){
                break;
            }

            if (dadu1 % 2 == 1 && dadu2 % 2 == 1){
                ganjil++;
            }

            System.out.println(ganjil);
        }
    }
}
