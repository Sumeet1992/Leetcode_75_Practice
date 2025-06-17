package org.sumeet.miscellaneous;

/*
Write a function: class Solution { public int solution(int[] A); } that,
given an array A of N integers,
returns the smallest positive integer (greater than 0) that does not occur in A.

For example,
given A = [1, 3, 6, 4, 1, 2], the function should return 5.
Given A = [1, 2, 3], the function should return 4.
Given A = [−1, −3], the function should return 1.
Write an efficient algorithm for the following assumptions:
N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
*/

import java.util.Set;
import java.util.TreeSet;

public class SmallestPositiveInteger {

    public static void main(String[] args) {

        int[] A = {1, 3, 6, 4, 1, 2};
        System.out.println(solution(A));

        int[] B = {-1, -3};
        System.out.println(solution(B));

        int[] C = {1, 2, 3};
        System.out.println(solution(C));

        int[] D = {21, 25, 56};
        System.out.println(solution(D));
    }

    public static int solution(int[] A) {
        // Implement your solution here
        Set<Integer> uniqueElement = new TreeSet<>();

        for(int i : A){
            uniqueElement.add(i);
        }

        int i = 1;
        for(Integer n : uniqueElement){
            if(n != i){
                break;
            }
            else{
                i++;
            }
        }
        return i;

    }

}
