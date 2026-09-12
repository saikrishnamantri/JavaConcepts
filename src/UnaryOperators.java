public class UnaryOperators {
    public static void main(String[] args) {

        int a = 10;

        System.out.println("a = " + a);
        System.out.println("+a = " + (+a));
        System.out.println("-a = " + (-a));
        System.out.println("=========================");

        System.out.println("++a = " + (++a));
        System.out.println("a++ = " + (a++));
        System.out.println("a = " + a);
        System.out.println("=========================");

        System.out.println("--a = " + (--a));
        System.out.println("a-- = " + (a--));
        System.out.println("a = " + a);
        System.out.println("==========================");

        boolean flag = true;
        System.out.println("!flag = " + (!flag));
    }
}
