package de.hska.iwi.ads.solution.sorting;

import de.hska.iwi.ads.sorting.Sort;


/**
 * @autor : kosa1033 - Salina Koerner
 * @autor : hana1020 - Nathanael Hazard
 */
/*
 Hallo!
     Damit wir die ArrayTest-TestKlasse für Mergesort, ReverseArray und ReverseMergeSort
     nutzen können, nutzen diese 3 Klassen das gegebene Interface "Sort".
     ArrayTest ist abstrakt, damit wir je MergesortTest, ReverseArrayTest und ReverseMergesortTest
     in ArrayTest auf einmal ausführen können.
 */


public class Mergesort<E extends Comparable<E>> extends AbstrakteBasisklasse<E> implements Sort<E> {


    protected void verschmelzen(E[] a, E[] b, int left, int mpoint, int right) {

        int l = left;
        int r = mpoint + 1;

        for (int i = left; i <= right; i++) {
            if (r > right || (l <= mpoint && a[l].compareTo(a[r]) <= 0)) {
                b[i] = a[l];
                l++;
            } else {
                b[i] = a[r];
                r++;
            }
        }


        for (int i = left; i <= right; i++) {
            a[i] = b[i];
        }
    }
}
