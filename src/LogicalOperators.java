public class LogicalOperators {

    public static void main(String[] args) {

        boolean x = true;
        boolean y = false;

        System.out.println(" x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x : " + (!x));

        int age = 20;
        boolean hasId = true;

        if (age >= 18 &&  hasId) {
            System.out.println("Entry Allowed!");
        } else {
            System.out.println("Entry Denied!");
        }

        //short-circuit example
        int a = 5;
        int b = 0;

        if (b != 0 && a / b > 1) {
            System.out.println("Won't crash because && stops early");
        } else {
            System.out.println("Safe: second part not evaluated!");
        }

    }
}
