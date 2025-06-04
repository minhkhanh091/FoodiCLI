package app.khanhlm091.foodicli.datastructure;

public class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // Getter
    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }
}
