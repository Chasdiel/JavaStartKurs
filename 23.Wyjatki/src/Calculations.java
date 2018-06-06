/**
 * Created by Chasdiel on 2017-11-10.
 */
public class Calculations {
    public final String plus = "+";
    public final String minus = "-";
    public final String multiply = "*";
    public final String divide = "/";

    public double calculate (double a, double b, String operator){
        double result = 0;

        switch (operator) {
            case plus:
                result = a + b;
                break;
            case minus:
                result = a - b;
                break;
            case multiply:
                result = a * b;
                break;
            case divide:
                if (b == 0){
                    throw new ArithmeticException("Nie można dzielić przez 0!");
                }
                result = a / b;
                break;
            default:
                throw new UnknownOperatorException ("Wykorzystujesz niezidentyfikowany operator arytmetyczny");
        }
        return result;
    }


}
