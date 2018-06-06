package App;

import Data.ExhaustPart;
import Data.Parts;
import Data.Tire;
import Data.Wheel;

/**
 * Created by Chasdiel on 2017-10-29.
 */
public class App {
    public static void main(String[] args){
        Wheel wheel = new Wheel();
        Tire tire = new Tire();
        ExhaustPart exhaust = new ExhaustPart();
        Parts parts = new Parts();

        parts.model = "Fiat";
        parts.series = "Punto";
        parts.idNumber = 1234;
        parts.producer = "Szwabia";

        wheel.size = 12;
        wheel.width = 10;
        wheel.model = "Mercedes";  // dziedziczymy z klasy, a nie obiektu, więc pola sa pierwotnie NULL lub 0!

        exhaust.euEmmissionNorm = true;

        System.out.println(parts);
        System.out.println(wheel.size + " " + wheel.width);

        System.out.println(tire);   // w tire nic nie zainicjowaliśmy - wszyskie pola będą NULL lub 0!
        System.out.println(wheel);
    }

}
