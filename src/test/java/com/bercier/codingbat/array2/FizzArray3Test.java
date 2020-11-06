package com.bercier.codingbat.array2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FizzArray3Test {

    @ParameterizedTest
    @MethodSource("fizzArray3DataStream")
    public void shouldReturnListOfValueFromStartToEnd(int start, int end, List expectedResult){
        FizzArray3 fizzArray3 = new FizzArray3();

        assertEquals(expectedResult, fizzArray3.fizzArray3(start,end));
    }
    static Stream<Arguments> fizzArray3DataStream(){
        return Stream.of(
                arguments( 5,10, new ArrayList<Integer>()
                        {
                                {
                                    add(5);
                                    add(6);
                                    add(7);
                                    add(8);
                                    add(9);
                                }
                        }
                        ) ,
                arguments(11,18, new ArrayList<Integer>()
                        {
                            {
                                add(11);
                                add(12);
                                add(13);
                                add(14);
                                add(15);
                                add(16);
                                add(17);
                            }
                        }
                ) ,
                arguments(1, 3, new ArrayList<Integer>()
                        {
                            {
                                add(1);
                                add(2);
                            }
                        }
                ) ,
                arguments(1,2 , new ArrayList<Integer>()
                        {
                            {
                                add(1);
                            }
                        }
                ) ,
                arguments(1,1 ,new ArrayList<Integer>()
                        {
                            {

                            }
                        }
                ) ,
                arguments(1000,1005, new ArrayList<Integer>()
                        {
                            {
                                add(1000);
                                add(1001);
                                add(1002);
                                add(1003);
                                add(1004);
                            }
                        }
                )
                );

    }
}
