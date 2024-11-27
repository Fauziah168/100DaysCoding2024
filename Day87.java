public class day_eightyseven {
    
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        
        int b = 2; 
        int nilaiBaru = 33; 
        a[b] = nilaiBaru;
        
        System.out.println("Array setelah perubahan:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
