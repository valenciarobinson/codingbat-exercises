package com.bercier.codingbat.array2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzArray3 {

    public List fizzArray3(int start, int end){

    return IntStream.range(start,end).boxed().collect(Collectors.toList());
    }
}
