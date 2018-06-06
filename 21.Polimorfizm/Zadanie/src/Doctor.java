/**
 * Created by Chasdiel on 2017-11-02.
 */
public class Doctor extends Person {
    private double bonus;

    public Doctor(String fn, String ln, double salary, double bonus){
        super(fn, ln, salary);
        this. bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + ", Premia: " + bonus;
    }
}
