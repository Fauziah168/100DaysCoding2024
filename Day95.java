public class day_ninetyfive_coding {
    
    public static void main(String[] args) {
        int n = 5; 
        
        for (int a = 1; a <= n ; a++) {
            
            for (int b = 1; b <= a; b++) {
                System.out.print("*");
            }
            
            for (int c = 1; c <= n - a; c++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= n - a; c++) {
                System.out.print(" ");
            }
            for (int d = 1; d <= a; d++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
