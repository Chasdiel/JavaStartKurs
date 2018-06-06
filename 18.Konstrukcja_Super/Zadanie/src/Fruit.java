/**
 * Created by Chasdiel on 2017-10-30.
 */
public class Fruit {
    public static String KATEGORIA = "owoc";

    public Fruit(){
     //   System.out.println("Utworzono owoc"); // wywołując konstruktor Apple wpierw wywołamy konstruktor niejawny
        // gdybyśmy wyrzucili komentarz przed sout to przy wywołauniu metody printInfo dla jabłka zobaczylibyśmy ten napis
    }

    public void printInfo(){
        System.out.println("Kategoria: " + KATEGORIA);
    }

}
