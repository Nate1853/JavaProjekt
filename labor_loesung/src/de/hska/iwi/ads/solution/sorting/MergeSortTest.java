package de.hska.iwi.ads.solution.sorting;

import de.hska.iwi.ads.sorting.Sort;

/**
 * @autor : kosa1033 - Salina Koerner
 * @autor : hana1020 - Nathanael Hazard
 */

/*
Die Tests sind in ArrayTest!
 */

public class MergeSortTest extends ArrayTest {

    @Override
    public <E extends Comparable<E>> Sort<E> createSort() {
        return new Mergesort<>();
    }
}

