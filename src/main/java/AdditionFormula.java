
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        // Prompt the user for two numbers
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        int sum = firstNumber + secondNumber;
        // Print the operation for the user along with the output
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);

    }
}
