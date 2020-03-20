import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListz {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("Watermelon");
        array.add("Apple");
        array.add("Grapes");

        array.set(0, "Orange");
        array.remove(2);

        boolean appleExist = array.contains("Apple");
        int appleIndex = array.indexOf("Apple");

        System.out.println(array.size());
        System.out.println(array.get(0));
        System.out.println(array.get(1));
        System.out.println(appleExist + " " + appleIndex);
        System.out.println();

        ArrayList<String> copy_array1 = new ArrayList<String>(array);
        System.out.println(copy_array1.toString());
        System.out.println();

        ArrayList<String> copy_array2 = new ArrayList<String>();
        copy_array2.addAll(array);
        System.out.println(copy_array2.toString());
        System.out.println();

        String[] copy_array3 = new String[array.size()];
        copy_array3 = array.toArray(copy_array3);
        System.out.println(Arrays.toString(copy_array3));
        System.out.println();
    }
}
