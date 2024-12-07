
package OneHundred_Days_Coding;
import java.util.Scanner;
public class day_ninetyseven_coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Angka : ");
        int a = sc.nextInt();
        
        System.out.println("Bilangan prima dari 1 hingga " + a + " : ");
        for (int b = 2; b <= a; b++) {
            boolean prime = true;
            for (int c = 2; c <= Math.sqrt(b); c ++) {
                if (b % c == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(b + " ");
            }
        }
        System.out.println();
    }
}

