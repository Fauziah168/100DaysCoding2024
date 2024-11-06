public class day_sixtysix_coding {
    
    public static void main(String[] args) {
        System.out.println("pola persagi dan persegi panjang");
        int sisi = 5;
        
        for (int a = 0; a < sisi; a++) {
            for (int b = 0; b < sisi; b++){
                System.out.print("∆ ");
            }
            System.out.println();
        }
        System.out.println(" ");
        
        int panjang = 10;
        int lebar = 5;
        
        for(int c = 0; c < lebar; c++) {
            for(int d = 0; d < panjang; d++){
                System.out.print("~ ");
            }
            System.out.println();
        }
    }
    
}
