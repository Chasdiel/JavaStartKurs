import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Chasdiel on 2018-03-15.
 */
public class ChangeTextByStream {
    public static void main(String[] args) {
        final String FILE_NAME = "loremipsum.txt";
        String[] words = null;

        try(BufferedReader br = new BufferedReader(new FileReader(FILE_NAME)))
        { String nextLine = null;
            while((nextLine = br.readLine())!= null) {
                words = nextLine.split(" ");
            }
        } catch(IOException e){
            System.err.println("Nastąpił błąd podczas odczytu pliku.");
        }

        List<String> wordsList = Arrays.asList(words);
        wordsList = wordsList.stream().map(ChangeTextByStream::removeSigns)
                                    .collect(Collectors.toList());

        //wordsList.forEach(x -> System.out.print(x + " ; "));

        long countSWords = wordsList.stream().filter(s -> s.startsWith("s"))
                .peek(s -> System.out.print(s + " ")).count();
        System.out.println();

        long fiveLetters = wordsList.stream().filter(ChangeTextByStream::equalsFive)
                .peek(s -> System.out.print(s + " ")).count();
        System.out.println();

        System.out.println("Liczba wyrazów na 's': " + countSWords);
        System.out.println("Liczba wyrazów z 5 literami: " + fiveLetters);
    }


    public static String removeSigns(String word){
        if(word != null){
            char charEnd = word.charAt(word.length()-1);
            if ((charEnd ==',') || (charEnd =='.')){
                word = word.substring(0, word.length()-2);
                }
            }
            return word;
        }

    public static boolean equalsFive(String word){
        return word.length() ==5;
    }


}
