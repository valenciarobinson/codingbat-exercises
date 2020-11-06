package com.bercier.codingbat.array2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TripleUp {

    public boolean tripleUp(int[] nums){
        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

        if(numsList.size() < 3)
            return false;
        return IntStream.range(0,numsList.size()-2).anyMatch(i -> {
                if(numsList.get(i+1) == (numsList.get(i)+1) && numsList.get(i+2) == (numsList.get(i) +2)){
                    return true;
                }
            return false;
        });

    }
}
