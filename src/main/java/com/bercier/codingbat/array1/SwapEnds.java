package com.bercier.codingbat.array1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SwapEnds {
    /*
        Given an array of ints, swap the first and last elements in the array.
        Return the modified array. The array length will be at least 1.

     */
    public List swapEnds(int[] nums){
        final int FIRST_INDEX = 0;

        final int LAST_INDEX = nums.length-1;

        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

        int firstElementValue = numsList.get(0);

        int lastElementValue = numsList.get(numsList.size()-1);

        numsList.set(LAST_INDEX, firstElementValue);

        numsList.set(FIRST_INDEX,lastElementValue);

        return numsList;
    }
}
