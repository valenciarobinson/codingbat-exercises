package com.bercier.codingbat.array2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Post4Test {

    @ParameterizedTest
    @MethodSource("post4DataStream")
    public void shouldReturnListOfElementsFollowingTheLastFour(int[] nums, List expectedResult){
        Post4 post4 = new Post4();

        assertEquals(expectedResult, post4.post4(nums));
    }
    static Stream<Arguments> post4DataStream(){
        return Stream.of(
                arguments(new int[]{2,4,1,2}, new ArrayList<Integer>(){{
                    add(1);
                    add(2);
                }}),
                arguments(new int[]{4,1,4,2}, new ArrayList<Integer>(){{
                    add(2);
                }}),
                arguments(new int[]{4,4,1,2,3}, new ArrayList<Integer>(){{
                    add(1);
                    add(2);
                    add(3);
                }}),
                arguments(new int[]{4,2}, new ArrayList<Integer>(){{
                    add(2);
                }}),
                arguments(new int[]{4,4,3}, new ArrayList<Integer>(){{
                    add(3);
                }}),
                arguments(new int[]{4,4}, new ArrayList<Integer>(){{

                }}),
                arguments(new int[]{4}, new ArrayList<Integer>(){{

                }}),
                arguments(new int[]{2,4,1,4,3,2}, new ArrayList<Integer>(){{
                    add(3);
                    add(2);
                }}),
                arguments(new int[]{4,1,4,2,2,2}, new ArrayList<Integer>(){{
                    add(2);
                    add(2);
                    add(2);
                }}),
                arguments(new int[]{3,4,3,2}, new ArrayList<Integer>(){{
                    add(3);
                    add(2);
                }})

        );
    }


}
