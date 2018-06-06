/**
 * Created by Chasdiel on 2017-10-30.
 */
public class Apple extends Fruit{
    private String odmiana;

    public Apple(String odmiana){
     //   super(); //niejawnie automatycznie wywoływany kod
        setOdmiana(odmiana);
    }

    public String getOdmiana() {
        return odmiana;
    }

    public void setOdmiana(String odmiana) {
        this.odmiana = odmiana;
    }


    public void printInfo(){
        super.printInfo();
        System.out.println("Typ odmiany jabłka: " + odmiana);
    }
}
