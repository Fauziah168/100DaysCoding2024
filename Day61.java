import java.util.Scanner;
public class day_sixtyone_coding {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    while(true) {
        System.out.print("Masukkan angka pertama : ");
        int a = sc.nextInt();
        
        System.out.print("Masukkan angka kedua : ");
        int b = sc.nextInt();
        
        if (a == 0 && b == 0) {
            System.out.println("Loop berhenti.");
            break;
        }
        System.out.println("hasil : " + (a+b));
    }
 }
}
    
