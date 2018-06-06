import java.io.*;
import java.util.Scanner;

/**
 * Created by Chasdiel on 2017-11-23.
 */
public class CompanyApp {
    public static final String FILE_STORE = "employees.info";
    public static final int READ_FROM_USER = 1;
    public static final int READ_FROM_FILE = 2;

    public static void main(String[] args) {
        CompanyApp compApp = new CompanyApp();
        Company company = new Company();

        Scanner reader = new Scanner(System.in);
        System.out.println("Wprowadzanie danych pracowników[1]: " + READ_FROM_USER);
        System.out.println("Wczytywanie danych pracowników[2]: " + READ_FROM_FILE);

        int option = reader.nextInt();
        if (option == READ_FROM_USER) {
            compApp.writeData(company);
        } else if (option == READ_FROM_FILE) {
            compApp.readData(company);
        }
        reader.close();
    }




    public void writeData (Company company){
        try (
                Scanner reader = new Scanner(System.in);
                FileOutputStream fos = new FileOutputStream(FILE_STORE);
                ObjectOutputStream oos = new ObjectOutputStream(fos);)
        {
            for (int i = 0; i< Company.LIMIT; i++) {
                System.out.println("Wprowadź imię: ");
                String firstName = reader.nextLine();
                System.out.println("Podaj nazwisko: ");
                String lastName = reader.nextLine();
                System.out.println("Podaj pensję: ");
                double salary = reader.nextDouble();
                reader.nextLine();

                company.add(new Employee(firstName, lastName, salary), i);
            }
            oos.writeObject(company);
        }   catch(IOException e) {
            e.printStackTrace();
        }
    }

    public void readData(Company company) {
        try (FileInputStream fis = new FileInputStream(FILE_STORE);
             ObjectInputStream ois = new ObjectInputStream(fis);)
        {
            company = (Company) ois.readObject();

            for (int i = 0; i < Company.LIMIT; i++) {
                System.out.println(company.getEmployees()[i]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

}
