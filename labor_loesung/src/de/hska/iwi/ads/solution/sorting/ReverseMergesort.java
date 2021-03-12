package de.hska.iwi.ads.solution.sorting;

import de.hska.iwi.ads.sorting.Sort;

/**
 * @autor : kosa1033 - Salina Koerner
 * @autor : hana1020 - Nathanael Hazard
 */

public class ReverseMergesort<E extends Comparable<E>> extends AbstrakteBasisklasse<E> implements Sort<E> {


    public void verschmelzen(E[] a, E[] b, int left, int mpoint, int right) {

        int l = left;
        int r = mpoint + 1;

        new ReverseArray<E>().reverse(a, r, right);

        r = right;

        for (int i = left; i <= right; i++) {       // (r <= mpoint || (l <= mpoint && ..) darf weg
            if (a[l].compareTo(a[r]) <= 0) {
                b[i] = a[l];
                l++;
            } else {
                b[i] = a[r];
                r--;
            }
        }

        for (int i = left; i <= right; i++) {
            a[i] = b[i];
        }

    }

}
