public class Methods {
    public static void main(String[] args) {
        methodOne();

        sum();
        println(sum(127));
        println(sum(4, 7));
        println(sum(4, 7, 3));
    }

    public static void methodOne() {
        println("Method one!");
    }

    public static void println(String string) {
        System.out.println(string);
    }

    // method overloading
    public static void println(int number) {
        System.out.println(number);
    }

    public static void sum() {
        System.out.println("We need numbers to sum!");;
    }

    public static int sum(int a) {
        return a;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    // method overloading
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
}
