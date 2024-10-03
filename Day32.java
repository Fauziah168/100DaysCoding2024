public class day_thirtytwo_coding {
    
    public static void main(String[] args) {
        System.out.println("konversi tipe data primitif ke String");
        /*untuk melakukan konversi dari tipe data primitif ke String
          terdapat tiga cara*/
        //to.String
        int angka1 = 42;
        String a = Integer.toString(angka1);
        System.out.println(a);
        
        double angka2 = 3.14;
        String b = Double.toString(angka2);
        System.out.println(b);
        
        //valueOf
        short angka3 = 42;
        String c = String.valueOf(angka3);
        System.out.println(c);

        float angka4 = 12.54f;
        String d = String.valueOf(angka4);
        System.out.println(d);
        
        //operator (+)
        boolean status = true;
        String e = status + "";
        System.out.println(e);

        char karakter = '&';
        String f = karakter + "";
        System.out.println(f);
    }
    
}
