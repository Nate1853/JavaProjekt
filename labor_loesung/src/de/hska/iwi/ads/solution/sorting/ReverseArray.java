package de.hska.iwi.ads.solution.sorting;

import de.hska.iwi.ads.sorting.Reverse;
import de.hska.iwi.ads.sorting.Sort;

/**
 * @autor : kosa1033 - Salina Koerner
 * @autor : hana1020 - Nathanael Hazard
 */

public class ReverseArray<E extends Comparable<E>> implements Sort<E>, Reverse<E> {

    @Override
    public void sort(E[] a) {
        reverse(a, 0, a.length - 1);
    }

    @Override
    public void reverse(E[] a, int from, int to) {

        if (from == to) {
            return;
        }

        for (int i = from; i <= ((to - from - 1) / 2) + from; i++) {
            E temp = a[i];
            a[i] = a[to + from - i];
            a[to + from - i] = temp;
        }
    }
}

