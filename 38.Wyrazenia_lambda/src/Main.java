import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main{
    public static void main(String[] args) {
        List<Integer> listRandom = new ArrayList<>();
        Random rand = new Random();

        //generate
        generate(listRandom, 10, ()->rand.nextInt(100));
        //print
        System.out.println("Wyświetlam wylosowane liczby znajdujące się na liście");
       consume(listRandom, x-> System.out.print(x + " "));
        System.out.println();

        //remove
        // zamiast fliterList można użyć metody removeIf z Collection
        // listRandom.removeIf((Integer d)-> d%2 ==0);
        filterList(listRandom, x-> x%2==0);
        System.out.println("Usuwam liczy parzyste i wyświetlam liczby z listy.");
        //print
       consume(listRandom, x-> System.out.print(x + " "));

    }
    public static <T> void generate(List<T> list, int number, Supplier<T> sup){
        for (int i = 0; i< number; i++) {
            list.add(sup.get());
        }
    }

    public static <T> void filterList(List<T> list, Predicate<T> pred){
        Iterator<T> iterator = list.iterator();
        while(iterator.hasNext()) {
            T tmp = iterator.next();
            if (pred.test(tmp)) {
                iterator.remove();
            }
        }
        // można też w pętli for:
       /* for (Iterator<T> iterator = list.iterator(); iterator.hasNext();){
            T tmp = iterator.next();
            if(pred.test(tmp)){
                iterator.remove();
            }
        }*/
        //lub z wykorzystaniem metody z Colletion: removeIf() - wtedy usuwamy FilterList i w main korzystamy z removeIf()
        // listRandom.removeIf((Integer d)-> d%2 ==0);
    }

    public static <T> void consume(List<T> list, Consumer<T> cons){
        for (T t : list){
            cons.accept(t);
        }
    }

}