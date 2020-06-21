package com.bercier.codingbat.array1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.

 */
public class MaxEnd3 {

    public List maxEnd3(int[] nums){
        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

        if (numsList.get(0)> numsList.get(nums.length -1)){
            return Arrays.asList(numsList.get(0),numsList.get(0), numsList.get(0));
        }
        else if (numsList.get(nums.length-1) > numsList.get(0)){
            return Arrays.asList(numsList.get(nums.length-1),numsList.get(nums.length-1),numsList.get(nums.length-1));
        }
        else
            return Arrays.asList(numsList.get(0),numsList.get(0),numsList.get(0));
    }
}
