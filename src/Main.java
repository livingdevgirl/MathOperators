import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = s.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = s.nextInt();
        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        double division = firstNumber / secondNumber;
        double remainder = firstNumber % secondNumber;
        System.out.println("The difference is " + difference + " The sum is " + sum + "The result of division was " + division + " with a remainder of  " + remainder);
    }
}
