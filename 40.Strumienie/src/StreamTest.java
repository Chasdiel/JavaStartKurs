import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Chasdiel on 2018-03-12.
 */
public class StreamTest {
    public static void main(String[] args) {
        System.out.println("Program tworzy strumień kolejnych liczb całkowitych począwszy od 0. Następnie wybiera liczby " +
                "które spełniają warunki - są z zakres 100-1000 i są podzielne przez 5, po czym wyświetla 10 " +
                "pierwszych liczb tego strumienia pomnożone przez 3");
        Stream<Integer> numStream = Stream.iterate(0, x-> x+1); //interfejs unaryOperator
        List<Integer> numbers = new ArrayList<>(1500);
        numbers = numStream.filter((x-> (x%5 ==0&& x>100 && x<1000)))
                        .limit(10)
                        .map(x->x*3)
                        .collect(Collectors.toCollection(ArrayList::new));
        numbers.forEach(System.out::println);
    }
}
