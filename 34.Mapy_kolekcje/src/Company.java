import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
/**
 * Created by Chasdiel on 2018-02-27.
 */
public class Company {
    private HashMap<String, Employee>  employeeMap;

    public Company(){
        employeeMap = new HashMap<>();
    }

    public boolean addEmployee(Employee employee) {
        String key = employee.getFirstName() + " " + employee.getLastName();

        if(employeeMap.get(key) != null){   // jeśli istnieje pracownik o takim kluczu (get(V) nie zwróci null) to zwracamy wartosć false!
            return false;
        } else {
            employeeMap.put(key, employee);
            return true;
        }
    }

    public Employee getEmployee (String firstName, String lastName) {
        String key = firstName + " " + lastName;
        return employeeMap.get(key);        // gdy nie zostanie znaleziony taki klucz, wartość zwrócona to null
    }
    public void printAllWorkers() {
        for (String key : employeeMap.keySet()) {
            System.out.println(key);
        }
    }



}
