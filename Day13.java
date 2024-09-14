public class day_thirteen_coding {
    
    public static void main(String[] args) {
        System.out.println("Evaluasi mentor");
        /* membuat deklarasi variable dengan nama
           variable var1 dengan tipe data integer
           dan var2 dengan tipe data short dan final*/
        // tipe data integer(int) di gunakan untuk blngan bulat
        int var1;
        /* tipe data short di gunakan untuk bilangan bulat dengan 
           nilai dari -32.768 hingga 32.767*/
        /* final di gunakan agar variable yang kita buat 
           tidak dapat lagi di update*/
        final short var2;
        //inisialisasi pada variable var1 dan var2
        var1 = 10;
        var2 = 20;
        /* membuat inisialisasi dengan nama variable 
           var3 dengan tipe data string, var4 dengan 
         * tipe data byte dan var5 dengan tipe data short*/
        // tipe data string bisa di gunakan untuk teks,angka,dan simbol
        String var3 = "hello world";
        /*tipe data byte di gunakan untuk blngan bulat dengan nilai
          -128 sampai 127*/
        byte var4 = 58;
        short var5 = 2578;
        System.out.printf("Var1 : %d%n",var1);
        System.out.println("Var2 : " + var2);
        System.out.printf("Var3 : " + var3);
        System.out.printf("Var4 : " + var4);
        System.out.printf("Var5 : " + var5);
        
        // mengupdate variable
        var1 = 15;
        var3 = "hallo dunia";
        var4 = 67;
        var5 = 5827;
        System.out.printf("Var1 : %d%n",var1); 
        System.out.println("Var3 : " + var3);
        System.out.println("Var4 : " + var4);
        System.out.println("Var5 : " + var5);
        
    }
    
}
