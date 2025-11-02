package Latihan6;

import java.util.Scanner;

public class No6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int menang1 = 0;
        int menang2 = 0;
        int menang3 = 0;
        
        System.out.println("");
        String input = scanner.nextLine().toUpperCase();
        
        int i = 0;
        while (i < input.length() - 2) {
            char pilihan1 = input.charAt(i);
            char pilihan2 = input.charAt(i + 1);
            char pilihan3 = input.charAt(i + 2);
            
            if (pilihan1 == '.' && pilihan2 == '.' && pilihan3 == '.') {
                break;
            }
            
            if ((pilihan1 != 'A' && pilihan1 != 'B') || 
                (pilihan2 != 'A' && pilihan2 != 'B') || 
                (pilihan3 != 'A' && pilihan3 != 'B')) {
                i++;
                continue;
            }
            
            if (pilihan1 != pilihan2 && pilihan2 == pilihan3) {
                menang1++;
            } else if (pilihan2 != pilihan1 && pilihan1 == pilihan3) {
                menang2++;
            } else if (pilihan3 != pilihan1 && pilihan1 == pilihan2) {
                menang3++;
            }
            
            i += 3;
        }
        
        System.out.println(menang1 + " " + menang2 + " " + menang3);
    }
}