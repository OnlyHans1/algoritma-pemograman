package LatihanAssesment;

class MinMax {

    void cariMinMax(int[] data) {
        int min = data[0];
        int max = data[0];
        int i = 1;

        while (i < data.length) {
            if (data[i] < min) {
                min = data[i];
            }
            if (data[i] > max) {
                max = data[i];
            }
            i++;
        }

        System.out.println("Nilai Minimum : " + min);
        System.out.println("Nilai Maksimum: " + max);
    }
}

public class Main {
    public static void main(String[] args) {
        int[] angka = {70, 68, 58, 57};

        MinMax mm = new MinMax();
        mm.cariMinMax(angka);
    }
}

