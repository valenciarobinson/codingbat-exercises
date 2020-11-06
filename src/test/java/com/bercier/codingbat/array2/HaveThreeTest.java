package com.bercier.codingbat.array2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class HaveThreeTest {

    @ParameterizedTest
    @MethodSource("haveThreeDataStream")
    public void shouldReturnTrueIfThreeAppearsThreeTimes(int[] nums, boolean expectedResult){
        HaveThree haveThree = new HaveThree();

        assertEquals(expectedResult,haveThree.haveThree(nums));

    }
    static Stream<Arguments> haveThreeDataStream(){
        return Stream.of(
                arguments(new int[]{3,1,3,1,3}, true),
                arguments(new int[]{3,1,3,3}, false),
                arguments(new int[]{3,4,3,3,4}, false),
                arguments(new int[]{1,3,1,3,1,2}, false),
                arguments(new int[]{1,3,1,3,1,3}, true),
                arguments(new int[]{1,3,3,1,3}, false),
                arguments(new int[]{1,3,1,3,1,3,4,3}, false),
                arguments(new int[]{3,4,3,4,3,4,4}, true),
                arguments(new int[]{3,3,3}, false),
                arguments(new int[]{1,3}, false),
                arguments(new int[]{1}, false),
                arguments(new int[]{3,1,8,9,0,3,1,3}, true),
                arguments(new int[]{0,3,0,3,0,0,3}, true)


                );
    }
}
