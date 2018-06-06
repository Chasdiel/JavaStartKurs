/**
 * Created by Chasdiel on 2018-01-03.
 */
public class PersonsArrayTest {
    public static void main(String[] args) {
        PersonDatabase personDb = new PersonDatabase();

        Person person1= new Person("Ania", "Kowalska", "123451");
        Person person2= new Person("Andrzej", "Zielony", "123452");
        Person person3= new Person("Beata", "Żaba", "123453");
        Person person4= new Person("Cyprian", "Jarzyna", "123454");


        personDb.add(person1);
        personDb.add(person2);
        personDb.add(person3);
        personDb.add(person4);
        personDb.add(new Person ("Jelop", "Glupi","123"));

        System.out.println(personDb);
        personDb.remove(person1);
        System.out.println();
        System.out.println(personDb);

    }
}
