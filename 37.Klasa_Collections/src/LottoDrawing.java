import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chasdiel on 2018-03-01.
 */
public class LottoDrawing {
    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        List<Integer> drawnNumbers = new ArrayList<>(6);
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        {
            int i = 1;
            Integer tempNumber = 0;
            while(i<=6){
                System.out.println("Podaj 6 liczb z zakresu 1-49: ");
                tempNumber = Integer.parseInt(br.readLine());
                if (tempNumber>0 && tempNumber<50){
                    drawnNumbers.add(tempNumber);
                    i++;
                } else {
                    System.out.println("Podałeś liczby przekraczające zakres.");
                }
            }
        } catch (Exception e){
            System.err.println("Zła wartość. Spróbuj jeszcze raz!");
        }

        lotto.randomize();
        System.out.println("Wyświetlam podane przez Ciebie liczby:");
        lotto.printCollection(drawnNumbers);
        lotto.printResult();
        System.out.println("Ilość trafionych liczb: ");
        if (lotto.checkResult(drawnNumbers)==0){
            System.out.println("Niestety nie trafiłeś żadnej liczby");
        } else {
            System.out.println(lotto.checkResult(drawnNumbers));
        }
    }

}
