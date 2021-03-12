package de.hska.iwi.ads.solution.sorting;

import static org.junit.jupiter.api.Assertions.*;

import de.hska.iwi.ads.sorting.Sort;
import org.junit.Test;

/**
 * @autor : kosa1033 - Salina Koerner
 * @autor : hana1020 - Nathanael Hazard
 */

/*
Moin
 */

public abstract class ArrayTest {


    public abstract <E extends Comparable<E>> Sort<E> createSort();

    @Test
    public void Array() {
        Sort<Integer> s = createSort();
        Integer[] toSort = {9, 6, 3, 49, 9, 7, 6, 5, 4, 3, 3, 2, 1, 5, 6, 7, 8};
        Integer[] sorted = {1, 2, 3, 3, 3, 4, 5, 5, 6, 6, 6, 7, 7, 8, 9, 9, 49};

        s.sort(toSort);

        assertArrayEquals(sorted, toSort);
    }

    @Test
    public void intArrayUnsorted() {
        Sort<Integer> s = createSort();
        Integer[] toSort = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        Integer[] sorted = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        s.sort(toSort);
        assertArrayEquals(sorted, toSort);
    }

    @Test
    public void NullArray() {
        Sort<Integer> s = createSort();
        Integer[] toSort = {null};
        Integer[] sorted = {null};

        s.sort(toSort);
        assertArrayEquals(sorted, toSort);
    }

    @Test
    public void EinElementArray() {
        Sort<Integer> s = createSort();
        Integer[] toSort = {4, 3, 2, 1};
        Integer[] sorted = {1, 2, 3, 4};

        s.sort(toSort);
        assertArrayEquals(sorted, toSort);
    }

    @Test
    public void siebenElementArray() {
        Sort<Integer> s = createSort();
        Integer[] toSort = {7, 6, 5, 4, 3, 2, 1};
        Integer[] sorted = {1, 2, 3, 4, 5, 6, 7};

        s.sort(toSort);
        assertArrayEquals(sorted, toSort);
    }

    @Test
    public void vieleElementArray() {
        Sort<Integer> s = createSort();
        Integer[] toSort = {20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Integer[] sorted = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        s.sort(toSort);
        assertArrayEquals(sorted, toSort);
    }

    @Test
    public void hunderttausendElementArray() {
        Sort<Integer> s = createSort();
        Integer[] toSort = new Integer[100000];
        for (int i = 0; i < 100000; i++) {
            toSort[i] = 100000 - i;
        }
        Integer[] sorted = new Integer[100000];
        for (int i = 100000; i > 0; i--) {
            sorted[i - 1] = i;
        }

        s.sort(toSort);
        assertArrayEquals(sorted, toSort);
    }
}
