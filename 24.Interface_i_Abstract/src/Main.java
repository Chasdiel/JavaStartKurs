import java.util.InputMismatchException;
import java.util.NoSuchElementException;

/**
 * Created by Chasdiel on 2017-11-13.
 */
public class Main {
    public static void main(String[] args) {
        // tworzymy instancję obiektu samego siebie, aby wywołać niestatyczną metodę printOptions()
        Main main = new Main();

        ShapeCalculator shapeCalc = new ShapeCalculator();
        Shape shape = null;

        boolean readComplete = false;
        while (!readComplete) {
            try {
                main.printOptions();
                shape = shapeCalc.createShape();
                readComplete = true;
            } catch (InputMismatchException e){
                System.out.println("Wprowadziłeś dane w złym formacie, spróbuj ponownie.");
            } catch(NoSuchElementException e) {
                System.out.println("Wybrany identyfikator kształtu jest niepoprawny, spróbuj ponownie.");
            }
        }
        System.out.println(shape);

        shapeCalc.closeScanner();
    }
    public void printOptions(){
        System.out.println("Wybierz figurę, dla której chces zobliczyć pole i obwód:");
        System.out.println(Shape.TRIANGLE + " - trójkąt");
        System.out.println(Shape.RECTANGLE + " - prostokąt");
        System.out.println(Shape.CIRCLE + " - koło");
    }
}
