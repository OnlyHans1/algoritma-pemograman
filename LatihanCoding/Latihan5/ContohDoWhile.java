import java.util.Scanner;

// public class ContohDoWhile {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int angka;

//         do {
//             System.out.print("Masukkan angka (0 untuk berhenti): ");
//             angka = input.nextInt();
//         } while (angka != 0);

//         System.out.println("Program selesai.");
//     }
// }


// public class ContohDoWhile {

//     public static void main(String[] args) {
//         Scanner a = new Scanner(System.in);
//         int angka;
//         int total = 0;

//         do {
//             System.out.print("Masukkan harga barang: ");
//             angka = a.nextInt();
            
//             total += angka;
//         } while (angka != 0);
//             System.out.print("Total belanja: " + total);
//     }
// }

public class ContohDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String passwordBenar = "12345";
        String password;
        int percobaan = 0;
        boolean berhasil = false;

        do {
            System.out.print("Masukkan password: ");
            password = input.nextLine();
            percobaan++;

            if (password.equals(passwordBenar)) {
                berhasil = true;
                break;
            } else {
                System.out.println("Password salah!");
            }
        } while (percobaan < 3);

        if (berhasil) {
            System.out.println("Selamat datang!");
        } else {
            System.out.println("Akses ditolak.");
        }
    }
}