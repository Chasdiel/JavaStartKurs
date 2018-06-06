/**
 * Created by Chasdiel on 2017-10-29.
 */
public class University {
    public static void main(String[] args){

        //odwołujemy się do statycznego pola - BEZ UTWORZENIA OBIEKTU!
        System.out.println("Liczba studentów przed zapisami: " + Student.studentsNumber);

        Student andrzej = new Student("Andrzej", "Zielony", 123);
        Student stefan = new Student("Stefan", "Biały", 1234);
        Student blazej = new Student("Błażej", "Czarny", 1214);

        System.out.println("Liczba studentów: " + Student.studentsNumber);
    }
}
