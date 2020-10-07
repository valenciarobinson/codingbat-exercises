package com.bercier.codingbat.array2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzArray2 {

    public List<String> fizzArray2(int n){
        return IntStream.range(0,n).mapToObj(str -> str +"").collect(Collectors.toList());
    }
}
