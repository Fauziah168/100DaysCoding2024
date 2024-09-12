public class day_four_coding {
    
    public static void main(String[] args) {
        // Mempelajari penggunaan print dan printf
        
        // penggunaan print
        System.out.println("~~~print~~~");
        System.out.print("Hallo semuanya ");
        System.out.print("perkenalkan nama saya Fauziah");
        
        // penggunaan print dengan linesparator
        System.out.print("Hallo semuanya \n");
        System.out.print("perkenalkan nama saya Fauziah \n");
        int umur = 18;
        System.out.print("saya berumur " + umur + " tahun" + "\n");
        System.out.println("");
        
        // penggunaan printf
        System.out.println("~~~printf~~~");
        
        // format string
        System.out.printf("Hallo semuanya %s!%n","perkenalkan nama saya Fauziah");
        System.out.printf("Hallo semuanya %S%n","perkenalkan nama saya Fauziah");
        
        // format integer desimal
        System.out.printf("Saya berumur %d%n",umur); 
        
        // format floating point
        Double nilai_rapor = 93.2737d;
        System.out.printf("Nilai Rapor = %f%n",nilai_rapor);
        System.out.printf("Nilai Rapor (dengan 2 digit di belakang koma) = %5.2f%n",nilai_rapor);
        
    }
    
    }
