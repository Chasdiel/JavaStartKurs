import java.io.Serializable;

/**
 * Created by Chasdiel on 2017-11-23.
 */
public class Company implements Serializable {
    private static final long serialVersionUID = 8832624946357235704L;
    public static final int LIMIT = 3;
    public Employee[] employees;
    public int count = 0;


    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Company(){
        this.employees = new Employee[LIMIT];
    }

    public void add(Employee worker, int index){
        employees[index] = worker;
    }

}
