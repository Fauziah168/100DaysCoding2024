import java.util.Scanner;
public class day_fortyone_coding {
  
    public static void main(String[] args) {    
    Scanner sc = new Scanner(System.in);
    //soal 1
        // membuat input jari-jari
        System.out.print("Input jari-jari : ");
        int jr = sc.nextInt();
        
        // membuat input satuan
        sc.nextLine();
        System.out.print("Input satuan : ");
        String st = sc.nextLine();
        
        // penetapan konstanta PI
        final float pi = 3.14159f;
        // rumus mengukur keliling
        double keliling = 2 * pi * jr;
        // rumus mengukur luas
        double luas = pi * jr * jr;
        
        System.out.println("=========================Hasil=========================");
        System.out.println("jari-jari : " + jr + " " + st);
        System.out.printf("Keliling : %.3f %s %n",keliling , st);
        System.out.printf("Luas : %.3f %s^2 %n",luas , st);
        
        sc.close();
        
        //soal 2
        int a = 15;
        int b = 20;
        
        System.out.println(b);
        b %= a;
        System.out.println(b);
        b *= a;
        System.out.println(b);
        b -= a;
        System.out.println(b);
        b /= a;
        System.out.println(b);
        b += a;
        System.out.println(b);
    } 
    
}
