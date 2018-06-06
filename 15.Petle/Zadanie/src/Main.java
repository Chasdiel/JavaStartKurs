import java.util.Scanner;

/**
 * Created by Chasdiel on 2017-10-26.
 */
public class Main {
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);


        System.out.println("Ile liczb chcesz do siebie dodać? ");
        int ileLiczb = input.nextInt();

        while (ileLiczb < 0){
            System.out.println("Ilość nie może być mniejsza od 1!");
            System.out.println("Ile liczb chcesz do siebie dodać? ");
            ileLiczb = input.nextInt();
        }
        int liczba = 0;

        while ( ileLiczb >0){       // można też zapisać jako while (ileLiczb-- >0)
            System.out.println("Podaj liczbę: ");
            liczba += input.nextInt();
            ileLiczb --;
        }

        System.out.println("Suma liczb to: " + liczba);
        input.close();
    }
}
