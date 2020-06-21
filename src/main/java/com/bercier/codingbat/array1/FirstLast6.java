package com.bercier.codingbat.array1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
 */
public class FirstLast6 {
    public boolean firstLast6(int[] nums) {
        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

        return (numsList.get(0) == 6 || numsList.get(nums.length -1) == 6);
    }
}
