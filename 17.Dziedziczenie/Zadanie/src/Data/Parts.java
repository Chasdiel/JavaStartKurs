package Data;

/**
 * Created by Chasdiel on 2017-10-29.
 */
public class Parts {
    public int idNumber;
    public String model;
    public String series;
    public String producer;


    public String toString(){
        return "" + model + " " + series + " " + idNumber + " " + producer;
    }


}
