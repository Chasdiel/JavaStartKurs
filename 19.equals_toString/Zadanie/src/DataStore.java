/**
 * Created by Chasdiel on 2017-10-31.
 */
public class DataStore {
    public static final int MAX_COMPUTERS = 100;

    private Computer[] computers;
    private int computersNumber;

    // konstruktor
    public DataStore() {
        computers = new Computer[MAX_COMPUTERS];
        computersNumber = 0;
    }

    // settery i gettery
    public void setComputers(Computer[] computers) {
        this.computers = computers;
    }

    public int getComputersNumber() {
        return computersNumber;
    }

    public void setComputersNumber(int computersNumber) {
        this.computersNumber = computersNumber;
    }

    // metody

    public void add(Computer comp) {
        if (computersNumber < MAX_COMPUTERS) {
            computers[computersNumber] = comp;
            computersNumber++;
        }
    }

    public int checkAvailability(Computer find) {
        if (find == null)
            return 0;

        int count = 0;
        for (int i = 0; i < computersNumber; i++) {
            if (find.equals(computers[i])) {
                count++;
            }
        }
        return count;
    }

    public Computer[] getComputers() {
        Computer[] comps = new Computer[computersNumber];
        for (int i = 0; i < computersNumber; i++) {
            comps[i] = computers[i];
        }
        return comps;

    }
}