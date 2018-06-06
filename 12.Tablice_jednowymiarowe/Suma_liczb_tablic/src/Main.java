/**
 * Created by Chasdiel on 2017-10-19.
 */
public class Main {
    public static void main(String[] args){
        int[] Array1 = {1,5,7};
        int[] Array2 = new int[3];

        Array2[0] = 5;
        Array2[1] = 9;
        Array2[2] = 3;

        int sum1 = Array1[0] + Array1[1] + Array1[2];
        int sum2 = Array2[0] + Array2[1] + Array2[2];

        int total = sum1 + sum2;
        System.out.println("Suma tablicy 1: " + sum1);
        System.out.println("Suma tablicy 2: " + sum2);
        System.out.println("Suma calkowita to: " + total);
    }
}
