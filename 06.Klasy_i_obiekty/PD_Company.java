public class Company {
    public static void main(String[] args) {
        Employee stachu = new Employee();
        stachu.dateOfBirth = 1920;
        stachu.firstName = Stanislaw;
        stachu.surname = Browara;

        Employee wlodziu = new Employee();
        wlodziu.dateOfBirth = 1920;
        wlodziu.firstName = Wlodzimierz;
        wlodziu.surname = Wodeczka;

        Employee zdzisiu = new Employee();
        zdzisiu.dateOfBirth = 1926;
        zdzisiu.firstName = Zdzislaw;
        zdzisiu.surname = Jabola;

        System.out.println(Pracownicy);
        System.out.println(zdzisiu.dateOfBirth +   + zdzisiu.firstName  +   + zdzisiu.surname);
        System.out.println(stachu.dateOfBirth +   + stachu.firstName  +   + stachu.surname);
        System.out.println(wlodziu.dateOfBirth +   + wlodziu.firstName  +   + wlodziu.surname);


    }
}
