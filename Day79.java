public class day_seventynine_coding {
    private String nama;
    private int usia;

    public day_seventynine_coding(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    @Override
    public String toString() {
        return "Mahasiswa { Nama: " + nama + ", Usia: " + usia + " }";
    }
}



public class day_seventynine2_coding {
    public static void main(String[] args) {
        day_seventynine_coding mhs = new day_seventynine_coding("Fauziah", 18);
        System.out.println(mhs.toString());
    }
}
