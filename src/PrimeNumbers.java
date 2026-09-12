import java.util.Scanner;

public class PrimeNumbers {

    public static boolean isPrime(int n){

        if (n <= 1) {
            return false;
        }
        if (n == 2)  {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }

        for (int i =  3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void checkPrime(Scanner sc){
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if(isPrime(n)){
            System.out.println(n + " is a prime number");
        } else  {
            System.out.println(n + " is NOT a prime number");
        }
    }

    public static void printPrimesUpToN(Scanner sc){
        System.out.println("Enter a number N: ");
        int n = sc.nextInt();

        System.out.println("Prime numbers from 1 to " + n + ":" );
        boolean found = false;

        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("None");
        }
        System.out.println();
    }

    public static void countPrimesInRange(Scanner sc){
        System.out.println("Enter start of range: ");
        int start = sc.nextInt();
        System.out.println("Enter end of range: ");
        int end = sc.nextInt();

        if (start > end) {
            int temp =  start;
            start = end;
            end = temp;
        }

        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        System.out.println("Total Prime numbers between " + start + " to " + end + " : " + count);
    }

    public static void findNthPrime(Scanner sc){
        System.out.println("Enter N (for Nth Prime: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("N must be a positive integer");
            return;
        }

        int count = 0;
        int number = 1;

        while (count < n) {
            number++;
            if (isPrime(number)) {
                count++;
            }
        }

        System.out.println("The " + n +"th Prime number is " + number);
    }

    public static void printPrimesBetween(Scanner sc){
        System.out.println("Enter first number: ");
        int first = sc.nextInt();
        System.out.println("Enter second number: ");
        int second = sc.nextInt();

        if (first > second) {
            int temp =  first;
            first = second;
            second = temp;
        }

        System.out.println("The Prime Numbers between" + first + "and" + second + "are: ");
        boolean found = false;

        for (int i = first; i <= second; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("None");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("======= Choose an option =======");
            System.out.println("1. Check Whether a Number is Prime");
            System.out.println("2. Print Prime Numbers from 1 to N");
            System.out.println("3. Print Prime Numbers in a Range");
            System.out.println("4. Find the Nth Prime Number");
            System.out.println("5. Print Prime Numbers between two numbers");
            System.out.println("6. Exit Program \n");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    checkPrime(sc);
                    break;
                case 2:
                    printPrimesUpToN(sc);
                    break;
                case 3:
                    countPrimesInRange(sc);
                    break;
                case 4:
                    findNthPrime(sc);
                    break;
                case 5:
                    printPrimesBetween(sc);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again!");
            }
        } while (choice != 6);

        sc.close();
    }
}
