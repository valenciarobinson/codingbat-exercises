package com.bercier.codingbat.array1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Fix23 {
/*
Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.

 */
    public List fix23(int[] nums){
        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

        if(numsList.get(0) == 2 && numsList.get(1) == 3){
            numsList.set(1, 0);
        }
        else  if(numsList.get(1) == 2 && numsList.get(2) == 3){
            numsList.set(2, 0);
        }
            return numsList;
    }
}
