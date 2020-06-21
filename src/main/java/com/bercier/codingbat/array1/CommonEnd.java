package com.bercier.codingbat.array1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element.
Both arrays will be length 1 or more.

 */
public class CommonEnd {
    public boolean commonEnd(int[] a, int[] b) {
        List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());

        List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
        if(listA.get(0) == listB.get(0) || listA.get(a.length-1) == listB.get(b.length-1)){
            return true;
        }
        else
            return false;
    }
}

