public class BitWiseOperators {
    public static void main(String[] args) {
        int a = 5; //0101
        int b = 3; //0011

        System.out.println("a & b = " + (a & b));   //AND -> 0001 = 1
        System.out.println("a | b = " + (a | b));   //OR -> 0111 = 7
        System.out.println("a ^ b = " + (a ^ b));   //XOR -> 0110 = 6
        System.out.println("~a = " + (~a));         //NOT -> -6
        System.out.println("a << 1 = " + (a << 1)); //left shift -> 1010 = 10
        System.out.println("a >> 1 = " + (a >> 1)); //right shift -> 0010 = 2
        System.out.println("a >>> 1 = " + (a >>> 1)); // unsigned right shift
    }
}
