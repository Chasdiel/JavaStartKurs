package functions;

/**
 * Created by Chasdiel on 2017-10-21.
 */
public class Calc {
    private static final String PLUS = "+";
    private static final String MINUS = "-";
    private static final String MULTIPLY = "*";
    private static final String DIVIDE = "/";


    public double calculate(double a, double b, String operator) {
        double result = 0;
        switch (operator) {
            case PLUS:
                result = a + b;
                break;
            case MINUS:
                result = a - b;
                break;
            case MULTIPLY:
                result = a * b;
                break;
            case DIVIDE:
                result = a / b;
                break;
            default:
                System.out.println("Podany operator nie istnieje!");
        }
        return result;
    }

}
