public class Casting {
    public static void main(String[] args) {
        byte byte_1 = 1;

        // explicit
        char char_1 = (char) byte_1;
        short short_1 = (short) byte_1;
        int int_1 = (int) byte_1;
        long long_1 = (long) byte_1;
        float float_1 = (float) byte_1;
        double double_1 = (double) byte_1;

        // implicit
        short short_2 = byte_1;
        int int_2 = byte_1;
        long long_2 = byte_1;
        float float_2 = byte_1;
        double double_2 = byte_1;
    }
}
