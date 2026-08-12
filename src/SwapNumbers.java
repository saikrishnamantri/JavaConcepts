import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNumber = sc.nextInt();

        System.out.println("Enter the second number: ");
        int secondNumber = sc.nextInt();

        System.out.println("Befor Swap: First Number = " + firstNumber + "Second Number = " + secondNumber);

        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;

        System.out.println("After Swap: First Number = " + firstNumber + "Second Number = " + secondNumber);

        sc.close();

    }
}
