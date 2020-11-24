package com.bercier.codingbat.array2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class WithoutTenTest {

    @ParameterizedTest
    @MethodSource("withoutTenDataStream")
    public void shouldReturnNewListOf10sTo0s(int[] nums, List expectedResult){
        WithoutTen withoutTen = new WithoutTen();

        assertEquals(expectedResult,withoutTen.withoutTen(nums));
    }
    static Stream<Arguments> withoutTenDataStream(){
        return Stream.of(
                arguments(new int[]{1,10,10,2}, new ArrayList<Integer>(){
                    {
                        add(1);
                        add(2);
                        add(0);
                        add(0);
                    }
                }),
                arguments(new int[]{10,2,10}, new ArrayList<Integer>(){
                    {
                        add(2);
                        add(0);
                        add(0);
                    }
                }),
                arguments(new int[]{1,99,10}, new ArrayList<Integer>(){
                    {
                        add(1);
                        add(99);
                        add(0);
                    }
                }),
                arguments(new int[]{10,13,10,14}, new ArrayList<Integer>(){
                    {
                        add(13);
                        add(14);
                        add(0);
                        add(0);
                    }
                }),
                arguments(new int[]{10,13,10,14,10}, new ArrayList<Integer>(){
                    {
                        add(13);
                        add(14);
                        add(0);
                        add(0);
                        add(0);
                    }
                }),
                arguments(new int[]{10,10,3}, new ArrayList<Integer>(){
                    {
                        add(3);
                        add(0);
                        add(0);
                    }
                }),
                arguments(new int[]{1}, new ArrayList<Integer>(){
                    {
                        add(1);
                    }
                }),
                arguments(new int[]{13,1}, new ArrayList<Integer>(){
                    {
                        add(13);
                        add(1);
                    }
                }),
                arguments(new int[]{10}, new ArrayList<Integer>(){
                    {
                        add(0);
                    }
                }),
                arguments(new int[]{}, new ArrayList<Integer>(){
                    {
                    }
                })
        );
    }
}
