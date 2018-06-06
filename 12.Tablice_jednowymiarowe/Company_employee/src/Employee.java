/**
 * Created by Chasdiel on 2017-10-17.
 */
public class Employee {
    private String firstName;
    private String lastName;
    private double salary;

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    // konstruktor
    public Employee(String firstName, String lastName, double salary){
        setFirstName(firstName);
        setLastName(lastName);
        setSalary(salary);

    }
}
