package de.hska.iwi.ads.solution.sorting;

import de.hska.iwi.ads.sorting.Reverse;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @autor : kosa1033 - Salina Koerner
 * @autor : hana1020 - Nathanael Hazard
 */

/*
Die Tests sind in ArrayTest!
 */

public class ReverseArrayTest {

    public Reverse<Integer> createSort() {
        return new ReverseArray<>();
    }

    @Test
    public void Array() {
        Reverse<Integer> s = createSort();
        Integer[] toreverse = {9, 6, 3, 49, 9, 7, 6, 5, 4, 3, 3, 2, 1, 5, 6, 7, 8};
        Integer[] reverse = {9, 6, 3, 8, 7, 6, 5, 1, 2, 3, 3, 4, 5, 6, 7, 9, 49};

        s.reverse(toreverse, 3, toreverse.length - 1);
        assertArrayEquals(reverse, toreverse);
    }

    @Test
    public void intArrayUnsorted() {
        Reverse<Integer> s = createSort();
        Integer[] toreverse = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Integer[] reverse = {10, 9, 8, 7, 6, 5, 4, 1, 2, 3};

        s.reverse(toreverse, 7, toreverse.length - 1);
        assertArrayEquals(reverse, toreverse);
    }
}
