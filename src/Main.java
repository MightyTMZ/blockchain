import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[] list1 = {"a", "b", "c"};
        String[] list2 = {"a", "b", "c"};

        System.out.println(Arrays.hashCode(list1));
        System.out.println(Arrays.hashCode(list2));
    }
}