package com.bercier.codingbat.array1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
/*
Given an int array, return a new array with double the length where its last element is the same as the original array, and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.

 */
public class MakeLast {
    public List makeLast(int[] nums){

        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

        int doubleSizeOfArray = numsList.size()*2;

        int lastElementOfnumsList = numsList.get(nums.length-1);
        /*Collections.nCopies() is to return an immutable list which contains n copies of given object.

         */
        List<Integer> doubleSizeList = new ArrayList<Integer>(Collections.nCopies(doubleSizeOfArray,0));


        int lastElementOfDoubleSizeList = doubleSizeList.get(doubleSizeList.size()-1);

        //use set method to replace the lastElementofList with a lastElementofArray
        doubleSizeList.set(doubleSizeList.size()-1, lastElementOfnumsList);

    //    doubleSizeList.set(lastElementOfDoubleSizeList, doubleSizeList.get(0));

        return doubleSizeList;
    }
}
