public class Operators {
    public static void main(String[] args) {
        // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
        // http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html

        // arithmetic

        System.out.println(9 + 3);
        System.out.println(9 - 3);
        System.out.println(9 * 3);
        System.out.println(9 / 3);
        System.out.println(9 % 3);
        System.out.println();

        int int_1 = 100;
        int int_2 = 100;
        int int_3 = 100;
        int int_4 = 100;
        int int_5 = 100;

        System.out.println(int_1--);
        System.out.println(--int_2);
        System.out.println(int_3++);
        System.out.println(++int_4);
        System.out.println();

        int_1 += 10;
        int_2 -= 10;
        int_3 /= 10;
        int_4 *= 10;
        int_5 %= 10;

        System.out.println(int_1);
        System.out.println(int_2);
        System.out.println(int_3);
        System.out.println(int_4);
        System.out.println(int_5);
        System.out.println();

        // logical

        System.out.println(5 > 3 && 2 < 10);
        System.out.println(5 < 3 || 2 < 10);
    }
}
