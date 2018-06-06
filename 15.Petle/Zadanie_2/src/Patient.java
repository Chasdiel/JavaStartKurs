/**
 * Created by Chasdiel on 2017-10-26.
 */
public class Patient {
    private String name;
    private String surname;
    private String pesel;

    public Patient() {

    }

    public Patient(String name, String surname, String pesel){
        setName(name);
        setSurname(surname);
        setPesel(pesel);
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getPesel() {
        return pesel;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }
}
