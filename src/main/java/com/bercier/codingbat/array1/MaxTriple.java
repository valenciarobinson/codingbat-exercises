package com.bercier.codingbat.array1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MaxTriple {
    /*
    Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be a least 1.
     */

    public int maxTriple(int[] nums){
        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

        int middleIndex = (numsList.size() -(numsList.size()+1)/ 2);
        List<Integer> firstLastMiddle = Arrays.asList(numsList.get(0), numsList.get(middleIndex), numsList.get(nums.length -1));

        Integer max = Collections.max(firstLastMiddle);

        return max;
    }
}
