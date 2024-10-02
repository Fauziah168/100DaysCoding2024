public class day_thirty_one_coding {
    
    public static void main(String [] args){
        System.out.println("konversi String ke tipe data primitif");
        
        //String ke integer
        String a = "200";
        int angka1 = Integer.parseInt(a);
        System.out.println(angka1);
        
        //String ke double
        String b = "123.45";
        double angka2 = Double.parseDouble(b);
        System.out.println(angka2);
        
        //String ke boolean
        String c = "true";
        boolean nilai = Boolean.parseBoolean(c);
        System.out.println(nilai);
        
        //String ke char
        String d = "A";
        char karakter = d.charAt(0);  
        System.out.println(karakter);   
    }
}
