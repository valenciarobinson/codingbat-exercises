package com.bercier.codingbat.array1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FrontPiece {
    public List frontPiece(int[] nums){
        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

        if(numsList.size() < 2)
            return numsList;
        else
            return Arrays.asList(numsList.get(0), numsList.get(1));
    }
}
