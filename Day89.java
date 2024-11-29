
package OneHundred_Days_Coding;
import java.util.Scanner;
public class day_eightynine_coding {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan teks : ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
    
