/**
 * Created by Chasdiel on 2017-11-13.
 */
public class Triangle implements Shape{
    public double h;
    public double a;
    public double b;
    public double c;

    public Triangle(double a, double b, double c, double h){
        this.a= a;
        this.b = b;
        this.c = c;
        this.h= h;
    }
    //getters and setters
    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getH() {
        return h;
    }
    //getters and setters

    @Override
    public double calculateArea() {
        return a*h/2;
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Trójkąt, ");
        sb.append("bok A: " + a + ", ");
        sb.append("bok B: " + b + ", ");
        sb.append("bok C: " + c + ", ");
        sb.append("bok C: " + h + ", ");
        sb.append("pole: " + calculateArea() + ", ");
        sb.append("obwód: " + calculatePerimeter());
        return sb.toString();
    }

}
