package com.bercier.codingbat.array1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Make2 {
    /*
    Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a followed by the elements from b. The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays.
     */

    public List make2(int[] a, int[] b){
        List<Integer> aList = Arrays.stream(a).boxed().collect(Collectors.toList());

        List<Integer> bList = Arrays.stream(b).boxed().collect(Collectors.toList());

        List<Integer> newArray = new ArrayList<>(2);

        if(aList.size()==1){
            newArray.add(aList.get(0));
            newArray.add(bList.get(0));
            return newArray;
        }
        else if (aList.size() >=2){
            newArray.add(aList.get(0));
            newArray.add(aList.get(1));
            return newArray;
        }
        else if (aList.size() <= 1){
            newArray.add(bList.get(0));
            newArray.add(bList.get(1));
            return newArray;
        }
        else
            return newArray;


    }

}
