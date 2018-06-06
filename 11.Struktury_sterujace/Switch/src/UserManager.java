/**
 * Created by Chasdiel on 2017-10-17.
 */
public class UserManager {
    public static void main(String[] args){
        User user = new User("Andrzej", "Kowalski");

        System.out.println("Wybierz opcje: ");
        System.out.println("0 - wyjście z programu");
        System.out.println("1 - wyświetl informacje o uzytkowniku");
        System.out.println("2 - modyfikuj dane użytkownika");

        int option = 1;

        if (option == 0) {
            System.out.println("Bye bye!");
        } else if (option == 1){
            System.out.println("Użytkownik: " + user.getFirstName() + " " + user.getLastName());
        } else if (option == 2) {
            user.setFirstName("Marian");
            user.setLastName("Powolny");
            System.out.println("Zmieniono dane użytkownika na: " + user.getFirstName() + user.getLastName());
        }

        switch (user.getFirstName()){
            case ("krzysiek"):
                System.out.println("Witaj Krzychu! Witaj w programie.");
                break;
            case ("Jan") :case "Andrzej":
                System.out.println("Witam Panie Prezesie. Jak mija dzień?");
                break;
            default:
                System.out.println("Witaj nieznany Użytkowniku!");

        }
    }
}
