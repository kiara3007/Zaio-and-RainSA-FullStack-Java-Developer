import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Scanner class
        String str = input.nextLine(); //getting string input from user

        
        boolean isPalindrome = true;
        int length = str.length();
        
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        
        if (isPalindrome) {
            System.out.println("Is palindrome");
        } else {
            System.out.println("Is not palindrome");
        }
        
    
    }

}  