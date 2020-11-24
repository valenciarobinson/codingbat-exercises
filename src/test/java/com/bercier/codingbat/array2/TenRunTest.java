package com.bercier.codingbat.array2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TenRunTest {

    @ParameterizedTest
    @MethodSource("tenRunDataStream")
    public void shouldReturnNewListOfMultiplesOfTen(int[] nums, List expectedResult) {

        TenRun tenRun = new TenRun();

        assertEquals(expectedResult, tenRun.tenRun(nums));
    }
    static Stream<Arguments> tenRunDataStream(){
        return Stream.of(
                arguments(new int[]{2,10,3,4,20,5}, new ArrayList<Integer>(){
                    {
                        add(2);
                        add(10);
                        add(10);
                        add(10);
                        add(20);
                        add(20);
                    }
                }),
                arguments(new int[]{10,1,20,2}, new ArrayList<Integer>(){
                    {
                        add(10);
                        add(10);
                        add(20);
                        add(20);
                    }
                }),
                arguments(new int[]{10,1,9,20}, new ArrayList<Integer>(){
                    {
                        add(10);
                        add(10);
                        add(10);
                        add(20);
                    }
                }),
                arguments(new int[]{1,2,50,1}, new ArrayList<Integer>(){
                    {
                        add(1);
                        add(2);
                        add(50);
                        add(50);
                    }
                }),
                arguments(new int[]{10,10}, new ArrayList<Integer>(){
                    {
                        add(10);
                        add(10);
                    }
                }),
                arguments(new int[]{10,2}, new ArrayList<Integer>(){
                    {
                        add(10);
                        add(10);
                    }
                }),
                arguments(new int[]{0,2}, new ArrayList<Integer>(){
                    {
                        add(0);
                        add(0);
                    }
                }),
                arguments(new int[]{1,2}, new ArrayList<Integer>(){
                    {
                        add(1);
                        add(2);
                    }
                }),
                arguments(new int[]{1}, new ArrayList<Integer>(){
                    {
                        add(1);
                    }
                }),
                arguments(new int[]{}, new ArrayList<Integer>(){
                    {

                    }
                })

        );
    }
}
