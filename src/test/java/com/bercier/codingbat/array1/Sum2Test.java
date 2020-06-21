package com.bercier.codingbat.array1;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Sum2Test {
    @ParameterizedTest
    @MethodSource("Sum2DataStream")
    public void shouldReturnSumOfFirstTwoElements(int[] nums, int expectedResult){

        Sum2 sum2 = new Sum2();

        assertEquals(expectedResult, sum2.sum2(nums));
    }
    static Stream<Arguments> Sum2DataStream(){
        return Stream.of(
                arguments(new int[]{1,2,3}, 3),
                arguments(new int[]{1,1}, 2),
                arguments(new int[]{1,2}, 3),
                arguments(new int[]{1}, 1),
                arguments(new int[]{}, 0),
                arguments(new int[]{4,5,9}, 9),
                arguments(new int[]{4}, 4)

        );
    }
}
