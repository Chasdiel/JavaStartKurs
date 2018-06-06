/**
 * Created by Chasdiel on 2017-11-02.
 */
public class HospitalApp {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        //korzystając z tego, że inne klasy dziedziczą po Person mamy jedną funkcję dodającą
        hospital.add(new Doctor("Maciek", "Prefeska", 7500, 1300));
        hospital.add(new Nurse("Ania", "Dobroszewska", 2200, 6));
        hospital.add(new Nurse("Marta", "Danielska", 2100, 3));

        System.out.println("Pracownicy szpitala: ");
        System.out.println(hospital);
    }
}
