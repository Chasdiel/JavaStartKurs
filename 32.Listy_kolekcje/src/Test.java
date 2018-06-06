import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Chasdiel on 2018-02-22.
 */
public class Test {
    public static final String EXIT = "exit";

    public static void main(String[] args) {
        ArrayList <Double> numbers = new ArrayList<>();

        try(Scanner scan = new Scanner(System.in))
            {
                readData(scan, numbers);
        }
        printList(numbers);
    }

    static void readData(Scanner sc, List<Double> list) throws NumberFormatException{
        System.out.println("Podaj liczby, które chcesz zsumować lub napisz \"exit\" ");
        String tempString = sc.nextLine();
        Double tempDouble = 0.0d;

        if(tempString.equals(EXIT)){
            return;
        }
            try {
                tempDouble = tempDouble.parseDouble(tempString);
                list.add(tempDouble);
            } catch (NumberFormatException e){
                System.out.println("Błędny sposób zapisu liczby!");
            }
            readData(sc, list);
        }

    static void printList(List<Double> list){
        Double sum = 0.0d;
        for (int i =0; i<list.size()-1; i++){
            sum += list.get(i);
            if (i<list.size()-2){
                System.out.print(list.get(i)+ " + ");
            } else {
                System.out.print(list.get(i) + " = " + sum);
            }

        }
    }
}
