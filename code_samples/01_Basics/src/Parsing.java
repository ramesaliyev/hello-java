public class Parsing {
    public static void main(String[] args) {
        String str_5 = "5";
        String str_3 = "3";
        String str_true = "true";

        boolean bool_true = Boolean.parseBoolean(str_true);
        byte byte_3 = Byte.parseByte(str_3);
        short short_3 = Short.parseShort(str_3);
        int int_3 = Integer.parseInt(str_3);
        long long_3 = Long.parseLong(str_3);
        float float_3 = Float.parseFloat(str_3);
        double double_3 = Double.parseDouble(str_3);

        if (bool_true) {
            System.out.println(byte_3 + short_3 + int_3 + long_3 + float_3 + double_3);
        }
    }
}
