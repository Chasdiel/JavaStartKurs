/**
 * Created by Chasdiel on 2017-11-13.
 */
public interface Shape {
    public static final double PI = 3.14;
    public static final int TRIANGLE = 1;
    public static final int RECTANGLE = 2;
    public static final int CIRCLE = 3;

    public double calculateArea();
    public double calculatePerimeter();
}
