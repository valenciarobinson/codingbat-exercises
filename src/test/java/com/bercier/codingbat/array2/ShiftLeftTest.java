package com.bercier.codingbat.array2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ShiftLeftTest {

    @ParameterizedTest
    @MethodSource("shiftLeftDataStream")
    public void shouldReturnListWithElementsShiftedLeft(int[] nums, List expectedResult){
        ShiftLeft shiftLeft = new ShiftLeft();

        assertEquals(expectedResult, shiftLeft.shiftLeft(nums));
    }
    static Stream<Arguments> shiftLeftDataStream(){
        return Stream.of(
                arguments(new int[]{6,2,5,3}, new ArrayList<Integer>(){
                    {
                add(2);
                add(5);
                add(3);
                add(6);
                     }
                }),
                arguments(new int[]{1,2}, new ArrayList<Integer>(){
                    {
                        add(2);
                        add(1);
                    }
                }),
                arguments(new int[]{}, new ArrayList<Integer>(){
                    {
                    }
                }),
                arguments(new int[]{1,1,2,2,4}, new ArrayList<Integer>(){
                    {
                        add(1);
                        add(2);
                        add(2);
                        add(4);
                        add(1);
                    }
                }),
                arguments(new int[]{1,1,1}, new ArrayList<Integer>(){
                    {
                        add(1);
                        add(1);
                        add(1);
                    }
                }),
                arguments(new int[]{1,2,3}, new ArrayList<Integer>(){
                    {
                        add(2);
                        add(3);
                        add(1);
                    }
                })


        );

    }
}
