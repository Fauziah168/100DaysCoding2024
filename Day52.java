import java.util.Scanner;
   public class day_fiftytwo_coding{
       
       public static void main(String[] args){
           Scanner nt = new Scanner(System.in);
           System.out.println("Ternary");
        
           System.out.println("Masukkan angka : ");
           int angka = nt.nextInt();
           
           String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";
        
           System.out.println(angka + " adalah angka " + hasil);
    
       }
   }
