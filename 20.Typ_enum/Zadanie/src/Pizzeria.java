import java.util.Scanner;

/**
 * Created by Chasdiel on 2017-11-01.
 */
public class Pizzeria {
    public static void main(String[] args) {

        System.out.println("Dostępne rodzaje pizzy: ");
        for(Pizza p: Pizza.values()){
            System.out.println("" + p.ordinal() + " " + p);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Wybierz rodzaj pizzy: ");
        Pizza pizza = Pizza.valueOf(input.nextLine());

        System.out.println("Dziękujemy za zamówienie pizzy " + pizza.name());
        input.close();
    }
}
