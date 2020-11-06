package com.bercier.codingbat.array2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HaveThree {

    /*
Given an array of ints,
return true if the value 3 appears in the array exactly 3 times,
and no 3's are next to each other.
     */

    public boolean haveThree(int[] nums){
        List<Integer> numsList= Arrays.stream(nums).boxed().collect(Collectors.toList());

        if(numsList.size()<2)
            return false;

        return IntStream.range(0,numsList.size()).filter(i ->{
            if(i==numsList.size()-1 && numsList.get(i)==3 && numsList.get(i-1)!=3)
                return true;
            else if(i< numsList.size()-1 && numsList.get(i) == 3 && numsList.get(i+ 1) !=3)
                return true;
            return false;
        }).count()==3;
    }
}
