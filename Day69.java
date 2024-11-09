public class day_sixtynine_coding {
    public static void main(String[] args) {
        int a = 6;
        
         for (int i = a; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " "); // Menampilkan karakter * pada setiap baris
            }
            System.out.println(); // Pindah ke baris berikutnya setelah setiap baris selesai
         }

    }
}
