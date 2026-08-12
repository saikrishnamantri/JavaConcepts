import java.util.Scanner;

public class NameAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your Name: ");
        String name = sc.nextLine();

        System.out.print("Please enter your age: ");
        int age = sc.nextInt();

        System.out.println("Your Name: " + name + "\nYour Age: " + age);

        sc.close();
    }
}
