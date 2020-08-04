package com.bercier.codingbat.array2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sum13 {
    /*
    Return the sum of the numbers in the array, returning 0 for an empty array.
    Except the number 13 is very unlucky, so it does not count and numbers
    that come immediately after a 13 also do not count.
     */

    public int sum13(int[] nums){

        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

        int sum = 0;
        for(int i=0; i < numsList.size(); i++)
        {
            if(numsList.get(i)== 13)
            {
                i++;
            }
            else
                sum+= numsList.get(i);

        }
        return sum;
    }
}
