/**
 * Created by Chasdiel on 2017-10-29.
 */
public class Student {
    public static int studentsNumber = 0;

    private String firstName;
    private String lastName;
    private int indexNumber;

    public Student(String firstName, String lastName, int indexNumber){
        setFirstName(firstName);
        setLastName(lastName);
        setIndexNumber(indexNumber);
        studentsNumber ++;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }
}
