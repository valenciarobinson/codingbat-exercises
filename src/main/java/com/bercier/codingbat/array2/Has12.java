package com.bercier.codingbat.array2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Has12 {
    /*   /*Given an array of ints,
     return true if there is a 1 in the array
     with a 2 somewhere later in the array.*/


    public boolean has12(int[] nums){

        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        int indexOfFirstOne = IntStream.range(0, nums.length)
                .filter(index -> numsList.get(index)==1)//Find First one
                .findFirst()
                .orElseGet(() -> -999);
        if(indexOfFirstOne == -999)
            return false;
        List<Integer> numsListSplit = numsList.subList(indexOfFirstOne,numsList.size()); //Creating a new list that starts at the index of One

        return numsListSplit.stream().anyMatch(i -> i == 2);

        }
}
