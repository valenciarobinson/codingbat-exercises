package com.bercier.codingbat.array2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FizzArrayTest {

    @ParameterizedTest
    @MethodSource("fizzArrayDataStream")
    public void shouldReturnNewListContainingNumbersOToN(int n, List expectedResult){
        FizzArray fizzArray = new FizzArray();

        assertEquals(expectedResult, fizzArray.fizzArray(n));
    }
    static Stream<Arguments> fizzArrayDataStream(){
        return Stream.of(
                arguments(new int[]{4}, new ArrayList<Integer>(){
                    {
                        add(0);
                        add(1);
                        add(2);
                        add(3);
                    }
                }),
                arguments(new int[]{1}, new ArrayList<Integer>(){
                    {
                        add(0);
                    }
                }),
                arguments(new int[]{10},new ArrayList<Integer>(){
                    {
                        add(0);
                        add(1);
                        add(2);
                        add(3);
                        add(4);
                        add(5);
                        add(6);
                        add(7);
                        add(8);
                        add(9);
                    }
                }),
                arguments(new int[]{0}, new ArrayList<Integer>()),
                arguments(new int[]{2}, new ArrayList<Integer>(){
                    {
                        add(0);
                        add(1);
                    }
                }),
                arguments(new int[]{7},new ArrayList<Integer>(){
                    {
                        add(0);
                        add(1);
                        add(2);
                        add(3);
                        add(4);
                        add(5);
                        add(6);
                    }
                })

        );
    }
}
