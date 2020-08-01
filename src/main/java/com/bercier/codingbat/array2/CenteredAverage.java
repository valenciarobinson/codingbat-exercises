package com.bercier.codingbat.array2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CenteredAverage {
/*
Return the "centered" average of an array of ints,
which we'll say is the mean average of the values,
 except ignoring the largest and smallest values in
 the array. If there are multiple copies of the smallest
  value, ignore just one copy, and likewise for the largest value.
  Use int division to produce the final average.
  You may assume that the array is length 3 or more.
 */
    public int centeredAverage(int[] nums){
        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

        int sum = numsList.stream().reduce(0,Integer::sum);

        return (sum- Collections.max(numsList)-Collections.min(numsList))/(numsList.size()-2);
    }
}
