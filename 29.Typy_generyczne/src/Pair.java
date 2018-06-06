/**
 * Created by Chasdiel on 2017-12-28.
 */
public class Pair<T, V> {
    private T valueT;
    private V valueV;

    public T getValueT() {
        return valueT;
    }

    public void setValueT(T valueT) {
        this.valueT = valueT;
    }

    public V getValueV() {
        return valueV;
    }

    public void setValueV(V valueV) {
        this.valueV = valueV;
    }

    public Pair(T t, V v){
        setValueT(t);
        setValueV(v);
    }
}
