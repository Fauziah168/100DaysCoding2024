public class day_fortythree_coding {
    
    public static void main(String[] args) {
        System.out.println("Operator Perbandingan");
        int z = -10;
        int y = 5;
        
        // Lebih besar sama dengan
        System.out.println(z >= -1);
        System.out.println(y >= 3);
        System.out.println(y >= (z *= -2));
        
        // Lebih kecil sama dengan
        System.out.println(z <= 30);
        System.out.println(y <= -1);
        System.out.println(-z <= (y += 10));
    }
    
}
