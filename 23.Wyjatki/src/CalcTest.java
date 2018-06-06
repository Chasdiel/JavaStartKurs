import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Chasdiel on 2017-11-10.
 */
public class CalcTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double a = 0;
        double b = 0;

        String operator = null;
        boolean readComplete = false;
        while (!readComplete){
            try {
                System.out.println("Podaj pierwszą liczbę: ");
                a = sc.nextDouble();
                    sc.nextLine();



                System.out.println("Podaj operator (+, -, *, /): ");
                operator = sc.nextLine();

                System.out.println("Podaj drugą liczbę: ");

                b = sc.nextDouble();



                readComplete = true;
            } catch(InputMismatchException ex){
                System.out.println("Wprowadzono niepoprawne dane, spróbuj jeszcze raz: ");
                sc.nextLine();
            }


        }

        Calculations calc = new Calculations();
        double result = 0;
        boolean calculationComplete = false;

        try{
            result = calc.calculate(a, b, operator);
            calculationComplete = true;
        } catch (ArithmeticException | UnknownOperatorException ex) {
            System.err.println(ex.getMessage());
        }
        if (calculationComplete) {
            System.out.println(a + operator + b + " = " + result);
        } else {
            System.out.println("Nie można było podać wyniku wyrażenia " + a + " "+ operator + " "+ b);
        }
        sc.close();
    }
}
