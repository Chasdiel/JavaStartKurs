package Data;

/**
 * Created by Chasdiel on 2017-10-29.
 */
public class Wheel extends Parts {
    public int size;
    public int width;

    public String toString(){
        return "" + model + " " + series + " " + idNumber + " " + producer + " " + size + " " + width;
    }
}
