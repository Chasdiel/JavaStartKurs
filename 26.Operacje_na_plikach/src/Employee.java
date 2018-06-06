/**
 * Created by Chasdiel on 2017-11-23.
 */
public class Employee extends Person {
    private static final long serialVersionUID = -4303610527911617577L;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String fn, String ln, double salary){
        super(fn,ln);
        setSalary(salary);
    }

    @Override
    public String toString() {
        return super.toString() + ", wypłata " + salary;
    }
}
