import java.util.Scanner;

/**
 * Created by Chasdiel on 2017-10-21.
 */
public class MultiArray {
    public static void main(String[] args){
        double[][] array = new double[3][];
        double[] first = {1.0, 1.5, 2.0};
        double[] second = {1.5, 2.0, 2.5};
        double[] third = {2.0, 2.5, 3.0};

        array[0] = first;
        array[1] = second;
        array[2] = third;

        double diagonalMultiply0 = array[0][0] * array[1][1] * array[2][2];
        double diagonalMultiply1 = array[2][0] * array[1][1] * array[0][2];
        double sumNew = diagonalMultiply0 + diagonalMultiply1;

        System.out.println("Suma iloczynow przekątnych: " + sumNew);

        double sumOfMiddleColumn = array[0][1] + array[1][1] + array[2][1];
        double sumOfMiddleLine = array[1][0] + array[1][1] + array[1][2];
        double MultiColumnLine = sumOfMiddleLine * sumOfMiddleColumn;

        System.out.println("Iloczyn sum srodkowego wiersza i srodkowej kolumny: " + MultiColumnLine);

        double outermost = array[0][0] + array[0][1] + array[0][2] + array[1][2] + array[2][2] + array[2][1] + array[2][0] + array[1][0];
        System.out.println("Suma elementów znajdujących się przy krawędzi tablicy: " + outermost);

    }
}
