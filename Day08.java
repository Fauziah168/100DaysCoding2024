public class day_eight_coding {
    
    public static void main(String[] args) {
        System.out.println("Membuat variable update");
        /*update variable
         1. Integer (int)*/
        int umur = 18;
        System.out.println("Umur: " + umur);
        umur = 28;
        umur += 12;
        System.out.println("Umur setelah update: " + umur);
        
        double nilai = 91.87;
        System.out.println("Nilai: " + nilai);
        nilai = 95.77;
        nilai /= 2;
        System.out.println("Nilai setelah update: " + nilai);
        
        char jenis_kelamin = 'P';
        System.out.println("Jenis kelamin : " + jenis_kelamin);
        jenis_kelamin = 'L';
        System.out.println("Jenis kelamin setelah update: " + jenis_kelamin);
        
        boolean status_lulus = true;
        System.out.println("Status lulus : " + status_lulus);
        status_lulus = false;
        System.out.println("Status lulus setelah update : " + status_lulus);
        
        String alamat = "wajo,sulawesi selatan";
        System.out.println("Alamat : " + alamat);
        alamat = "Jln.Hasanuddin";
        alamat += "Kec.banggai timur,kab.majene,provinsi sulawesi barat";
        System.out.println("Teks setelah update: " + alamat);
    }
}
