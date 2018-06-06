/**
 * Created by Chasdiel on 2017-11-13.
 */
public class Circle implements Shape {
    public double radius;

    Circle(double r){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 2*Shape.PI*radius;
    }

    @Override
    public double calculatePerimeter() {
        return Shape.PI*radius*radius;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Koło, ");
        sb.append("promień: " + radius + ", ");
        sb.append("pole: " + calculateArea() + ", ");
        sb.append("obwód: " + calculatePerimeter()+ ", ");
        return sb.toString();
    }
}
