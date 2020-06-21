package com.bercier.codingbat.array1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class  MiddleWay {
/*
Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.

 */
    public List middleWay(int[] a, int[] b) {

        List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());


        return Arrays.asList(listA.get(1), listB.get(1));
    }
}
