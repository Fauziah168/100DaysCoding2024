
package OneHundred_Days_Coding;
import java.util.Scanner;
public class day_eightyeight_coding {
    public static void main(String[] args) {
        final double phi = 3.14;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jari-jari : ");
        double jariJari = scanner.nextDouble();

        System.out.print("Masukkan tinggi : ");
        double tinggi = scanner.nextDouble();
        double volume = phi * jariJari * jariJari * tinggi;

        System.out.printf("Volume tabung adalah %.2f m kubik\n", volume);
    }
}
   
