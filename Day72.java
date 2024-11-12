public class day_seventytwo_coding {
    public static int faktorial(int angka) {
        if (angka <= 1) {
            return 1;
        } else {
            return angka * faktorial(angka - 1);
        }
    }
    public static void main(String[] args) {
        int angka2 = 5;
        System.out.println("Faktorial dari " + angka2 + " adalah : " + faktorial(angka2));
    }
    
}
