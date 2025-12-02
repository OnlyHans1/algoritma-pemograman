package Latihan6;

import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        String kata = a.nextLine();

        int hitung = 0;
        for (int i = 0; i < kata.length() - 1; i++){
            if (kata.charAt(i) == 'g' && kata.charAt(i + 1) == 'o'){
                hitung++;
            }
        }

        System.out.println(hitung);
    }
}
