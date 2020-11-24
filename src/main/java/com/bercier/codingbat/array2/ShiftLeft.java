package com.bercier.codingbat.array2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ShiftLeft {

    public List shiftLeft(int[] nums){
        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

//
//        numsList.forEach(i-> {
//            if(i< numsList.size()-1) {
//                Collections.swap(numsList,i,i+1);
//            }
//        });


        Collections.rotate(numsList,numsList.size()-1);


        return numsList;
    }
}
