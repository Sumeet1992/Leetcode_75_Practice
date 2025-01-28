package org.sumeet.leetcode.dota_2_senate;

import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senate {

    public static void main(String[] args) {
        Dota2Senate dota2Senate = new Dota2Senate();
        System.out.println(dota2Senate.predictPartyVictory("DRR"));
        System.out.println(dota2Senate.predictPartyVictory("DR"));
    }

    public String predictPartyVictory(String senate) {

        Queue<Integer> dire = new LinkedList<>();
        Queue<Integer> radiant = new LinkedList<>();

        for(int i = 0; i< senate.length(); i++){
            if(senate.charAt(i) == 'D'){
                dire.add(i);
            }
            else if (senate.charAt(i) == 'R') {
                radiant.add(i);
            }
        }

        while(!dire.isEmpty() && !radiant.isEmpty()){
            int radiantIndex = radiant.poll();
            int direIndex = dire.poll();
            if(direIndex < radiantIndex){
                dire.add(direIndex + senate.length());
            }
            else{
                radiant.add(radiantIndex + senate.length());
            }
        }

        if(dire.isEmpty()){
            return "Radiant";
        }
        else{
            return "Dire";
        }

    }

}
