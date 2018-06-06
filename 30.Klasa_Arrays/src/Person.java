import java.util.Objects;

/**
 * Created by Chasdiel on 2017-12-31.
 */
public class Person {
    private String firstName;
    private String surname;
    private String Pesel;

    Person(String firstName, String surname, String Pesel){
        this.firstName = firstName;
        this.surname = surname;
        this.Pesel = Pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPesel() {
        return Pesel;
    }

    public void setPesel(String pesel) {
        Pesel = pesel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(surname, person.surname) &&
                Objects.equals(Pesel, person.Pesel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, surname, Pesel);
    }

    @Override
    public String toString() {
        return "Imię: " + firstName + ", nazwisko: "+ surname + ", Pesel: " + Pesel;
    }
}
