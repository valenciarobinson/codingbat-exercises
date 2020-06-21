package com.bercier.codingbat.array1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.

 */
public class SameFirstLast {
    public boolean sameFirstLast(int[] nums) {
            List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

                if (numsList.size() == 0){
                    return false;
                }
                return (numsList.get(0) == numsList.get(nums.length-1));
        }


}


