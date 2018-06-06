/**
 * Created by Chasdiel on 2017-11-15.
 */
public class BubbleSortTest {
    public static void main(String[] args) {
        Sortable newSorter  = new Sortable() {
            @Override
            public int[] sort(int[] ar) {

                for (int i=0; i<ar.length; i++){
                    System.out.println("*");
                    for (int j=0; j< ar.length-i-1; j++){
                        System.out.println(ar[j] + ">" + ar[j+1] + " " + (ar[j] > ar[j+1]));
                        if (ar[j] > ar[j+1]){
                            int temp;
                            temp = ar[j+1];
                            ar[j+1] = ar[j];
                            ar[j] = temp;
                        }
                    }
                }
                return ar;
            }
        };

        int[] table = {12,3,5,67,15,14,23,54,1,10};
        newSorter.sort(table);
        for(int i : table){
            System.out.println(i);
        }
    }
}
