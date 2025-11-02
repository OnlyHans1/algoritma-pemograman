
import java.util.Scanner;

// public class Percobaan {
//     public static void main(String[] args) {
//         Scanner a = new Scanner(System.in);

//         System.out.print("");
//         String kendaraan = a.nextLine().toLowerCase();
//         System.out.print("");
//         int lama = a.nextInt();

//         int tarif = 0;

//         if (kendaraan.equals("mobil")) {
//             if (lama == 1) {
//                 tarif = 3000;
//             } else if (lama > 1) {
//                 tarif = ((lama - 1) * 1000) + 3000;
//             }
//         } else if (kendaraan.equals("motor")) {
//             if (lama == 1) {
//                 tarif = 2000;
//             } else if (lama > 1) {
//                 tarif = ((lama - 1) * 500) + 2000;
//             }
//         }

//         System.out.println(tarif);
//     }
// }


// public class Percobaan {
//     public static void main(String[] args) {
//         Scanner a = new Scanner(System.in);

//         System.out.print("");
//         String b = a.nextLine();

//         b = b.toLowerCase();

//         if (b.equals("a") || b.equals("i") || b.equals("u") || b.equals("e") || b.equals("o")) {
//             System.out.println("Vokal");
//         } else {
//             System.out.println("Konsonan");
//         }
//     }
// }

// public class Percobaan {
//     public static void main(String[] args) {
//         Scanner a = new Scanner(System.in);

//         System.out.print("");
//         int umur = a.nextInt();

//         System.out.print("");
//         boolean kk = a.nextBoolean();

//         if (umur >= 17) {
//             if (kk == true){
//                 System.out.println("bisa membuat KTP");
//             } else if (kk == false) {
//                 System.out.println("belum bisa membuat KTP");
//             }
//         } else {
//             System.out.println("belum bisa membuat KTP");
//         }
//     }
// }

// public class Percobaan {
//     public static void main(String[] args) {
//         Scanner a = new Scanner(System.in);

//         int bil1 = a.nextInt();
//         int bil2 = a.nextInt();
//         int bil3 = a.nextInt();

//         int terbesar;

//         if (bil1 >= bil2 && bil1 >= bil3){
//             terbesar = bil1;
//         } else if (bil2 >= bil1 && bil2 >= bil3){
//             terbesar = bil2;
//         } else {
//             terbesar = bil3;
//         }

//         System.out.println(terbesar);
//     }
// }

// public class Percobaan {
//     public static void main(String[] args) {
//         Scanner a = new Scanner(System.in);

//         double ang1 = a.nextDouble();
//         double ang2 = a.nextDouble();
//         double ang3 = a.nextDouble();

//         double hasil = (ang2 * ang2) - (4 * ang1 * ang3);

//         if (hasil >= 0){
//             System.out.println("memiliki titik potong dengan sumbu-x");
//         } else {
//             System.out.println("tidak memiliki titik potong dengan sumbu-x");
//         }
//     }
// }

// public class Percobaan {
//     public static void main(String[] args) {
//         Scanner a = new Scanner(System.in);

//         String kata = a.nextLine().toLowerCase();

//         char awal = kata.charAt(0);
//         char akhir = kata.charAt(kata.length() - 1);

//         boolean vokalWal = (awal == 'a' || awal == 'i' || awal == 'u' || awal == 'e' || awal == 'o');
//         boolean vokalKir = (akhir == 'a' || akhir == 'i' || akhir == 'u' || akhir == 'e' || akhir == 'o');

//         if (vokalWal && vokalKir){
//             System.out.println("vokal di awal dan di akhir");
//         } else if (vokalWal) {
//             System.out.println("vokal di awal");
//         } else if (vokalKir) {
//             System.out.println("vokal di akhir");
//         } else {
//             System.out.println("tidak ada vokal");
//         }
//     }
// }

// public class Percobaan {
//     public static void main(String[] args) {
//         Scanner a = new Scanner(System.in);

//         int x = a.nextInt();
//         int y = a.nextInt();

//         if (x > 0 && y > 0){
//             System.out.println("1");
//         } else if (x < 0 && y > 0) {
//             System.out.println("2");
//         } else if (x < 0 && y < 0) {
//             System.out.println("3");
//         } else if (x > 0 && y < 0) {
//             System.out.println("4");
//         }
//     }
// }

public class Percobaan {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        int x = a.nextInt();

        int y = x / 1000;
        int z = x % 100;

        if (y % 2 != 0 && z % 2 == 0){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}