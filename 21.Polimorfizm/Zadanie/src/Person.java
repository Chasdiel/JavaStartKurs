/**
 * Created by Chasdiel on 2017-11-02.
 */
public class Person {
    private String firstName;
    private String lastName;
    private double salary;

    public Person(String fn, String ln, double salary){
        this.firstName = fn;
        this.lastName = ln;
        this.salary = salary;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Imię: " + firstName + ", Nazwisko: " + lastName + ", Wypłata: " + salary;
    }
}
