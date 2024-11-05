public class day_sixtyfive_coding {
    
    public static void main(String[] args) {
        System.out.println("nested loop");
        
        for(byte a = 1; a <= 3; a++) {
            System.out.println("Judul " + a);
            for(byte b = 1; b <= 5; b++) {
                System.out.println("Isi " + b);
            }
        }
    }
    
}
