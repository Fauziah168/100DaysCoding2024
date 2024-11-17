import java.util.Scanner;
public class day_seventyseven_coding {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pw_benar = "PASSword123";
        System.out.print("Masukkan password: ");
        String pw = sc.nextLine();

        if (pw_benar.equals(pw)) {
            System.out.println("Password Benar.");
        } else {
            System.out.println("Password Salah.");
        }
    }
}
