import java.util.Scanner;

public class No2 {
    public static double math(int x, int y){
        double rumus1 = (5.0 * x) / (3.0 * y);
        double rumus2 = rumus1 * (15.0 * y);
        return Math.sqrt(rumus2);
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("");
        int b = a.nextInt();
        System.out.print("");
        int c = a.nextInt();

        double z1 = math(b, c);
        double z2 = math(c, b);

        System.out.printf("%.3f %.3f\n", z1, z2);
    }
}
