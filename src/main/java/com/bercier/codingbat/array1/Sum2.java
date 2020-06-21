package com.bercier.codingbat.array1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
/*Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.

 */
public class Sum2 {

    public int sum2(int[] nums){
        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

//        return numsList.get(nums.length)==0?0:numsList.get(nums.length)==1?(numsList.get(0) + numsList.get(1));
        if (numsList.size()==0)
            return 0;
        else if (numsList.size()==1)
            return numsList.get(0);
        else
            return numsList.get(0)+numsList.get(1);
    }
}

