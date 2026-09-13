import java.util.Scanner;

public class ArmstrongNumbers {

    public static boolean isArmstrong(int n) {
        if (n < 0) {
            return false;
        }

        int digits = String.valueOf(n).length();
        int sum = 0;

        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, digits);
            temp = temp / 10;
        }

        return sum == n;
    }

    public static void checkArmstrong(Scanner sc) {
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if (isArmstrong(n)) {
            System.out.println(n + " is an Armstrong number");
        }  else {
            System.out.println(n + " is not an Armstrong number");
        }
    }

    public static void printArmstrongUptoN(Scanner sc) {
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("The Armstrong numbers from 0 to " + n + "are: ");
        boolean found = false;

        for  (int i = 0; i < n; i++) {
            if(isArmstrong(i)) {
                System.out.println(i + " ");
                found = true;
            }
        }

        if(!found) {
            System.out.println("None");
        }
        System.out.println();
    }

    public static void countArmstrongInRange(Scanner sc) {
        System.out.println("Enter start of range ");
        int start = sc.nextInt();
        System.out.println("Enter end of range : ");
        int end = sc.nextInt();

        if (start > end) {
            int  temp = start;
            start = end;
            end = temp;
        }

        int count = 0;
        for (int i = start; i <= end; i++) {
            if(isArmstrong(i)) {
                count++;
            }
        }

        System.out.println("The Armstrong numbers between " + start + " and " + end + ":"  + count);
    }

    public static void printArmstrongBetween(Scanner sc) {
        System.out.println("Enter first number: ");
        int first = sc.nextInt();
        System.out.println("Enter second number: ");
        int second = sc.nextInt();

        if (first > second) {
            int temp =  first;
            first = second;
            second = temp;
        }

        System.out.println("The Armstrong numbers from " + first + " to " + second + ":" );
        boolean found = false;

        for (int i = first; i <= second; i++) {
            if(isArmstrong(i)) {
                System.out.println(i + " ");
                found = true;
            }
        }

        if(!found) {
            System.out.println("None");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Check whether a number is Armstrong");
            System.out.println("2. Print Armstrong numbers from 0 to N");
            System.out.println("3. Count Armstrong numbers in a Range");
            System.out.println("4. Print Armstrong Between two numbers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    checkArmstrong(sc);
                    break;
                case 2:
                    printArmstrongUptoN(sc);
                    break;
                case 3:
                    countArmstrongInRange(sc);
                    break;
                case 4:
                    printArmstrongBetween(sc);
                    break;
                case 5:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Invalid choice. Try again");
            }
        } while(choice != 5);

        sc.close();
    }

}
