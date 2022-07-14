package com.codedifferently.problem01;

import java.util.HashSet;

public class Solution {
    /**
     * You will be given an array of numbers, search the array and return the longest
     * set of consecutive numbers
     * example input - {1,3,2,10,6,5,7,8}
     * return the String "Longest Set: {5 6 7 8}"
     * Even though 1,2,3 would the first consecutive set 5,6,7,8 is longer
     * @param allNumbers
     * @return
     */
    public String findLongestConsecutiveSet(Integer[] allNumbers){

        HashSet<Integer> S = new HashSet<Integer>();
        int ans = 0;

        for (int i = 0; i < allNumbers.length; i++) {
            S.add(Integer[i]);
        }

        for (int i = 0; i < allNumbers.length; i++) {
            if (!S.contains(Integer[i] - 1)){
                int j = Integer[i];
                while (S.contains(j))
                    j++;

                if (ans < j - Integer[i])
                    ans = j - Integer[i];
            }

        }

        return ans;
    }
}
