/**
 * Created by Chasdiel on 2017-10-16.
 */
public class Calculate {
    public static void main(String[] args) {
//
        double x = 5;
        double y = 26;
        int a = 7;
        int b = 12;
        int c = 2;

        Calculator newCalc = new Calculator();
        System.out.println("Wynik dodawania x i y: " + newCalc.add(a, b, c));
        //  System.out.println("Wynik odejmowania x i y: " + newCalc.subtract(x, y));
        // System.out.println("Wynik dzielenia x i y: " + newCalc.divide(x, y));
        // System.out.println("Wynik mnożenia x i y: " + newCalc.multiply(x, y));
    }
}
