import java.util.Arrays;
import java.util.Scanner;

public class Arrayz {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        long[] array_long0 = new long[3];
        long[] array_long1 = new long[] {1, 2, 3};
        long[] array_long2 = {1, 2, 3}; // same as above

        long[] array_long3;
        array_long3 = new long[3];

        long[] array_long4;
        array_long4 = new long[] {1, 2, 3};

        // ---

        int[] array_int = new int[3];
        array_int[0] = 15;
        Arrayz.printArray(array_int);
        System.out.println();

        byte[] array_byte = {1, 2, 3, 4, 5};
        System.out.println(array_byte.length + " " + Arrays.toString(array_byte));

        short[] array_short = new short[] {3, 4, 5};
        System.out.println(array_short.length + " " + Arrays.toString(array_short));

        System.out.println("Sum example;");
        int sum = sumIntegers(getIntegers(4));
        System.out.println("Sum = " + sum);
        System.out.println();

        System.out.println("Average example;");
        int avg = avgIntegers(getIntegers(4));
        System.out.println("Avg = " + avg);
        System.out.println();
    }

    public static int[] getIntegers(int length) {
        System.out.println("Enter " + length + " number values:");
        int[] numbers = new int[length];

        for (int i = 0; i < length; i++) {
            numbers[i] = scanner.nextInt();
        }

        return numbers;
    }

    public static int sumIntegers(int[] numbers) {
        int total = 0;

        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }

        return total;
    }

    public static int avgIntegers(int [] numbers) {
        int sum = sumIntegers(numbers);
        return sum / numbers.length;
    }

    public static void printArray(String[] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.println("#" + i + " = " + array[i]);
        }
        System.out.println();
    }

    public static void printArray(int[] array) {
        String[] stringArray = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            stringArray[i] = Integer.toString(array[i]);
        }
        Arrayz.printArray(stringArray);
    }

    public static void printArray(byte[] array) {
        String[] stringArray = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            stringArray[i] = Byte.toString(array[i]);
        }
        Arrayz.printArray(stringArray);
    }
}
