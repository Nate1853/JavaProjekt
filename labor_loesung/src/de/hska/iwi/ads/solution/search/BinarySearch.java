package de.hska.iwi.ads.solution.search;

import de.hska.iwi.ads.search.Search;

/**
 @autor : kosa1033 - Salina Koerner
 @autor : hana1020 - Nathanael Hazard
 */

public class BinarySearch<E extends Comparable<E>> implements Search<E> {

    @Override
    public int search(E[] a, E key) {
        return search(a, key, 0, a.length - 1);
    }

    @Override
    public int search(E[] a, E key, int left, int right) {

        if (key.compareTo(a[left]) < 0) {
            // System.out.print("Two Small: ");
            return left - 1;
        } else if (key.compareTo(a[right]) > 0) {
            // System.out.print("Too Big: ");
            return (right + 1);
        }

        return binarysearch(a, key, left, right);

    }


    public int binarysearch(E[] a, E key, int left, int right) {


        if (key.compareTo(a[left]) < 0) {
            // System.out.println("Not in array i = biggernumber");
            return left;
        } else if (key.compareTo(a[right]) > 0) {
            // System.out.println("Not in array i = biggernumber");
            return (right + 1);


        } else {
            int mid = (left + right) / 2;
            if ((key.compareTo(a[mid]) == 0) && (mid == 0 || (key.compareTo(a[mid-1]) != 0))) {  /** Neuer Code */
                /*
                while ((mid > 0) && (a[mid - 1] == a[mid])) {
                    mid--;
                }
                Alter Code
                 */
                return mid;
            } else if (key.compareTo(a[mid]) <= 0) {
                return binarysearch(a, key, left, mid - 1);
            } else if (key.compareTo(a[mid]) > 0) {
                return binarysearch(a, key, mid + 1, right);
            } else {
                return -1;

            }

        }
    }
}
