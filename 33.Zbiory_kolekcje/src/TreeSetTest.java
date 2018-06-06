import java.io.*;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by Chasdiel on 2018-02-27.
 */
public class TreeSetTest {
    public static void main(String[] args) {
        String fileName = "namespl.txt";
        TreeSet<String> treeSet = new TreeSet<>(new Comparator<String>(){
            public int compare(String st1, String st2){
                return -st1.compareTo(st2);
            }
        });

        try(BufferedReader br = new BufferedReader(new FileReader(fileName));)
        {
            String line = null;
            while((line =br.readLine())!=null){
                treeSet.add(line);
            }
        } catch (FileNotFoundException e){
            System.err.println("Nie znaleziono pliku.");
        } catch(IOException e){
            System.err.println("Odczyt się nie udał.");
        }

        System.out.println("Ilość indywidualnych imion w pliku: ");
        System.out.println(treeSet.size());
        System.out.println("Pierwszy element to:");
        System.out.println(treeSet.first());
        System.out.println("Ostatni element to:");
        System.out.println(treeSet.last());
    }
}
