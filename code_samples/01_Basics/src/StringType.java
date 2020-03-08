public class StringType {
    public static void main(String[] args) {
        String str_1 = "This is a string!";
        String str_2 = "Another string.";
        String str_3 = str_1 + " " + str_2;
        String str_4 = "\u00A9 2020";
        String str_5 = "15" + 10;
        String str_6 = "";

        if (str_6.isEmpty()) {
            System.out.println("str_6 is empty");
        }

        System.out.println(str_1);
        System.out.println(str_3);
        System.out.println(str_4);
        System.out.println(str_5);
        System.out.println();

        // These kind of operations with strings are inefficient,
        // we're gonna use StringBuffer to deal with strings instead.

        /**
         * From String
         */
        String str_101 = "5";
        String str_103 = "true";

        boolean bool_1 = Boolean.parseBoolean(str_103);
        byte byte_1 = Byte.parseByte(str_101);
        short short_1 = Short.parseShort(str_101);
        int int_1 = Integer.parseInt(str_101);
        long long_1 = Long.parseLong(str_101);
        float float_1 = Float.parseFloat(str_101);
        double double_1 = Double.parseDouble(str_101);

        if (bool_1) {
            System.out.println(byte_1 + short_1 + int_1 + long_1 + float_1 + double_1);
        }
        System.out.println();


        /**
         * To String
         */
        char char_1 = 'a';

        String str_bool = Boolean.toString(bool_1);
        String str_byte = Byte.toString(byte_1);
        String str_char = Character.toString(char_1);
        String str_short = Short.toString(short_1);
        String str_int = Integer.toString(int_1);
        String str_long = Long.toString(long_1);
        String str_float = Float.toString(float_1);
        String str_double = Double.toString(double_1);

        System.out.println(20200 + str_bool);
        System.out.println(20200 + str_byte);
        System.out.println(20200 + str_char);
        System.out.println(20200 + str_short);
        System.out.println(20200 + str_int);
        System.out.println(20200 + str_long);
        System.out.println(20200 + str_float);
        System.out.println(20200 + str_double);
        System.out.println();
    }
}
