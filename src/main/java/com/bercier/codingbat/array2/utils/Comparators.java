package com.bercier.codingbat.array2.utils;

public interface Comparators {
    //https://www.baeldung.com/java-8-sort-lambda
    //https://www.geeksforgeeks.org/java-integer-compare-method/
    public static int compareIntegersZeroLessThanAny(Integer lhs, Integer rhs) {
        if ((lhs<0 && rhs==0)) {
            return 1;
        }
        else if((rhs<0 && lhs==0)){
            return -1;
        }
        else {
            return Integer.compare(lhs,rhs);
        }
    }


    public static int compareIntegersTenGreaterThanAny(Integer lhs, Integer rhs) {
        if ((lhs>10 && rhs==10)) {
            return 1;
        }
        else if((rhs<10 && lhs==10)){
            return 1;
        }
        else {
            return Integer.compare(lhs,rhs);
        }
    }

    public static int compareIntegersZerosGreaterThanAny(Integer lhs, Integer rhs) {
        if ((lhs>0 && rhs==0)) {
            return -1;
        }
        else if((rhs<0 && lhs==0)){
            return 1;
        }
        else if((rhs>0 && lhs==0)){
            return 1;
        }
        else {
            return 0;
        }
    }

}
