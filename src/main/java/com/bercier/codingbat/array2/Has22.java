package com.bercier.codingbat.array2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Has22 {
    /*
Given an array of ints,
return true if the array contains a 2 next to a 2 somewhere.
     */

    public boolean has22(int[] nums){
        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

        for(int i =0; i < numsList.size()-1;i++){
            if(numsList.get(i)==2 && numsList.get(i+1) ==2)
                return true;
            //return numsList.stream().anyMatch(n ->numsList.get(i)==2 && numsList.get(i+1)==2);
        }

        return false;
    }
}
