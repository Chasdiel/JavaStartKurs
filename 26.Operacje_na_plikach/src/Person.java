import java.io.Serializable;

/**
 * Created by Chasdiel on 2017-11-23.
 */
public class Person implements Serializable {


    private static final long serialVersionUID = -1097918722466119428L;
    private String firstName;
    private String lastName;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Person(){};

    public Person(String fn, String ln){
        setFirstName(fn);
        setLastName(ln);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
