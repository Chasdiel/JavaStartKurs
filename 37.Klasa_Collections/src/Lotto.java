import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Chasdiel on 2018-02-28.
 */
public class Lotto {
    private List<Integer> numbers;
    List<Integer> lottoResults;

    public Lotto(){
        numbers = new ArrayList<>();
        generate();
    }

    private void generate(){
        for (int i = 1; i<=49; i++){
            numbers.add(i);
        }
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public void printCollection(Collection<Integer> collection) {
        for(Integer i : collection) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public void randomize(){
        Collections.shuffle(this.numbers);
    }

    public void printResult(){
        List<Integer> lottoResults = numbers.subList(0,6);
        System.out.println("Wylosowane liczby to: ");
        printCollection(lottoResults);
    }
    public int checkResult(List<Integer> userNumbers){
        List<Integer> lottoResults = numbers.subList(0,6);

        int found = 0;
        for (int i =0; i<6; i++){
            if (lottoResults.contains(userNumbers.get(i))){
                found++;
            }
        }
        return found;
    }
}
