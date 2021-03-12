package de.hska.iwi.ads.solution.list;

import de.hska.iwi.ads.dictionary.AbstractDoubleLinkedList;

public class DoubleLinkedList<K extends Comparable <K>,V> extends AbstractDoubleLinkedList<K,V> {

    @SuppressWarnings("unchecked")
    public V get(Object o){
        ListElement element = findElement((K)o);
        return (element == null)?null:element.entry.getValue();
    }

    public V put(K key, V value){
        ListElement element = findElement(key);
        if (element != null){
            V oldValue = element.entry.getValue();
            element.entry.setValue(value);
            return oldValue;
        }
        head = new ListElement(new SimpleEntry<K, V>(key, value), null, head);
        size++;
        return null;
    }

    private ListElement findElement(K key){
        ListElement position = head;

        for(int i = 0; i < size; i++){
            if(key.compareTo(position.entry.getKey()) == 0){
                return position;
            }
            position = position.next;

        }
        return null;
    }

}