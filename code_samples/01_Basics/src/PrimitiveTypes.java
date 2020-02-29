public class PrimitiveTypes {
    public static void main(String[] args) {
        // Primitive Data Types

        // - boolean
        //   [true or false]
        //   (1 bit) width
        //   (false) default
        //   (Boolean) wrapper_class

        // - byte
        //   [whole number - twos complement integer]
        //   (8 bit) width
        //   (0) default
        //   (Byte) wrapper_class

        // - char
        //   [Unicode character]
        //   (16 bits) width
        //   (\u0000) default
        //   (Character) wrapper_class

        // - short
        //   [whole number - twos complement integer]
        //   (16 bits) width
        //   (0) default
        //   (Short) wrapper_class

        // - int
        //   [whole number - twos complement integer]
        //   (32 bits) width
        //   (0) default
        //   (Integer) wrapper_class

        // - long
        //   [whole number - twos complement integer]
        //   (64 bits) width
        //   (0) default
        //   (Long) wrapper_class

        // - float
        //   [real number - single precision - IEEE 754 floating point]
        //   (32 bits) width
        //   (0.0) default
        //   (Float) wrapper_class

        // - double
        //   [real number - double precision - IEEE 754 floating point]
        //   (64 bits) width
        //   (0.0) default
        //   (Double) wrapper_class

        // ---------------------------------------

        // - boolean
        boolean bool_1 = true;
        boolean bool_2 = false;

        System.out.println(bool_1);
        System.out.println(bool_2);
        System.out.println();

        // - byte

        byte byte_1 = 100;
        byte byte_min = Byte.MIN_VALUE;
        byte byte_max = Byte.MAX_VALUE;

        System.out.println("Byte Min Value = " + byte_min);
        System.out.println("Byte Max Value = " + byte_max);
        System.out.println();

        // - char
        char char_1 = 'D';
        char char_2 = '\u0044';

        System.out.println("Letter: " + char_1);
        System.out.println("Letter from Unicode: " + char_2);
        System.out.println();

        // - short

        short short_1 = 30_000;
        short short_min = Short.MIN_VALUE;
        short short_max = Short.MAX_VALUE;

        System.out.println("Short Min Value = " + short_min);
        System.out.println("Short Max Value = " + short_max);
        System.out.println();

        // - int

        int int_1 = 2_147_483_647;
        int int_min = Integer.MIN_VALUE;
        int int_max = Integer.MAX_VALUE;

        System.out.println("Integer Min Value = " + int_min);
        System.out.println("Integer Max Value = " + int_max);
        System.out.println("Integer Max Overflow = " + (int_max + 1 == int_min));
        System.out.println("Integer Min Underflow = " + (int_min - 1 == int_max));
        System.out.println();

        // - long

        long long_1 = 100L;
        long long_min = Long.MIN_VALUE;
        long long_max = Long.MAX_VALUE;

        System.out.println("Long Min Value = " + long_min);
        System.out.println("Long Max Value = " + long_max);
        System.out.println();

        // - float

        float float_1 = 100.2f;
        float float_min = Float.MIN_VALUE;
        float float_max = Float.MAX_VALUE;

        System.out.println("Float Min Value = " + float_min);
        System.out.println("Float Max Value = " + float_max);
        System.out.println();

        // - double

        double double_1 = 100.2d;
        double double_min = Double.MIN_VALUE;
        double double_max = Double.MAX_VALUE;

        System.out.println("Double Min Value = " + double_min);
        System.out.println("Double Max Value = " + double_max);
        System.out.println();
    }
}
