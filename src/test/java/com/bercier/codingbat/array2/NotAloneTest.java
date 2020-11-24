package com.bercier.codingbat.array2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NotAloneTest {

    @ParameterizedTest
    @MethodSource("notAloneDataStream")
    public void shouldReturnListOfElementsReplacedByValue(int[] nums, int val, List expectedResult){
        NotAlone notAlone = new NotAlone();

        assertEquals(expectedResult, notAlone.notAlone(nums, val));
    }
    static Stream<Arguments> notAloneDataStream(){
        return Stream.of(
                arguments(new int[]{1,2,3},2, new ArrayList<Integer>(){
                    {
                        add(1);
                        add(3);
                        add(3);
                    }
                }),
                arguments(new int[]{1,2,3,2,5,2},2, new ArrayList<Integer>(){
                    {
                        add(1);
                        add(3);
                        add(3);
                        add(5);
                        add(5);
                        add(2);
                    }
                }),
                arguments(new int[]{3,4},3, new ArrayList<Integer>(){
                    {
                        add(3);
                        add(4);
                    }
                }),
                arguments(new int[]{3,3},2, new ArrayList<Integer>(){
                    {
                        add(3);
                        add(3);
                    }
                }),
                arguments(new int[]{1,3,1,2},1, new ArrayList<Integer>(){
                    {
                        add(1);
                        add(3);
                        add(3);
                        add(2);
                    }
                }),
                arguments(new int[]{3},3, new ArrayList<Integer>(){
                    {
                        add(3);
                    }
                }),
                arguments(new int[]{},3, new ArrayList<Integer>(){
                    {

                    }
                }),
                arguments(new int[]{7,1,6},1, new ArrayList<Integer>(){
                    {
                        add(7);
                        add(7);
                        add(6);
                    }
                }),
                arguments(new int[]{1,1,1},1, new ArrayList<Integer>(){
                    {
                        add(1);
                        add(1);
                        add(1);
                    }
                }),
                arguments(new int[]{1,1,1,2},1, new ArrayList<Integer>(){
                    {
                        add(1);
                        add(1);
                        add(1);
                        add(2);
                    }
                })

        );
    }
}
