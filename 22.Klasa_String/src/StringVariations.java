import java.util.Scanner;

/**
 * Created by Chasdiel on 2017-11-08.
 */
public class StringVariations {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        StringBuilder strBuild = new StringBuilder();

        System.out.println("Podaj ilość wyrazów, które chcesz wprowadzić: ");
        int count = reader.nextInt();

        reader.nextLine();
        String word;

        for ( int i = 0; i < count; i++){
            System.out.println("Podaj wyraz: ");
            word = reader.nextLine();
            strBuild.append(word.charAt(word.length()-1));
        }

        System.out.println("Wyraz powstały z ostatnich liter to: " + strBuild.toString());

        reader.close();
        // System.out.println("" + 'a' + 'b' + 'c');    // gdy chcemy zapisać char jako String to dodajemy przed: ""
    }
}
