package OneHundred_Days_Coding;
public class day_ninetysix_coding {
    public static void main(String[] args) {
        int tinggi = 5;
        
        for (int a = 1; a <= tinggi; a++) {
            for (int b= 1; b <= tinggi - a; b++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= a; c++) {
                System.out.print("*");
            }
           for (int d = 1; d <= a; d++) {
               System.out.print("*");
           }
            System.out.println();
        }
        
        for (int e = tinggi; e >= 1; e--) {
            for (int f = 1; f <= tinggi - e; f++) {
                System.out.print(" ");
            }
            for (int g = 1; g <= e; g++) {
                System.out.print("*");
            }
            for (int h = 1; h <= e; h++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
