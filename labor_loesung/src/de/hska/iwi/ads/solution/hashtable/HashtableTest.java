package de.hska.iwi.ads.solution.hashtable;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;

public class HashtableTest extends de.hska.iwi.ads.dictionary.MapTest {

    @Override
    public <K extends Comparable<K>, V> Map<K, V> createMap() {
        return new Hashtable<K,V>(100);
    }

    private Map<Integer, String> myHash = createMap();
    private Map<String, String> Hash = createMap();


    @Test
    void TestNull() {
        myHash.put(6, "Sechs");
        assertNull(myHash.get(5));
    }

    @Test
    void Test1() {
        myHash.put(1,"Eins");
        myHash.put(2,"Zwei");
        myHash.get(1);
        myHash.get(2);
        assertEquals(2,myHash.size());
    }

    @Test
    void Test2() {
        myHash.put(6, "Falsch");
        myHash.put(6, "Sechs");
        assertEquals("Sechs",myHash.get(6));
    }

    @Test
    void Test3() {
        Hash.put("1" , "value");
        Hash.put("2" , "value");
        Hash.put("3" , "value");
        Hash.put("4" , "value");
        Hash.put("5" , "value");
        Hash.put("6" , "value");
        Hash.put("7" , "value");
        Hash.put("8" , "value");
        Hash.put("9" , "value");
        Hash.put("10", "value");
        Hash.put("11" , "value");
        Hash.put("12" , "value");
        Hash.put("13" , "value");
        Hash.put("14" , "value");




        //assertEquals("value",Hash.get("3"));
    }
}
