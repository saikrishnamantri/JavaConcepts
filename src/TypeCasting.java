public class TypeCasting {
    public static void main(String[] args) {
        System.out.println("===IMPLICIT CASTING===\n");

        //Implicit casting happens automatic when converting smaller type to larger
        byte b = 100;

        //byte to short
        short s = b;

        //short to int
        int i = s;

        //int to long
        long l = i;

        //long to float
        float f = l;

        //float to double
        double d = f;

        System.out.println("byte value: " + b + "\nshort value: " + s + "\nint value: " + i +
                "\nlong value: " + l + "\nfloat value: " + f + "\ndouble value: " + d);

        //char to int also implicit
        char ch = 'A';
        int ascii = ch;
        System.out.println("\nchar 'A' to int: " + ascii);

        System.out.println("\n===EXPLICIT CASTING===\n");

        //it is required when converting larger type to small
        double d2 = 99.99;

        //double to float
        float f2 = (float) d2;

        //float to long
        long l2 = (long) f2;

        //long to int
        int i2 = (int) l2;

        //int to short
        short s2 = (short) i2;

        //short to byte
        byte b2 = (byte) s2;

        System.out.println("double value: " + d2 + "\nfloat value: " + f2 + "\nlong value: " + l2 +
                "\nint value: " + i2 + "\nshort value: " + s2 + "\nbyte value: " + b2 );

    }
}
