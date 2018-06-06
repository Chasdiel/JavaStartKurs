/**
 * Created by Chasdiel on 2017-10-16.
 */
public class Calculator {
    Calculator(){
    }

    double add (double x, double y){
        return x + y;
    }

    double add (int x, int y, int z){       //przeciażanie metody
        return add(x, y)+ z;
    }


    double subtract (double x, double y){
        return x - y;
    }

    double multiply (double x, double y){
        return x*y;
    }

    double divide(double x, double y){
        return x / y;
    }
}
