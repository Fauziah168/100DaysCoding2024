import java.util.Scanner;
public class day_fiftyone_coding {
    
    public static void main(String[] args) {
        Scanner say = new Scanner(System.in);
        System.out.println("Percabangan");
        
        System.out.print("Masukkan warna : ");
        String warna = say.nextLine();
        
        switch (warna) {
            case "merah":
                System.out.println("warnanya adalah merah");
                break;
            case "kuning":
                System.out.println("warnanya adalah kuning");
                break;
            case "hijau":
                System.out.println("warnanya adalah hijau");
                break;
            case "biru":
                System.out.println("warnanya adalah biru");
                break;
            case "ungu":
                System.out.println("warnanya adalah ungu");
                break;
            default:
                System.out.println("Warna tidak tersedia");
        }
    }
}
