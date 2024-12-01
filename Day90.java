package OneHundred_Days_Coding;
import java.util.Scanner;
public class day_ninety_coding {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array : ");
        int a = sc.nextInt();

        int[] b = new int[a];

        System.out.println("Masukkan " + a + " elemen array:");
        for (int c = 0; c < a; c++) {
            System.out.print("Elemen ke-" + (c + 1) + ": ");
            b[c] = sc.nextInt();
        }

        System.out.println("Elemen array dalam urutan terbalik:");
        for (int d = a - 1; d >= 0; d--) {
            System.out.print(b[d] + " ");
        }


    }
}
