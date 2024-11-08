import java.util.Scanner;
public class day_sixtyeight_coding {
    public int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan angka pertama : ");
        int angka1 = sc.nextInt();
        
        System.out.print("Masukkan angka kedua : ");
        int angka2 = sc.nextInt();
        
        day_sixtyeight_coding apa = new day_sixtyeight_coding();
        int result = apa.add(angka1, angka2);
        
        System.out.println("Hasil penjumlahan : " + result);
        
        sc.close();
    }
    
}
