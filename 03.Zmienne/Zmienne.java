public class Zmienne {
    public static void main(String[] args) {
        String firstName = "S�awek";
        String lastName = "Ludwiczak";
        final String pesel = "12312312312";
        int age = 25;
        double height = 179.5;
  
        System.out.print("Cze�� ");
        System.out.print(firstName);
        System.out.print(" ");
        System.out.println(lastName);
  
        System.out.println("Poni�ej jest kilka informacji o Tobie:");
        System.out.print("Tw�j PESEL to: ");
        System.out.println(pesel);
        System.out.print("Masz ");
        System.out.print(age);
        System.out.println(" lat");
  
        System.out.print("Tw�j wzrost to: ");
        System.out.print(height);
        System.out.print("cm");
    }
}