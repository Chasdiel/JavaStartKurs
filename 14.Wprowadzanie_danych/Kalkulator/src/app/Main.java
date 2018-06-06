package app;

import functions.Calc;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);


        Calc newCalc = new Calc();

        double a;
        double b;
        String operator;

        System.out.println("Podaj liczbę A: ");
        a = input.nextDouble();
        input.nextLine();
        System.out.println("Podaj operator (+, -, *, /): ");
        operator  = input.nextLine();

        System.out.println("Podaj liczbę B: ");
        b = input.nextDouble();

        input.close();
        System.out.println("Wynik to: " + newCalc.calculate(a, b, operator));
    }
}
