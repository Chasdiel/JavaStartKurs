/**
 * Created by Chasdiel on 2017-11-02.
 */
public class Nurse extends Person {
    private double overtime;

    public Nurse(String fn, String ln, double salary, double overtime){
        super(fn, ln, salary);
        this.overtime = overtime;
    }

    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }

    @Override
    public String toString() {
        return super.toString() + ", Nadgodziny: " + overtime;
    }
}
