public class day_seventy_coding {
    
    // Method dengan parameter 'nama'
    public void sapa(String nama) {
        System.out.println("Halo, " + nama + " !");
    }
    
    public static void main(String[] args) {
        day_seventy_coding contoh = new day_seventy_coding();
        contoh.sapa("Fauziah");  // Memanggil method dengan argumen 'Fauziah'
        contoh.sapa("yanto");     // Memanggil method dengan argumen 'Budi'
        contoh.sapa("yaya");
        contoh.sapa("gopal");
    }
}

