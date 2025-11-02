/* 
    Buatlah program dalam bahasa Java yang menampilkan beberapa statistik penting sebagai berikut
    Hasil yang diharapkan:
    * Jarak Matahari ke bumi: 150,000,000
    * Peluang memenangkan lotre: 1.235E-7
    * Jumlah penduduk dunia: 6,973,783,433
    * Apakah data di atas sudah benar? true
   
    Pastikan untuk menggunakan tipe data yang tepat agar hasil yang ditampilkan sesuai
*/


public class No2 {
    public static void main(String[] args) {
        int jarak = 150_000_000;
        double peluang = 1.235E-7;
        long penduduk = 6_973_783_433L;
        boolean data = true;

        System.out.println("Jarak Matahari ke bumi: " + jarak);
        System.out.println("Peluang memenangkan lotre: " + peluang);
        System.out.println("Jumlah penduduk dunia: " + penduduk);
        System.out.println("Apakah data diatas sudah benar? " + data);
    }
}
