package com.bercier.codingbat.array2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pre4 {
    public List pre4(int[] nums){

        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

       int indexOfFour = numsList.indexOf(4);

       List<Integer> pre4List = numsList.subList(0,indexOfFour);

       return pre4List;

    }
}
