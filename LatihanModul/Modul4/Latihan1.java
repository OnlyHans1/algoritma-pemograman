package Modul4;
import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nilai dari Rian SW Bootcamp");
        System.out.print("Masukkan Nilai Java: ");
        int java = input.nextInt();
        System.out.print("Masukkan Nilai SQL: ");
        int sql = input.nextInt();
        System.out.print("Masukkan Nilai Servlet & JSP: ");
        int servlet = input.nextInt();

        System.out.println("Nilai Akhir dari Rian SW Bootcamp: \nJava: " + java + "\nSQL: " + sql + "\nServlet & JSP: " + servlet);
    }
}
