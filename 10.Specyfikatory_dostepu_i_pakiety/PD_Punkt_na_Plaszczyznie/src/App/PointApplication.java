package App;

import data.Point;
import logic.PointController;
/**
 * Created by Chasdiel on 2017-10-16.
 */
public class PointApplication {
    public static void main(String [] args){
        Point newPoint = new Point();
        PointController newPC= new PointController();
        newPoint.setX(5);
        newPoint.setY(8);

        System.out.println("X: " + newPoint.getX() + ", Y: " + newPoint.getY());
        newPC.addX(newPoint);
        System.out.println("XaddX: " + newPoint.getX() + ", Y: " + newPoint.getY());
        newPC.addY(newPoint);
        System.out.println("X: " + newPoint.getX() + ", YaddY: " + newPoint.getY());
        newPC.minusX(newPoint);
        newPC.minusY(newPoint);
        System.out.println("XminusX: " + newPoint.getX() + ", YminusY: " + newPoint.getY());

        newPC.changeObject(newPoint);   // to tylko tworzy nowa referencje do obiektu - nigdy niewykorzystaną
        System.out.println("X: " + newPoint.getX() + ", Y: " + newPoint.getY());
        public static final int ADD_X = 0;
        public static final int ADD_Y = 1;
        public static final int MINUS_X = 2;
        public static final int MINUS_Y = 3;

        int option = ADD_X ;

        // W nawiasie po słowie switch podajemy zmienną lub wartość typu int albo String na podstawie której program ma podjąć dalszą decyzję
        switch (option){
            case ADD_X:
                newPC.addX(newPoint);
                break;
            case ADD_Y:
                newPC.addY(newPoint);
                break;
            case MINUS_X:
                newPC.minusX(newPoint);
                break;
            case MINUS_Y:
                newPC.minusY(newPoint);
                break;
        }
        System.out.println("Punkt po zmianie: (" + newPoint.getX()+";"+ newPoint.getY()+")");
    }
}
