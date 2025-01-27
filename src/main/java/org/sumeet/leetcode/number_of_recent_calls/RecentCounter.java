package org.sumeet.leetcode.number_of_recent_calls;

import java.util.ArrayDeque;
import java.util.Queue;

public class RecentCounter {

    Queue<Integer> counter;
    public RecentCounter() {
        counter = new ArrayDeque<>();
    }

    public int ping(int t) {

        int requests = 0;
        counter.add(t);
        for(int i : counter){
            if(i >= (t-3000) && i<= t){
                requests++;
            }
        }
        return requests;
    }
}

/*
^^^^^^^^^^^^^^^^^^^^^^^
Another better approach
^^^^^^^^^^^^^^^^^^^^^^^

class RecentCounter {
    private static final int[] records = new int[10000];
    private int start;
    private int end;
    public RecentCounter() {
        start=0;
        end=0;
    }

    public int ping(int t) {
        while(start<end && (t-records[start])>3000){
            start++;
        }
        records[end++]=t;
        return end-start;
    }
}

 */
