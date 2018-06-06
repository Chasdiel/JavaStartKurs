import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

/**
 * Created by Chasdiel on 2018-02-27.
 */
public class CompanyApp {
    public static final int ADD_EMPLOYEE = 1;
    public static final int FIND_EMPLOYEE = 2;
    public static final int EXIT =3;

    private Company company;
    private CompanyApp () {
        this.company = new Company();
    }

    public static void main(String[] args) throws IOException {
        CompanyApp compApp = new CompanyApp();

        System.out.println("Program pozwala dodać nowego pracownika do listy oraz wyszukać pracownika z listy.");

        System.out.println("Co chesz zrobić?");


        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        {
            int option;
            do{
                compApp.printOptions();
                option = Integer.parseInt(br.readLine());
                switch (option) {
                    case CompanyApp.ADD_EMPLOYEE:
                        compApp.createEmployee(br);
                        break;
                    case CompanyApp.FIND_EMPLOYEE:
                        compApp.findAndPrintEmployee(br);
                        break;
                    case CompanyApp.EXIT:
                        break;
                }
            }
            while (option!=CompanyApp.EXIT);

        } catch(Exception e){
            System.err.println("Nastąpił błąd programu.");
        }
    }

    private void printOptions(){
        System.out.println("1 - dodaj nowego pracownika");
        System.out.println("2 - wyszukaj informacje po nazwisku");
        System.out.println("3 - wyjdź z programu");
    }

    private void createEmployee(BufferedReader br) throws IOException{
        Employee employee = new Employee();

        System.out.println("Podaj imię: ");
        employee.setFirstName(br.readLine());

        System.out.println("Podaj nazwisko: ");
        employee.setLastName(br.readLine());

        System.out.println("Podaj pensję: ");
        employee.setSalary(Integer.parseInt(br.readLine()));

        company.addEmployee(employee);
    }

    private void findAndPrintEmployee(BufferedReader br) throws IOException{
        System.out.println("Wyszukiwanie pracownika.");
        System.out.println("Podaj imię: ");
        String firstName = br.readLine();
        System.out.println("Podaj nazwisko: ");
        String lastName = br.readLine();
        //String key = firstName + " " + lastName;
        Employee foundedRychu = company.getEmployee(firstName, lastName);      // czemu nie muszę tu tworzyć obiektu?
        System.out.println(foundedRychu);

        System.out.println("Cała mapa pracowników:");
        company.printAllWorkers();

    }
}
