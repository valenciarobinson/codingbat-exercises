package com.bercier.codingbat.array1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MakeMiddle {

    /*
Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array. The original array will be length 2 or more.

     */

    public List makeMiddle(int[] nums)
    {
        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

        int middleElementIndex = (numsList.size()/2)-1;

        return Arrays.asList(numsList.get(middleElementIndex), numsList.get(middleElementIndex+1));
    }
}
