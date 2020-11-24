package com.bercier.codingbat.array2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ZeroFrontTest {

    @ParameterizedTest
    @MethodSource("zeroFrontDataStream")
    public void shouldReturnListOfZerosInFront(int[] nums, List expectedResult){
        ZeroFront zeroFront = new ZeroFront();

        assertEquals(expectedResult, zeroFront.zeroFront(nums));
    }
    static Stream<Arguments> zeroFrontDataStream(){
        return Stream.of(
                arguments(new int[]{1,0,0,1}, new ArrayList<Integer>(){
                    {
                        add(0);
                        add(0);
                        add(1);
                        add(1);
                    }
                }),
                arguments(new int[]{0,1,1,0,1}, new ArrayList<Integer>(){
                    {
                        add(0);
                        add(0);
                        add(1);
                        add(1);
                        add(1);
                    }
                }),
                arguments(new int[]{1,0}, new ArrayList<Integer>(){
                    {
                        add(0);
                        add(1);
                    }
                }),
                arguments(new int[]{0,1}, new ArrayList<Integer>(){
                    {
                        add(0);
                        add(1);
                    }
                }),
                arguments(new int[]{1,1,1,0}, new ArrayList<Integer>(){
                    {
                        add(0);
                        add(1);
                        add(1);
                        add(1);
                    }
                }),
                arguments(new int[]{2,2,2,2}, new ArrayList<Integer>(){
                    {
                        add(2);
                        add(2);
                        add(2);
                        add(2);
                    }
                }),
                arguments(new int[]{0,0,1,0}, new ArrayList<Integer>(){
                    {
                        add(0);
                        add(0);
                        add(0);
                        add(1);
                    }
                }),
                arguments(new int[]{-1,0,0,-1,0}, new ArrayList<Integer>(){
                    {
                        add(0);
                        add(0);
                        add(0);
                        add(-1);
                        add(-1);

                    }
                }),
                arguments(new int[]{0,-3,0,-3}, new ArrayList<Integer>(){
                    {
                        add(0);
                        add(0);
                        add(-3);
                        add(-3);
                    }
                }),
                arguments(new int[]{}, new ArrayList<Integer>(){
                    {

                    }
                }),
                arguments(new int[]{9,9,0,9,0}, new ArrayList<Integer>(){
                    {
                        add(0);
                        add(0);
                        add(9);
                        add(9);
                        add(9);
                    }
                })
        );
    }
}
