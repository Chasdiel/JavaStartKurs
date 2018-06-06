import java.util.Arrays;

/**
 * Created by Chasdiel on 2017-12-31.
 */
public class PersonDatabase {
    private final int INITIAL_SIZE = 1;
    private Person [] personsArray = new Person[INITIAL_SIZE];
    private int emptyIndex;    // określa pierwsze wolne miejsce w tablicy

    PersonDatabase(){
        personsArray = new Person[INITIAL_SIZE];
        emptyIndex = 0;

    }

    public void add (Person p) {
        int i = 0;
        if(emptyIndex == personsArray.length) {
            personsArray = Arrays.copyOf(personsArray, personsArray.length*2);
        }
        personsArray[emptyIndex] = p;
        emptyIndex++;
    }

    public void remove(Person p) {
        if (p == null)
            return;
        int shift = personsArray.length-1;
        int foundMatch;
        for (int index = 0; index < personsArray.length; index++) {
            System.out.println("Sprawdzam równość referencji obiektów");
            if (p.equals(personsArray[index])) {
                System.out.println("Znalazłem równość referencji");
                foundMatch= index;
                while (shift>foundMatch) {
                    System.out.println("Przesuwam obiekty");
                        personsArray[index] = personsArray[index+1];
                        shift--;
                        index++;
                }
                emptyIndex--;

            } else {
                System.out.println("Nie ma takiej osoby w tablicy!");
            }
        }
    }
//ewentualnie - szybciej i z wykorzystaniem System.arraycopy:
    /*
    public void remove (Person p) {
        if (p == null)
            return;

        final int NOT_FOUND = -1;
        int found = NOT_FOUND;
        int i = 0;
        while (i < personsArray.length && found == NOT_FOUND) {
            if (p.equals(personsArray[i])){
                found = i;
            } else {
                i++;
            }
        }
        if (found != NOT_FOUND) {
            System.arraycopy(personsArray, found +1, personsArray, found, personsArray.length - found -1);
            emptyIndex--;
        }
    }
    */
    public Person get(int index) throws ArrayIndexOutOfBoundsException{
        if (index >= emptyIndex || index <0) {
            throw new ArrayIndexOutOfBoundsException("Nie istnieje taki indeks dla tej tablicy!");
        }
        return personsArray[index];
    }

    public int size(){
        return emptyIndex;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PersonsDatabase size: " + size());
        sb.append("\n");
        for (int i = 0; i <emptyIndex; i++) {
            sb.append(personsArray[i].toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
