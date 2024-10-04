public class day_thirtythree_coding {
   
public static void main(String[] args) {
        System.out.println("Type casting");
        
        // Widening (Implicit Casting)
        byte mangga = 10;
        short jeruk = mangga;   // byte ke short
        int apel = jeruk;      // short ke int
        long strawberry = apel;      // int ke long
        float semangka = strawberry;   // long ke float
        double pepaya = semangka;  // float ke double

        System.out.println("Widening Casting:");
        System.out.println("byte ke short: " + jeruk);
        System.out.println("short ke int: " + apel);
        System.out.println("int ke long: " + strawberry);
        System.out.println("long ke float: " + semangka);
        System.out.println("float ke double: " + pepaya);
        
        // Narrowing (Explicit Casting)
        double durian = 9.78;
        float rambutan = (float) durian;  // double ke float
        long manggis = (long) rambutan;      // float ke long
        int buah_naga = (int) manggis;          // long ke int
        short kiwi = (short) buah_naga;     // int ke short
        byte jambu = (byte) kiwi;      // short ke byte

        System.out.println("\nNarrowing Casting:");
        System.out.println("double ke float: " + rambutan);
        System.out.println("float ke long: " + manggis);
        System.out.println("long ke int: " + buah_naga);
        System.out.println("int ke short: " + kiwi);
        System.out.println("short ke byte: " + jambu);
        
        // Casting char ke tipe numerik dan sebaliknya
        char salak1 = 'A';  
        int langsak1 = salak1;
        System.out.println("Char ke int: " + langsak1);  

        int langsak2 = 66;  
        char salak2 = (char) langsak2;
        System.out.println("Int ke char: " + salak2);  
    }
}
