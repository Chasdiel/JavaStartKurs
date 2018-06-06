/**
 * Created by Chasdiel on 2017-12-13.
 */
public class Factorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int arg = 6;
        int result = factorial.factor(arg);
        System.out.println("Wynik silni z liczby " + arg + " to " + result);
    }

    public int factor(int n){
        if (n>1) {
            System.out.println("Obliczam silnię dla " + n);
            return n * factor(n-1);
        } else {
            return n;
        }
    }

    // jako równanie trójargumentowe:
    /*
    public int factor(int n) {
        return n>1 ? n * factor(n-1) : n;
    }
    */
}
