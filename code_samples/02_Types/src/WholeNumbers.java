public class WholeNumbers {
    public static void main (String[] args) {
        // PRIMITIVE DATA TYPES

        // WHOLE NUMBERS

        // long
        // 64 bit
        long maxLong = -9_223_372_036_854_775_808L;
        long minLong =  9_223_372_036_854_775_807L;

        long myLong = (maxLong / 2); // dont need casting, long will accept integer value

        // integer (default)
        // 32 bit
        int minInt = -2_147_483_648;
        int maxInt =  2_147_483_647;

        int myInt = (maxInt / 2);

        // short
        // 16 bit
        short minShort = -32_768;
        short maxShort =  32_767;

        short myShort = (short) (maxShort / 2); // need casting, because operations result to integer

        // byte
        // 8 bit
        byte minByte = -128;
        byte maxByte =  127;

        byte myByte = (byte) (maxByte / 2); // need casting, because operations result to integer
    }
}
