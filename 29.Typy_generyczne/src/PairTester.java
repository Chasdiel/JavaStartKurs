/**
 * Created by Chasdiel on 2017-12-28.
 */
public class PairTester{
    public static void main(String[] args) {
        Pair<String, String> pair1 = new Pair<>("tekst", "drugiTekst");
        Pair<Integer, String> pair2 = new Pair<>(213, "tekst liczby");
        Pair<Double, Integer> pair3 = new Pair<>(256132.0, 13);

        PairTester.printPairInfo(pair1);
        PairTester.printPairInfo(pair2);
        PairTester.printPairInfo(pair3);
    }

    static <A,B> void printPairInfo(Pair<A,B> pair){
        System.out.println("Para: T - " + pair.getValueT() + " oraz V - " + pair.getValueV());
    }
}
