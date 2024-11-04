public class day_sixtyfour_coding {
    
    public static void main(String[] args) {
        System.out.println("break label");
        
        loopLuar: 
        for (int a = 1; a <= 5; a++) {
            System.out.println("Loop luar(a) : " + a);
            for (int b = 1; b <= 5; b++) {
                System.out.println("  Loop dalam(b) : " + b);
                if (a == 3 && b == 3) {
                    System.out.println("Loop selesai");
                    break loopLuar;
                }
            }
        }
    }
}
