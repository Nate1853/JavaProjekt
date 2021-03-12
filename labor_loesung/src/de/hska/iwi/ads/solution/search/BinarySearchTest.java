package de.hska.iwi.ads.solution.search;

import de.hska.iwi.ads.search.Search;
import de.hska.iwi.ads.search.SearchTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @autor : kosa1033 - Salina Koerner
 * @autor : hana1020 - Nathanael Hazard
 */

/*
Die Tests sind in SearchTest!
 */

public class BinarySearchTest extends SearchTest {

    @Override
    public <E extends Comparable<E>> Search<E> createSearch() {
        return new BinarySearch<>();
    }

    /**
     * Unsere neue Tests
     */

    @Test
    void normaltest() {
        Search<Integer> search = createSearch();
        Integer[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        assertEquals(3, search.search(a, 4));
    }

    @Test
    void keyLeftOutOfBounce() {
        Search<Integer> search = createSearch();
        Integer[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        assertEquals(-1, search.search(a, 0));
    }

    @Test
    void keyRightOutOfBounce() {
        Search<Integer> search = createSearch();
        Integer[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        assertEquals(9, search.search(a, 10));
    }

    @Test
    void keyInLeft() {
        Search<Integer> search = createSearch();
        Integer[] a = {1, 2, 4, 5, 6};

        assertEquals(2, search.search(a, 3));
    }

    @Test
    void keyInRight() {
        Search<Integer> search = createSearch();
        Integer[] a = {1, 3, 4, 5, 6};

        assertEquals(1, search.search(a, 2));
    }

    @Test
    void SameInts1() {
        Search<Integer> search = createSearch();
        Integer[] a = {1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 4, 5};

        assertEquals(1, search.search(a, 2));
    }

    @Test
    void SameInts2() {
        Search<Integer> search = createSearch();
        Integer[] a = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 4, 5};

        assertEquals(0, search.search(a, 2));
    }

}
