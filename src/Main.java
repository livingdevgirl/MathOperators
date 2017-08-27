import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double firstNumber = s.nextDouble();
        System.out.print("Enter second number: ");
        double secondNumber = s.nextDouble();
        double sum = firstNumber + secondNumber;
        double difference = firstNumber - secondNumber;

        double division = firstNumber / secondNumber;
        double remainder = firstNumber % secondNumber;

            System.out.println("The difference is " + difference + " The sum is " + sum + "The result of division was " + division + " with a remainder of  " + remainder);

    }
}


//try {} catch {} don't use finally