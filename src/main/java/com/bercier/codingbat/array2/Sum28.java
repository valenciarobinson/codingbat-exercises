package com.bercier.codingbat.array2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sum28 {

    public boolean sum28(int[] nums){
        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

        //alternative way to solve is to use multiplication logic
       // return numsList.stream().filter(num -> num == 2).count() == 4;

        return numsList.stream().filter(num -> num == 2).reduce(0,Integer::sum) == 8;
    }

}


