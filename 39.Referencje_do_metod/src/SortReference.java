import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Chasdiel on 2018-03-07.
 */
public class SortReference {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<String>();
        String name1 = "Celina";
        String name2 = "Andrzej";
        String name3 = "Zbigniew";
        String name4 = "Balbina";
        String name5 = "Hieronim";
        nameList.add(name1);
        nameList.add(name2);
        nameList.add(name3);
        nameList.add(name4);
        nameList.add(name5);
        consume(nameList, x-> System.out.print(x + " "));
        System.out.println();
        System.out.println(">>>");
        Collections.sort(nameList, String::compareToIgnoreCase);
        consume(nameList, x-> System.out.print(x + " "));
        }

        public static <T> void consume(List<T> list, Consumer cons){
            for (int i = 0; i <list.size(); i++)
            {
                cons.accept(list.get(i));
            }
        }
}

