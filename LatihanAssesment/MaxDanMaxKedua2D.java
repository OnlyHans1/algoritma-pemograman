package LatihanAssesment;

public class MaxDanMaxKedua2D {
    public static void main(String[] args) {

        for(int i = 0; i < 3; i++){
            for(int j = 0; i < 3; i++){

            }
        }

        int max1 = ;
        int max2 = ;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < data[i].length; j++) {
                int nilai = data[i][j];

                if (nilai > max1) {
                    max2 = max1;
                    max1 = nilai;
                } else if (nilai < max1 && nilai > max2) {
                    max2 = nilai;
                }
            }
        }

        System.out.println("Nilai Terbesar        : " + max1);
        System.out.println("Nilai Terbesar Kedua  : " + max2);
    }
}

