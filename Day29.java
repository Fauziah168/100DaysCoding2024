import java.math.BigInteger;
public class day_twentynine_coding {
    
    public static void main(String[] args) {
        System.out.println("penggunaan tipe data referance bigInteger");
        BigInteger var1 = new BigInteger("123456789");
        BigInteger var2 = new BigInteger("123456789");

        BigInteger penjumlahan = var1.add(var2);        
        BigInteger pengurangan = var1.subtract(var2);  
        BigInteger perkalian = var1.multiply(var2);     
        BigInteger pembagian = var1.divide(var2);      

        System.out.println("hasil penjumlahan : " + penjumlahan);
        System.out.println("hasil pengurangan : " + pengurangan);
        System.out.println("hasil perkalian : " + perkalian);
        System.out.println("hasil pembagian : " + pembagian);
    }
    
}
