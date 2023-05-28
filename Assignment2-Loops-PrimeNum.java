import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt(); //This is the input from the user
     boolean isPrime = true;
        
        if (number <= 1) {
            isPrime = false;
        } else {
            int divisor = 2;
            while (divisor <= Math.sqrt(number)) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
                divisor++;
            }
        }
        
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }