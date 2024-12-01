package OneHundred_Days_Coding;
import java.util.Scanner;
public class day_ninetyone_coding {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Masukkan sebuah bilangan: ");
   
            if (scanner.hasNextInt()) {
                int angka = scanner.nextInt();
                
                if (angka % 2 == 0) {
                    System.out.println("Pesan genap");
                } else {
                    System.out.println("You and I, end");
                    break; 
                }
            } 
        }

    }
}
