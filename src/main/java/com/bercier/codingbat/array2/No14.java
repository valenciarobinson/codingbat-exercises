package com.bercier.codingbat.array2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class No14 {
        /*
Given an array of ints, return true if it contains no 1's or it contains no 4's.
     */

    public boolean no14(int[] nums){
        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

        boolean noOnes = true;
        boolean noFours = true;

        for(int i =0; i < numsList.size();i++){
            if (numsList.get(i)==1)
                noOnes=false;
            if (numsList.get(i)==4)
                noFours=false;
        }
        return (noOnes||noFours);
//        numsList.stream().filter(num -> num != 1 && num != 4).count();
//        numsList.stream().filter(num -> num==1 || num == 4).count();
//        return true;
    }

}
