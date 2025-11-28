package TP12;
import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        int[] bil = new int[11];

        for (int i = 0; i < 11; i++){
            bil[i] = a.nextInt();
        }
        int pembanding = bil[10];

        for (int i = 0; i < 10; i++){
            if (bil[i] > pembanding){
                System.out.println(bil[i] + " is greater than " + pembanding);
            } else if (bil[i] < pembanding){
                System.out.println(bil[i] + " is less than " + pembanding);
            } else {
                System.out.println(bil[i] + " is equal to " + pembanding);
            }
        }
    }
}
