import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        /*The code block below is using the Scanner class in Java to read user input from the console.

        The first line creates a new Scanner object and assigns it to the variable scanner. 
        The Scanner class provides methods for reading input from various sources, including the keyboard,
        files, and network connections. In this case, we're using System.in as the source, which represents
        the standard input stream (i.e., the console).
        The next two lines prompt the user to enter two integers and read them from the console using the
        nextInt() method of the Scanner class. This method reads the next integer value from the 
        input stream and returns it as an int. 
        The values entered by the user are stored in the variables num1 and num2, respectively.*/

      Scanner scanner = new Scanner(System.in);

        //The first integer is stored in num1
        int num1 = scanner.nextInt();

        //The second integer is stored in num2
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1/num2;
        int remainder = num1 % num2;


        //printing out the information
        System.out.println("sum: " +sum);
        System.out.println("difference: " +difference);
        System.out.println("product: " +product);
        System.out.println("quotient: " +quotient);
        System.out.println("remainder: " +remainder);

        



    }    

}