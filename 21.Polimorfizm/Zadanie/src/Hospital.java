/**
 * Created by Chasdiel on 2017-11-02.
 */
public class Hospital {
    public static final int MAX_EMPLOYEES = 3;
    private Person[] staff;
    private int staffCount;

    Hospital(){
     this.staff = new Person[MAX_EMPLOYEES];
     this.staffCount = 0;
    }

    public static int getMaxEmployees() {
        return MAX_EMPLOYEES;
    }

    public Person[] getStaff() {
        return staff;
    }

    public void setStaff(Person[] staff) {
        this.staff = staff;
    }

    public int getStaffCount() {
        return staffCount;
    }

    public void setStaffCount(int staffCount) {
        this.staffCount = staffCount;
    }

    //korzystając z tego, że inne klasy dziedziczą po Person mamy jedną funkcję dodającą
    public void add(Person newPerson){
        if (staffCount < MAX_EMPLOYEES){
            staff[staffCount] = newPerson;
            staffCount++;
        }

    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < staffCount; i++){
            result += staff[i] + "\n";
            }
            return result;
        }
}
