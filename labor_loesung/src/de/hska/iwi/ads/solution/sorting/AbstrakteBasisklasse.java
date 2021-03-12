package de.hska.iwi.ads.solution.sorting;

import de.hska.iwi.ads.sorting.AbstractMergesort;

/**
 @autor : kosa1033 - Salina Koerner
 @autor : hana1020 - Nathanael Hazard
 */


public abstract class AbstrakteBasisklasse<E extends Comparable<E>> extends AbstractMergesort<E> {

    @Override
    protected void mergesort(E[] a, int left, int right) {
        if (left < right) {
            int mpoint = (left + right) / 2;

            mergesort(a, left, mpoint);
            mergesort(a, mpoint + 1, right);


            verschmelzen(a, b, left, mpoint, right);
        }
    }

    protected abstract void verschmelzen(E[] a, E[] b, int left, int mpoint, int right);

}
