import java.util.ArrayList;

public class AutoBoxing {
    public static void main(String[] args) {
        // unnecessary
        // boxing
        // deprecated
        Boolean bool_0 = new Boolean(true);
        Byte byte_0 = new Byte((byte) 134);
        Character char_0 = new Character('a');
        Short short_0 = new Short((short) 3);
        Integer int_0 = new Integer(17);
        Long long_0 = new Long(17L);
        Float float_0 = new Float(13.4);
        Double double_0 = new Double(17.5);

        // unnecessary
        // boxing
        // use instead
        Boolean bool_1 = Boolean.valueOf(true);
        Byte byte_1 = Byte.valueOf((byte) 134);
        Character char_1 = Character.valueOf('a');
        Short short_1 = Short.valueOf((short) 3);
        Integer int_1 = Integer.valueOf(17);
        Long long_1 = Long.valueOf(17L);
        Float float_1 = Float.valueOf(13.4f);
        Double double_1 = Double.valueOf(17.5);

        // autoboxing
        Boolean bool_2 = true;
        Byte byte_2 = (byte) 134;
        Character char_2 = 'a';
        Short short_2 = (short) 3;
        Integer int_2 = 17;
        Long long_2 = 17L;
        Float float_2 = 13.4f;
        Double double_2 = 17.5;

        // unnecessary
        // unboxing
        boolean bool_3 = bool_2.booleanValue();
        byte byte_3 = byte_2.byteValue();
        char char_3 = char_2.charValue();
        short short_3 = short_2.shortValue();
        int int_3 = int_2.intValue();
        long long_3 = long_2.longValue();
        float float_3 = float_2.floatValue();
        double double_3 = double_2.doubleValue();

        // unboxing
        boolean bool_4 = bool_2;
        byte byte_4 = byte_2;
        char char_4 = char_2;
        short short_4 = short_2;
        int int_4 = int_2;
        long long_4 = long_2;
        float float_4 = float_2;
        double double_4 = double_2;


        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(Integer.valueOf(3)); // unnecessary boxing
        intList.add(3); // autoboxing

        System.out.println(intList.get(0) + 5); // unboxing
    }
}
