public class Conditional {
    public static void main(String[] args) {
        int int1 = 9;
        int int2 = 7;

        // if
        if (int1 % int2 == 0) {
            System.out.println("if");
        } else if (int1 >= int2) {
            System.out.println("else if");
        } else {
            System.out.println("else");
        }

        System.out.println();

        // ternary
        int int3 = int1 > int2 ? int1 : int2;
        System.out.println(int3);

        System.out.println();

        // switch
        switch (int3) {
            case 1: case 3: case 5:
                System.out.println("int3 = " + 1);
                break;
            case 2: case 4: case 6:
                System.out.println("int3 = " + 3);
                break;
            case 7:
                System.out.println("int3 = " + 7);
                break;
            case 9:
                System.out.println("int3 = " + 9);
                break;
            default:
                System.out.println("int3 different");
                break;
        }

    }
}
