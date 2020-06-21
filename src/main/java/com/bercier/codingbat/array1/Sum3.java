package com.bercier.codingbat.array1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sum3 {

        public int sumOfThree(int[] nums){
            List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

            return (numsList.get(0) + numsList.get(1) + numsList.get(2));

        }


    }

