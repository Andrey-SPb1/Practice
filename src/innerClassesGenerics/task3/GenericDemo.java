package innerClassesGenerics.task3;

import java.io.Serializable;

public class GenericDemo <T,V,K> {
    private final T t;
    private final V v;
    private final K k;

    public GenericDemo(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }
    public String getClassesName() {
        return t.getClass().getSimpleName() + " " + v.getClass().getSimpleName() +
                " " + k.getClass().getSimpleName();
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }
}
