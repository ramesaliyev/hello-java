public class Scope {
    public static void main(String[] args) {
        int int_1 = 5;
        int int_2 = 3;

        if (true) {
            // you cant shadow int_1 here
            int int_3 = int_1 + int_2;
        }

        // int_3 not reachable from here
    }
}
