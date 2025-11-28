package TP12;
import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        int[] nilai = new int[100];
        int jumlah = 0;

        while(true){
            int input = a.nextInt();
            if (input < 0) break;
            nilai[jumlah] = input;
            jumlah++;
        }

        double total = 0;
        for (int i = 0; i < jumlah; i++){
            total += nilai[i];
        }
        double rata = total / jumlah;

        int above = 0, equal = 0, below = 0;
        for (int i = 0; i < jumlah; i++){
            if (nilai[i] > rata){
                above++;
            } else if(nilai[i] == rata){
                equal++;
            } else {
                below++;
            }
        }

        System.out.println(above + " scores above the average!");
        System.out.println(equal+ " scores equal to the average!");
        System.out.println(below + " scores below the average!");
    }
}
