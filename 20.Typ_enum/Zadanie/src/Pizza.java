/**
 * Created by Chasdiel on 2017-11-01.
 */
public enum Pizza {
    MARGHERITA(true, true, false, false),
    CAPRICIOSA(true, true, false, true),
    PROSCIUTTIO(true, true, true, false);

    private boolean tomatoSauce;
    private boolean cheese;
    private boolean mushrooms;
    private boolean ham;


    private Pizza (boolean ts, boolean ch, boolean m, boolean h){
        this.tomatoSauce = ts;
        this.cheese = ch;
        this.mushrooms = m;
        this.ham = h;
    }

    public boolean getTomatoSauce(){
        return tomatoSauce;
    }

    public boolean getCheese(){
        return cheese;
    }

    public boolean getMushrooms(){
        return mushrooms;
    }

    public boolean getHam(){
        return ham;
    }

    @Override
    public String toString() {
        // przypisanie nazwy pizzy poprzez stworzenie z pola enum obiektu String używając this.name()
        String result = this.name() + "(";
        //informacja o składnikach
        if (tomatoSauce){
            result = result + "sos pomidorowy";
        }
        if (cheese) {
            result = result + ", ser";
        }
        if (mushrooms) {
            result = result + ", pieczarki";
        }
        if (ham) {
            result = result + ", szynka";
        }
        result = result + ")";

        return result;
    }
}

