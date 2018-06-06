/**
 * Created by Chasdiel on 2017-11-13.
 */
public class Rectangle implements Shape{
    public double a;
    public double b;

    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    @Override
    public double calculateArea() {
        return a*b;
    }

    @Override
    public double calculatePerimeter() {
        return 2*a + 2*b;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Prostokąt: " + ", ");
        sb.append("bok A: "  + a + ", ");
        sb.append("bok B: "  + b + ", ");
        sb.append("pole: " +  calculateArea() + ", ");
        sb.append("obwód: " +  calculatePerimeter());
        return sb.toString();
    }
}
