package com.bercier.codingbat.array1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.



 */
public class Double23{
    public boolean double23(int[] nums){
        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

        if (numsList.size() <2){
            return false;
        }
        if(numsList.get(0) ==2 && numsList.get(1) == 2) {
            return true;
        }
        else if (numsList.get(0) == 3 && numsList.get(1) == 3) {
            return true;
        }
        return false;
    }

}
