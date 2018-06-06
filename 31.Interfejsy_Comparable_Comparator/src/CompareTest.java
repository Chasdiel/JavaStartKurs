import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Chasdiel on 2018-01-22.
 */
public class CompareTest {
    public static void main(String[] args) {
        Integer [] numbers = {1, 4, 6, 7, 12, 153, 112, 156, 11, 3,
                58, 2, 17, 89, 99, 34, 56, 28, 123, 999};
        System.out.println("Tablica niesortowana: ");
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Posortowane rosnąco: ");
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare (Integer n1, Integer n2) {
                return - (n1.compareTo(n2));
            }
        });
        System.out.println("Posortowane malejąco: ");
        System.out.println(Arrays.toString(numbers));
    }
}
