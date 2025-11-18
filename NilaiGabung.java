import java.util.Scanner;

public class NilaiGabung {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Masukkan nilai Anda: ");
        int nilai = a.nextInt();

        char grade;

        // Tentukan grade dengan if-else
        if (nilai >= 90) {
            grade = 'A';
        } else if (nilai >= 80) {
            grade = 'B';
        } else if (nilai >= 70) {
            grade = 'C';
        } else if (nilai >= 60) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        // Gunakan switch-case untuk menampilkan deskripsi
        switch (grade) {
            case 'A':
                System.out.println("Nilai Anda: A (Sangat Baik)");
                break;
            case 'B':
                System.out.println("Nilai Anda: B (Baik)");
                break;
            case 'C':
                System.out.println("Nilai Anda: C (Cukup)");
                break;
            case 'D':
                System.out.println("Nilai Anda: D (Kurang)");
                break;
            case 'E':
                System.out.println("Nilai Anda: E (Gagal)");
                break;
        }
    }
}
