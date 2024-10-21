import java.util.Scanner;
public class day_fifty_coding {
    
    public static void main(String[] args) {
        System.out.println("Percabangan");
        Scanner anjay = new Scanner(System.in);
        
        System.out.print("Masukan angka yang kamu mau :");
        int k = anjay.nextInt();
        
        if (k %3 == 0) {
            System.out.println(k + " adalah kelipatan 3");
        } else if (k %10 == 0) {
            System.out.println(k + " adalah kelipatan 10");
        } else {
            System.out.println(k + " adalah bilangan goib");
        }
    }
    
}
