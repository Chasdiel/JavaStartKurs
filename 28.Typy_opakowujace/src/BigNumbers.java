import java.io.*;
import java.math.BigInteger;

/**
 * Created by Chasdiel on 2017-12-15.
 */
public class BigNumbers {
    public static void main(String[] args) {
        String fileName = "numery.txt";
        int number = 0;
        int lineNumber = 1;
        int firstLines = 1;
        int intLines = 4;
        String nextLine = null;
        BigInteger bigTemp = null;
        BigInteger bigB = BigInteger.valueOf(0);

        try (
                FileReader fr = new FileReader(fileName);
                BufferedReader br = new BufferedReader(fr);
        ) {
            while ((nextLine = br.readLine()) != null) {
//                System.out.println(nextLine);
                if (lineNumber < intLines) {
                    number += Integer.parseInt(nextLine);
                    firstLines++;
                }
                if (lineNumber == intLines){
                    number += Integer.parseInt(nextLine);
                } else {
                    bigTemp = new BigInteger(nextLine);
                    bigB = bigB.add(bigTemp);
                }
                lineNumber++;
            }
        } catch (FileNotFoundException e) {
            System.err.println("Nie znaleziono pliku");
        } catch (IOException e) {
            System.err.println("Błąd odczytu danych");
        } catch (NumberFormatException e){
            System.err.println("Błąd typu wczytywanych liczb");
        }
        System.out.println("Wynik dla pierwszych " + firstLines + " linijek: " + number);
        System.out.println("Wynik dla pozostałych linijek: " + bigB);

    }
}

/*
zwróci wynik: dodawania trzech pierwszych liczb oraz oddzielnie wynik dodawania dwóch ostatnich liczb.

Do pierwszych trzech liczb wykorzystaj typ int, a do dwóch ostatnich BigInteger.
 */