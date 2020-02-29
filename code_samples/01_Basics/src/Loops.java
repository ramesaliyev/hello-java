public class Loops {
    public static void main(String[] args) {
        // for
        for (int i = 0; i < 10; i++) {
            if (i == 3) continue;
            if (i == 9) break;
            System.out.println(i);
        }

        System.out.println();

        // while
        int count = 0;
        while (true) { // not the best practice
            System.out.println(count);
            count++;
            if (count > 10) {
                break;
            }
        }

        System.out.println();

        // do while
        int count2 = 5;
        do {
            System.out.println(count2);
        } while (count2 != 5);
    }
}
