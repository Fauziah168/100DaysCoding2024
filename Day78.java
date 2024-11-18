public class day_seventyeight_coding {

    public static void main(String[] args) {
        String a, b, c, d;
         a = "Hello";
         b = "hello";
         c = "HELLO";
         d = "World";

        // Membandingkan string dengan equalsIgnoreCase
        System.out.println(a.equalsIgnoreCase(b)); // true
        System.out.println(a.equalsIgnoreCase(c)); // true
        System.out.println(a.equalsIgnoreCase(d)); // false
    }
}
