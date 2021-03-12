package de.hska.iwi.ads.solution.hashtable;


public class Hashtable<K extends Comparable<K>, V> extends de.hska.iwi.ads.dictionary.AbstractHashMap<K, V> {

    private int length;

    public Hashtable(int capacity) {
        super(capacity);
        length = capacity;
    }

    @SuppressWarnings("unchecked")
    public V get(Object o) {

        K key = (K) o;
        int index = key.hashCode() % length;
        int count = 0;
        while (!(hashtable[index] == null || key.compareTo(hashtable[index].getKey()) == 0)) {
            count++;
            index += count * count;
            index %= length;
        }
        return (hashtable[index] == null) ? null : hashtable[index].getValue();
    }

    public V put(K key, V value) {

        int index = key.hashCode() % (10);
        System.out.println("Key: " + key);
        System.out.println("Index: " + index);
        int count = 0;
        while (!(hashtable[index] == null || key.compareTo(hashtable[index].getKey()) == 0)) {
            count++;
            index += count * count;
            index %= length;
            System.out.println("WHILE AUSGEFÜHRT");
        }
        System.out.println("Index_unter_while: " + index);

        Entry<K, V> entry = hashtable[index];
        if (entry == null) {
            hashtable[index] = new SimpleEntry<>(key, value);
            System.out.println("hashtable[index] == 0");
            size++;
            return value;
        }
        V oldValue = entry.getValue();
        entry.setValue(value);
        System.out.println("oldvalue: " + oldValue);
        return oldValue;
    }


}