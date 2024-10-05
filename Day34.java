import java.util.Scanner;
public class day_thirtyfour_coding {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input dari Keyboard");
        
        System.out.print("Masukkan nama : ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan umur : ");
        int umur = input.nextInt();
        
        System.out.print("Masukkan berat badan : ");
        double bb = input.nextDouble();
        
        System.out.print("Masukkan tinggi badan : ");
        float tb = input.nextFloat();
        
        System.out.print("Masukkan jenis kelamin : ");
        char jk = input.next().charAt(0);
        
        System.out.print("Apakah kamu suka pemrograman? (true/false) : ");
        boolean jawaban = input.nextBoolean();
        
        System.out.println();
        System.out.println("~Bio Data~");
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
        System.out.println("Berat Badan : " + bb);
        System.out.println("Tinggi Badan : " + tb);
        System.out.println("Jenis Kelamin : " + jk);
        System.out.println("Apakah kamu suka pemrograman?");
        System.out.println("jawaban : " + jawaban);
    }
    
}
