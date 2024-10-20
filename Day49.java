import java.util.Scanner;
public class day_fortynine_coding {
    
    public static void main(String[] args) {
        System.out.println("Percabangan");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan angka");
        int a = sc.nextInt();
        
        if (a > 0) {
            System.out.println("Angka positif");
        } else if (a < 0) {
            System.out.println("Angka negatif");
        }
    }
    
}
