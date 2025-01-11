package org.sumeet.leetcode.find_highest_altitude;

public class FindTheHighestAltitude {

    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        FindTheHighestAltitude findTheHighestAltitude = new FindTheHighestAltitude();
        int highestAltitude = findTheHighestAltitude.largestAltitude(gain);
        System.out.println(highestAltitude);
    }

    public int largestAltitude(int[] gain) {

        int[] altitude = new int[gain.length + 1];
        altitude[0] = 0;
        int maxAlt = -100;
        for(int i = 0; i< gain.length; i++){
            altitude[i+1] = gain[i] + altitude[i];
        }
        for(int j = 0; j< altitude.length; j++){
            if(altitude[j] > maxAlt){
                maxAlt = altitude[j];
            }
        }

        return maxAlt;
    }

}
