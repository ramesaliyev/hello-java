public class StringType {
    public static void main(String[] args) {
        String string_1 = "This is a string!";
        String string_2 = "Another string.";

        String string_3 = string_1 + " " + string_2;

        String string_4 = "\u00A9 2020";

        String string_5 = "15" + 10;

        System.out.println(string_1);
        System.out.println(string_3);
        System.out.println(string_4);
        System.out.println(string_5);

        // These kind of operations with strings are inefficient,
        // we're gonna use StringBuffer to deal with strings instead.
    }
}
