package com.bercier.codingbat.array2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Pre4Test {

    @ParameterizedTest
    @MethodSource("pre4DataStream")
    public void shouldReturnNewListOfElementsBeforeFour(int[] nums, List expectedResult){
        Pre4 pre4 = new Pre4();

        assertEquals(expectedResult, pre4.pre4(nums));
    }
    static Stream<Arguments> pre4DataStream(){
        return Stream.of(
                arguments(new int[]{1,2,4,1}, new ArrayList<Integer>(){
                    {
                        add(1);
                        add(2);
                    }
                }),
                arguments(new int[]{3,1,4}, new ArrayList<Integer>(){
                    {
                        add(3);
                        add(1);
                    }
                }),
                arguments(new int[]{1,4,4}, new ArrayList<Integer>(){
                    {
                        add(1);
                    }
                }),
                arguments(new int[]{1,4,4,2}, new ArrayList<Integer>(){
                    {
                        add(1);
                    }
                }),
                arguments(new int[]{4,4}, new ArrayList<Integer>(){
                    {
                    }
                }),
                arguments(new int[]{3,3,4}, new ArrayList<Integer>(){
                    {
                        add(3);
                        add(3);
                    }
                }),
                arguments(new int[]{1,2,1,4}, new ArrayList<Integer>(){
                    {
                        add(1);
                        add(2);
                        add(1);
                    }
                }),
                arguments(new int[]{2,1,4,2}, new ArrayList<Integer>(){
                    {
                        add(2);
                        add(1);
                    }
                }),
                arguments(new int[]{2,1,2,1,4,2}, new ArrayList<Integer>(){
                    {
                        add(2);
                        add(1);
                        add(2);
                        add(1);
                    }
                })
        );
    }
}
