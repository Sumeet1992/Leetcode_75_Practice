package org.sumeet.leetcode.kids_with_the_greatest_number_of_candies;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

    public static void main(String[] args) {

        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;
        KidsWithTheGreatestNumberOfCandies numberOfCandies = new KidsWithTheGreatestNumberOfCandies();
        System.out.println(numberOfCandies.kidsWithCandies(candies,extraCandies));


    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int kidsSize = candies.length;
        List<Boolean> maxCandies = new ArrayList<>();
        int maxCandy = candies[0];
        int i = 1;
        while(i < candies.length){
            if(maxCandy < candies[i]){
                maxCandy = candies[i];
            }
            i++;
        }
        int j = 0;
        while(j < candies.length){
            if((candies[j] + extraCandies) >= maxCandy){
                maxCandies.add(true);
            }
            else{
                maxCandies.add(false);
            }
            j++;
        }
        return maxCandies;
    }
}
