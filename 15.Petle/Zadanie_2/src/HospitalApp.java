import java.util.Scanner;

public class HospitalApp {
    public static final int EXIT = 0;
    public static final int ADD_PATIENT = 1;
    public static final int PRINT_PATIENTS = 2;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option = -1;

        Hospital hospital = new Hospital();

        while (option != EXIT) {
            System.out.println("Dostępne opcje: ");
            System.out.println("0 - wyjście z programu");
            System.out.println("1 - dodanie pacjenta");
            System.out.println("2 - wyświetlenie listy pacjentów");

            System.out.println("Wybierz opcję: ");
            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case ADD_PATIENT:
                    Patient patient = new Patient();
                    System.out.println("Imię: ");
                    patient.setName(input.nextLine());
                    System.out.println("Nazwisko: ");
                    patient.setSurname(input.nextLine());
                    System.out.println("PESEL: ");
                    patient.setPesel(input.nextLine());
                    hospital.addPatient(patient);
                    break;
                case PRINT_PATIENTS:
                    hospital.printPatients();
                    break;
                case EXIT:
                    System.out.println("Zamykam program!");
                    break;
                default:
                    System.out.println("Nie znaleziono takiej opcji");
            }
        }
        input.close();
    }
}