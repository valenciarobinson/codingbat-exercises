package com.bercier.codingbat.array2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sum67 {
    /*Return the sum of the numbers in the array,
    except ignore sections of numbers starting with a 6
    and extending to the next 7 (every 6 will be followed by at least one 7).
    Return 0 for no numbers.
     */

    public int sum67(int[] nums){
        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

        int sum = 0;
        boolean betweenSixandSeven = false;

        for(int i = 0; i < numsList.size(); i++){
            if (numsList.get(i) ==6 ){
                betweenSixandSeven = true;
            }
            if (!betweenSixandSeven)
                sum+= numsList.get(i);
            if (betweenSixandSeven && numsList.get(i)==7)
                betweenSixandSeven = false;
        }
       return sum;

    }
}
