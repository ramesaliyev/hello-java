public class Numbers {
    public static void main(String[] args) {
        int int_div = 5 / 3;

        System.out.println(int_div);

        float float_div1 = 5 / 3;
        float float_div2 = 5f / 3;
        float float_div3 = (float) (5 / 3);
        float float_div4 = 5f / 3f;
        float float_div5 = (float) (5d / 3d);
        float float_div6 = 5.0f / 3.0f;

        System.out.println(float_div1);
        System.out.println(float_div3);
        System.out.println(float_div3);
        System.out.println(float_div4);
        System.out.println(float_div5);
        System.out.println(float_div6);
        System.out.println();

        double double_div1 = 5 / 3;
        double double_div2 = (double) (5 / 3);
        double double_div3 = 5f / 3f;
        double double_div4 = 5d / 3d;
        double double_div5 = 5.0 / 3.0;

        System.out.println(double_div1);
        System.out.println(double_div2);
        System.out.println(double_div3);
        System.out.println(double_div4);
        System.out.println(double_div5);
        System.out.println();
    }
}
