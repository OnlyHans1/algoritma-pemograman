package Latihan6;

import java.util.Scanner;

public class No9 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);

        int x = z.nextInt();
        int y = z.nextInt();
        int a = z.nextInt();
        int b = z.nextInt();

        for (int i = x; i <= y; i++){
            String kata = String.valueOf(i);
            char digit1 = kata.charAt(0);
            char digit2 = kata.charAt(kata.length() - 1);
            if (digit1 == (char)(a + '0') || digit2 == (char)(b + '0')) continue;
            System.out.println(i);
        }
    }
}
